<%-- 
    Document   : ajouter_client
    Created on : Dec 17, 2018, 2:56:54 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/skin.css">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajout CLient</title>
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
        <h1>Ajouter Un Client</h1>
 
        <hr>
 <%String rs =(String)request.getAttribute("resultat");
        if (rs!=null) {out.println(rs);}   
            %>
            <form action="http://localhost:8080/Examen_Tp_Aymen/Servlet_Ajouter_Client" method="post">
                     


                <table>
                    <tr><th><label for="id">ID :*</label></th><td><input min="0" type="number" id="id" name="id"  placeholder="Veullez entrer : l'id du client" required ></td></tr>
                <tr><th><label for="nom">NOM :*</label></th><td><input type="text" id="nom" name="nom" required placeholder="Veullez entrer : le nom du client" size="27"></td></tr>
                <tr><th><label for="pre">PRENOM :*</label></th><td><input type="text" id="pre" name="prenom" required placeholder="Veullez entrer : le prenom du client" size="29"></td></tr>
                <tr><th><label for="email">EMAIL :*</label></th><td><input type="email" id="email" name="email" required placeholder="Veullez entrer : l'email du client" size="25"></td></tr>
                <tr><th><label for="age">AGE :*</label></th><td><input min="10" type="number" id="age" name="age"  placeholder="Veullez entrer : l'age du client" required ></td></tr>
                <tr><th>SEXE :*</th><td><label>Homme<input type="radio"  name="sexe" value="homme" required></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>Femme<input type="radio" name="sexe" value="femme" ></label></td></tr>
                <tr><th><label for="login">LOGIN :*</label></th><td><input type="text" id="login" name="login" required placeholder="Veullez entrer : lidentifiant client" size="27"></td></tr>
                <tr><th><label for="password">PASSWORD :*</label></th><td><input type="password" id="password" name="password" required placeholder="Veullez entrer : le mot de passe " size="27"></td></tr>
                <tr><th><label for="banc">N_COMPTE_BANCAIRE :*</label></th><td><input type="text" id="banc" name="banc" required placeholder="Veullez entrer : le n_cpt_bancaire" size="28"></td></tr>
                <tr><th><label for="pays">PAYS :</label></th><td><input type="text" id="pays" name="pays"  placeholder="Veullez entrer : le pays du client " size="27"></td></tr>
               
                
                
                
                <tr><td colspan="2"><input type="submit" value="Ajouter Client">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="Annuler"></td></tr>
                
                
                </table>
            </form>
        
        </body>
</html>
