package Control_Client;

import Control_Client.*;
import Dao.Client.DaoClient;
import java.io.IOException;
import java.sql.ResultSet;
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
@WebServlet(name = "Servlet_Getbyid_Client", urlPatterns = {"/Servlet_Getbyid_Client"})
public class Servlet_Getbyid_Client extends HttpServlet {

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
        ResultSet rs=c.getById(id);
        request.setAttribute("resultat",rs);  
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/interface_client/getbyid_client.jsp");
        dispatcher.forward(request, response);
       
    }

   
}
