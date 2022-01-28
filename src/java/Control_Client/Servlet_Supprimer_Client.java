package Control_Client;

import Control_Client.*;
import Dao.Client.DaoClient;
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
@WebServlet(name = "Servlet_Supprimer_Client", urlPatterns = {"/Servlet_Supprimer_Client"})
public class Servlet_Supprimer_Client extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
                 response.setContentType("text/html");
        int id =Integer.parseInt(request.getParameter("id"));
       DaoClient c=new DaoClient();
        String etat;
        ResultSet rs=c.getById(id);
        try{
       if(rs.first()==false)
       {etat="<b><font class='no'>une erreur est survenue: merci de verifier l'id du client</font></b>";} 
       else
       {
           rs.first();
           etat="<b><font class='yes'>Le Client d'id " +rs.getObject("id").toString() +" à été supprimer</font></b>";
           c.supprimer(id);
       }
        
        request.setAttribute("resultat",etat);  
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/interface_client/supprimer_client.jsp");
        dispatcher.forward(request, response);
       }
  catch (SQLException e) {
System.out.println(e.toString()); }
       
    }

   
}
