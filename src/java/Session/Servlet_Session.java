package Session;

import Dao.Produit.DaoProduit;
import Dao.Produit.Produit;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SEND NUDES
 */
@WebServlet(name = "Servlet_Session", urlPatterns = {"/Servlet_Session"})
public class Servlet_Session extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
        response.setContentType("text/html");
        DaoProduit c=new DaoProduit();
        ResultSet rs=c.afficher();
    
  
        
             HttpSession newSession = request.getSession();
             newSession.setMaxInactiveInterval(24*60*60); 
            
             if(newSession.getAttribute("list_produit") ==null)
             {ArrayList<Panier> panier=new ArrayList<Panier>();
             
             newSession.setAttribute("list_produit", panier);
             }
             
try{
        rs.last();
       int number = rs.getRow();                
       rs.beforeFirst();
       newSession.setAttribute("number",number);

newSession.setAttribute("resultat",rs);
                    
                    response.sendRedirect("http://localhost:8080/Examen_Tp_Aymen/catalogue/catalogue.jsp");
}




catch (SQLException e) {
System.out.println(e.toString()); }


    
    
    }
        


        
    
        

     
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
         HttpSession newSession = request.getSession(); 
        
         
         
         int id =Integer.parseInt(request.getParameter("id"));
          DaoProduit c=new DaoProduit();
        ResultSet rs=c.afficher();
         newSession.setAttribute("resultat",rs);
            
                     
                   
                    
               ArrayList<Panier> panier =(ArrayList<Panier>) newSession.getAttribute("list_produit");
                    
                    int i = 0;
		while (i < panier.size()) {
			if(panier.get(i).getProduit().getId()==id)
                        {panier.get(i).setQuantite(panier.get(i).getQuantite()+1);break;}
                        i++;
                        }
                try{
                       if(i>=panier.size()){
                     DaoProduit daop=new DaoProduit();
                   ResultSet resu =daop.getById(id);
                     resu.first();
               int idp=resu.getInt("id");
                String lib=resu.getString("libelle");
                String cat=resu.getString("categorie"); 
                Float prix=resu.getFloat("prix"); 
                int qtn=resu.getInt("quantite_stk");
                 Produit produit =new Produit(idp,lib,cat,prix,qtn);
                   Panier panier1=new Panier(produit,1);
                  
                   panier.add(panier1);
                            
                           }
                       
                              
                }
                  catch (SQLException e) {
System.out.println(e.toString()); }
               
                  newSession.setAttribute("list_produit", panier);
          response.sendRedirect("http://localhost:8080/Examen_Tp_Aymen/catalogue/catalogue.jsp");
        
          
    }
}
   