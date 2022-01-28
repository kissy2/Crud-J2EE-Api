    <%-- 
    Document   : afficher.jsp
    Created on : Dec 14, 2018, 11:52:02 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet;" %>
<!DOCTYPE html>
<html>
   

    <head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/skin.css">    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>afficher produit</title>
    </head>
    <body>
        
        <div  id="home">  
        <a href="http://localhost:8080/Examen_Tp_Aymen/interface_produit/link_crud_produit.html">
            <img src="${pageContext.request.contextPath}/css/produit.png" height="60" width="60" alt="http://localhost:8080/Examen_Tp_Aymen/interface_produit/link_crud_produit.html"></a>
        </div>  
        <div  id="home1">  
        <a href="http://localhost:8080/Examen_Tp_Aymen/index.html">
            <img src="${pageContext.request.contextPath}/css/home.png" height="60" width="60" alt="http://localhost:8080/Examen_Tp_Aymen/index.html"></a>
        </div>
        
        <hr>
           <button class="button" style="vertical-align:middle" onclick="location.href='http://localhost:8080/Examen_Tp_Aymen/Servlet_Afficher_Produit';"><span>Afficher Les Produits</span></button>
       
        <hr>
        <table id="tab">
            <tr><th>ID</th><th>LIBELLE</th><th>CATEGORIE</th><th>PRIX</th><th>QUANTITE STOCK</th></tr>
       
            
            
            <%  ResultSet rs = (ResultSet)request.getAttribute("resultat");
        if(rs!=null){
            out.println("<style>#tab{visibility: visible;}</style>");
            while(rs.next())
        {
        %>
            <tr>
                <th><% out.println(rs.getObject("id")); %></th>
                <td><% out.println(rs.getObject("libelle")); %></td>
                <td><% out.println(rs.getObject("categorie")); %></td>
                <td><% out.println(rs.getObject("prix")); %></td>
                <td><% out.println(rs.getObject("quantite_stk")); %></td>
                
            </tr>  
           <% }}%>
</table>
    </body>
</html>
