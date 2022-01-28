<%-- 
    Document   : catalogue
    Created on : Dec 17, 2018, 8:43:18 PM
    Author     : SEND NUDES
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet;" %>
<%@page import="java.util.ArrayList;;" %>
<%@page import="java.util.List;" %>
<%@page import="Session.Panier" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/skin.css">   
        <title>CATALOGUE</title>
        
         
        
        <script>

function load() {
                var n;
                <%ResultSet test=(ResultSet)session.getAttribute("resultat"); boolean k;if(test==null){k=false;}else{k=true;}%>
                        n=<% out.println(k); %>
                if (n===false){window.location.href="http://localhost:8080/Examen_Tp_Aymen/Servlet_Session" ;}
         
             

}
        
        </script>
    </head>
    

    <body onload="load()">
        
          <div  id="home">  
        <a href="http://localhost:8080/Examen_Tp_Aymen/index.html">
            <img src="${pageContext.request.contextPath}/css/home.png" height="60" width="60" alt="http://localhost:8080/Examen_Tp_Aymen/index.html"></a>
        </div>
        
        <hr>
           <button class="button" style="vertical-align:middle" onclick="location.href='http://localhost:8080/Examen_Tp_Aymen/Servlet_Session';"><span>Catalogue</span></button>
       
           
           
           
           
          
      
           
           
           
        <hr>
         
          
 
  
        <label ><b><font size="5">Nombre D'Items Total : <%if(session.getAttribute("number")!=null) {out.println(session.getAttribute("number").toString());}%></font></b></label>
        <br>
        <table id="tab" style="float: left; position: absolute;left: 635px">
            <tr><th>LIBELLE</th><th>PRIX</th></tr>
       
            
            
            <%  ResultSet rs = (ResultSet)session.getAttribute("resultat");
        if(rs!=null){
            out.println("<style>#tab{visibility: visible;}</style>");
           
            while(rs.next())
        {
        %>
            <tr>
                <th><% out.println(rs.getObject("libelle")); %></th>
                <td ><% out.println(rs.getObject("prix")); %></td>
                <td><form method="post" action="http://localhost:8080/Examen_Tp_Aymen/Servlet_Session"><button id="rock" type="submit" name="id"  value="<% out.print(rs.getInt("id")); %>">
      <i id="rock0">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</i>
</button></form></td>
                
                
                
            </tr>  
           <% }}%>
           
</table>
           
           <table style='float: right;'>
<% ArrayList<Panier> items=(ArrayList<Panier>) session.getAttribute("list_produit");
           

 
          if(items !=null && items.size()!=0)
          {int i=0;float total=0;
         out.println(
            "<tr><th>Libelle</th><th>Quantité</th></tr><tr><td colspan='2'><div class='vl'></div></td><td></td></tr>" );
      
          
          
          while(items.size()>i)
          {total+=items.get(i).getQuantite()*items.get(i).getProduit().getPrix();
          
               %>
               <tr>
                  
                   <td ><%out.println( items.get(i).getProduit().getLibelle());%></td>
               <td><%out.println( items.get(i).getQuantite());i++;%></td>
               
               </tr>
               <tr><td colspan="2"><div class="vl"></div></td><td></td></tr>
               <%}%>
           </table>
           

               <label style="float: right;"><b><font size="5">Total : <%out.println(total);%></font></b></label><%}%>
               
    </body>
</html>
