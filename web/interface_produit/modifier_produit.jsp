<%-- 
    Document   : modifier
    Created on : Dec 16, 2018, 10:13:53 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
              <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/skin.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>modifier produit</title>
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
       
        <h1>Modifier Un Produit</h1>
<hr><%String rs =(String)request.getAttribute("resultat");
if(rs!=null){out.println(rs);}

%>
            <form action="http://localhost:8080/Examen_Tp_Aymen/Servlet_Modifier_Produit" method="post">
                     


                <table>
                    <tr><th><label for="id">ID :*</label></th><td><input min="0" type="number" id="id" name="id"  placeholder="Veullez entrer : l'id du produit"  required></td></tr>
                <tr><th><label for="lib">LIBELLE *</label></th><td><input type="text" id="lib" name="libelle"  placeholder="Veullez entrer : la libelle du produit" size="32" required></td></tr>
                <tr><th><label for="cat">CATEGORIE :</label></th><td><input type="text" id="cat" name="categorie"  placeholder="Veullez entrer : la categorie du produit" size="32" ></td></tr>
                <tr><th><label for="pri">PRIX *</label></th><td><input min="0" type="number" id="pri" name="prix"  placeholder="Veullez entrer : le prix du produit" size="32" required></td></tr>
                <tr><th><label for="qtn">QUANTITE_STK :*</label></th><td><input type="number" id="qtn" name="quantite"  placeholder="Veullez entrer : la quantite du produit" size="32" required></td></tr>
                <tr><td colspan="2"><input type="submit" value="Modifier Produit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Annuler"></td></tr>
                
                
                </table>
            </form>
    </body>
</html>
