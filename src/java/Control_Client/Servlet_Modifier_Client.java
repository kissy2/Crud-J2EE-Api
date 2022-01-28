package Control_Client;

import Control_Client.*;
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
@WebServlet(name = "Servlet_Modifier_Client", urlPatterns = {"/Servlet_Modifier_Client"})
public class Servlet_Modifier_Client extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          
              
        DaoClient daoc = new DaoClient();
        int id = Integer.parseInt(request.getParameter("id"));
     ResultSet rs= daoc.getById(id);
     String etat;
    
     try
     {
     if(rs.first())
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
        daoc.modifier(null,c);
       rs.first();
        etat="<p><b><font class='yes'>Le client d'id " +rs.getObject("id").toString() +" a été bien modifier</font></b></p>";
            
           }
        else
       {etat="<p><b><font class='no'>une erreur est survenue: merci de verifier l'id du client</font></b></p>";} 
     request.setAttribute("resultat", etat);
     RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/interface_client/modifier_client.jsp");
        dispatcher.forward(request, response);
            }
          catch (SQLException e) {
System.out.println(e.toString()); }
       
    }

   
}
