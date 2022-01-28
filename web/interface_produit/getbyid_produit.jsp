<%-- 
    Document   : getbyid_produit
    Created on : Dec 16, 2018, 10:15:04 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet;" %>
<!DOCTYPE html>
<html>
    <head>
                   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/skin.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>getbyid produit</title>
    </head>
    

<body >
         <div  id="home">  
        <a href="http://localhost:8080/Examen_Tp_Aymen/interface_produit/link_crud_produit.html">
            <img src="${pageContext.request.contextPath}/css/produit.png" height="60" width="60" alt="http://localhost:8080/Examen_Tp_Aymen/interface_produit/link_crud_produit.html"></a>
        </div>  
        <div  id="home1">  
        <a href="http://localhost:8080/Examen_Tp_Aymen/index.html">
            <img src="${pageContext.request.contextPath}/css/home.png" height="60" width="60" alt="http://localhost:8080/Examen_Tp_Aymen/index.html"></a>
        </div>
        <hr>
        
        <h1>Récupérer un Produit</h1>
        <hr>
        <form action="http://localhost:8080/Examen_Tp_Aymen/Servlet_Getbyid_Produit" method="post">
     <label for="id">ID&nbsp;&nbsp;&nbsp;&nbsp;</label><input min="0" type="number" id="id" name="id"  placeholder="Veullez entrer : l'id du produit" required >&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="Getbyid" onclick="myFunction()">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Annuler">
    </form>
        <br>
                        <table id="tab">
            <tr><th>ID</th><th>LIBELLE</th><th>CATEGORIE</th><th>PRIX</th><th>QUANTITE STOCK</th></tr>
      <%  ResultSet rs = (ResultSet)request.getAttribute("resultat");
      if(rs!=null){  
      if(rs.first()){
          out.println("<style>#tab{visibility: visible;}</style>");
        
        %>
           <tr>
                <th><% out.println(rs.getObject("id")); %></th>
                <td><% out.println(rs.getObject("libelle")); %></td>
                <td><% out.println(rs.getObject("categorie")); %></td>
                <td><% out.println(rs.getObject("prix")); %></td>
                <td><% out.println(rs.getObject("quantite_stk")); %></td>
                
            </tr>  
            <% }else{%><%out.print("<p><b><font class='no'>ID Incorrecte ! merci de saisir une nouvelle</b></font></p>");}
}


           %>
                        </table>
        
       
    </body>
</html>
