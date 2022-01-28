package Control_Produit;

import Dao.Produit.DaoProduit;
import Dao.Produit.Produit;
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
@WebServlet(name = "Servlet_Modifier_Produit", urlPatterns = {"/Servlet_Modifier_Produit"})
public class Servlet_Modifier_Produit extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        DaoProduit daop = new DaoProduit();
        int id = Integer.parseInt(request.getParameter("id"));
     ResultSet rs= daop.getById(id);
     String etat;
    
     try
     {
     if(rs.first())
            {
        String lib = request.getParameter("libelle");
        String cat = request.getParameter("categorie");
        Float prix = Float.parseFloat(request.getParameter("prix"));
        int quantite = Integer.parseInt(request.getParameter("quantite"));
        Produit p =new Produit(id,lib,cat,prix,quantite);
        daop.modifier(p,null);
       rs.first();
        etat="<b><b><font class='yes'>Le produit d'id " +rs.getObject("id").toString() +" a été bien modifier</font></b>";
            
           }
        else
       {etat="<b><b><font class='no'>une erreur est survenue: merci de verifier l'id du produit </font></b>";}
     request.setAttribute("resultat",etat);
     RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/interface_produit/modifier_produit.jsp");
        dispatcher.forward(request, response);
            }
          catch (SQLException e) {
System.out.println(e.toString()); }
           
         
     }   
    
    }

   
