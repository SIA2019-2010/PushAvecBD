<%-- 
    Document   : AfficherA
    Created on : 19 nov. 2019, 08:19:50
    Author     : adeline
--%>

<%@page import="entity.Article"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                        <link rel ="stylesheet" href="newcss2.css" type="text/css">

        <jsp:useBean id="listearticle" scope="request" class="java.util.List"></jsp:useBean> 
        <title>JSP Page</title>
    </head>
    <body>
        <h1>L'affichage d'article</h1>
        <TABLE border width = 50%>
           <tr> <TD>Identifiant article</TD>
                <TD>Designation</TD> 
                <TD>Prix </TD>
                <TD>ID Fournisseur </TD> 
                <TD>Nom Fournisseur </TD> 
                <TD>Adresse Fournisseur </TD> </tr>
            <% List<Article> lesFour=listearticle;
            for(Article cp : lesFour){%> 
           <tr>
            <td Width=15%><%=cp.getId()%></td>
            <td Width=30%><%=cp.getDesignation()%></td>
            <td Width=15%><%=cp.getPrix()%></td> 
            <td Width=15%><%=cp.getLeFournisseur().getId()%></td> 
            <td Width=15%><%=cp.getLeFournisseur().getNom() %></td>
            <td Width=15%><%=cp.getLeFournisseur().getAdresse() %></td>
            </tr><%}%> 
        </TABLE>
    </body>
</html>
