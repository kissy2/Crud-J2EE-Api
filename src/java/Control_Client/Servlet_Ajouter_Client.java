/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Client;

import Dao.Client.DaoClient;
import Dao.Client.Client;
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
@WebServlet(name = "Servlet_Ajouter_Client", urlPatterns = {"/Servlet_Ajouter_Client"})
public class Servlet_Ajouter_Client extends HttpServlet {


 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         
        
        int id = Integer.parseInt(request.getParameter("id"));
        DaoClient daoc = new DaoClient();
        String etat;
        ResultSet rs=daoc.getById(id);
        try{
       if(rs.first()==false)
       {
           
           
           
           String nom = request.getParameter("nom");
           String prenom = request.getParameter("prenom");
            String email = request.getParameter("email");
           int age = Integer.parseInt(request.getParameter("age"));
           String sexe = request.getParameter("sexe");
            String login = request.getParameter("login");
           String password = request.getParameter("password");
            String ncompte_bancaire = request.getParameter("banc");
           String pays = request.getParameter("pays");
           Client c =new Client(id,nom,prenom,email,age,sexe,login,password,ncompte_bancaire,pays);
           daoc.ajouter(null,c);
           etat="<b><font class='yes'>Le client a été ajouté avec succés</font></b>";
       }
       else
       {etat="<b><font class='no'>une erreur est survenue: le client existe deja</font></b>";}
       
       request.setAttribute("resultat", etat);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/interface_client/ajouter_client.jsp");
        dispatcher.forward(request, response);
        }
     catch (SQLException e) {
System.out.println(e.toString()); }
       
    }


}
