package Control_Produit;

import Dao.Produit.DaoProduit;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SEND NUDES
 */
@WebServlet(name = "Servlet_Supprimer_Produit", urlPatterns = {"/Servlet_Supprimer_Produit"})
public class Servlet_Supprimer_Produit extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.setContentType("text/html");
        int id =Integer.parseInt(request.getParameter("id"));
       DaoProduit p=new DaoProduit();
        String etat;
        ResultSet rs=p.getById(id);
        try{
       if(rs.first()==false)
       {etat="<b><font class='no'>une erreur est survenue: merci de verifier l'id du produit</font></b>";} 
       else
       {
           rs.first();
           etat="<b><font class='yes'>Le Produit d'id " +rs.getObject("id").toString() +" à été supprimer</font></b>";
           p.supprimer(id);
       }
        
        request.setAttribute("resultat",etat);  
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/interface_produit/supprimer_produit.jsp");
        dispatcher.forward(request, response);
       }
  catch (SQLException e) {
System.out.println(e.toString()); }
    }
    
     
    }

   

