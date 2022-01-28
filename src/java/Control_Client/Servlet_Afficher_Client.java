package Control_Client;

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
@WebServlet(name = "Servlet_Afficher_Client", urlPatterns = {"/Servlet_Afficher_Client"})
public class Servlet_Afficher_Client extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html");
        DaoClient p=new DaoClient();
        ResultSet rs=p.afficher();
        request.setAttribute("resultat",rs);
        RequestDispatcher dispatcher;
        dispatcher = getServletContext().getRequestDispatcher("/interface_client/afficher_client.jsp");
        dispatcher.forward(request, response);
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
}
