<%-- 
    Document   : supprimer_client
    Created on : Dec 16, 2018, 10:14:18 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/skin.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>supprimer client</title>
    </head>
    <body>
        
        <div  id="home">  
        <a href="http://localhost:8080/Examen_Tp_Aymen/interface_client/link_crud_client.html">
            <img src="${pageContext.request.contextPath}/css/client.jpg" height="60" width="60" alt="http://localhost:8080/Examen_Tp_Aymen/interface_produit/link_crud_produit.html"></a>
        </div>  
        <div  id="home1">  
        <a href="http://localhost:8080/Examen_Tp_Aymen/index.html">
            <img src="${pageContext.request.contextPath}/css/home.png" height="60" width="60" alt="http://localhost:8080/Examen_Tp_Aymen/index.html"></a>
        </div>
        <hr>
        <h1>Supprimer Un Client </h1>
        
        
        <hr>
        
               <form action="http://localhost:8080/Examen_Tp_Aymen/Servlet_Supprimer_Client" method="post">
     <label for="id">ID&nbsp;&nbsp;&nbsp;&nbsp;</label><input min="0" type="number" id="id" name="id"  placeholder="Veullez entrer : l'id du client à supprimer " required >&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="Supprimer Client">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Annuler">
    </form>
        <br>
        <%String rs =(String)request.getAttribute("resultat");
        if (rs!=null) {out.println(rs);}   
            %>
    </body>
</html>
