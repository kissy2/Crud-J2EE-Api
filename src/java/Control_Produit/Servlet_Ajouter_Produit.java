/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "Servlet_Ajouter_Produit", urlPatterns = {"/Servlet_Ajouter_Produit"})
public class Servlet_Ajouter_Produit extends HttpServlet {


 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        int id = Integer.parseInt(request.getParameter("id"));
        DaoProduit daop = new DaoProduit();
        String etat;
        ResultSet rs=daop.getById(id);
        try{
       if(rs.first()==false)
       {
           
           
           
           String lib = request.getParameter("libelle");
           String cat = request.getParameter("categorie");
           Float prix = Float.parseFloat(request.getParameter("prix"));
           int quantite = Integer.parseInt(request.getParameter("quantite"));
           Produit p =new Produit(id,lib,cat,prix,quantite);
           daop.ajouter(p,null);
           etat="<b><b><font class='yes'>Le produit a été ajouté avec succés</font></b>";
       }
       else
       {etat="<b><b><font class='no'>une erreur est survenue: le produit existe deja</font></b>";}
       
       request.setAttribute("resultat", etat);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/interface_produit/ajouter_produit.jsp");
        dispatcher.forward(request, response);
        }
     catch (SQLException e) {
System.out.println(e.toString()); }
        
       
       
    


}
}