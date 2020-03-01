<%-- 
    Document   : Choix
    Created on : 5 nov. 2019, 11:18:04
    Author     : adeline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel ="stylesheet" href="newcss2.css" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <p>
        <%
            String attribut = (String) request.getAttribute("message"); 
            out.println(attribut);
            
            %>
        </p>
        <h1> Que voulez-vous faire ? Github is good</h1>
        <TABLE><tr>
                <td With=25%><A HREF ="CreerFournisseur.jsp"> Creer fournisseur </A></td>
                <td With=25%><A HREF ="AccesArticle?action=afficherF"> Afficher fournisseur </A></td>
                <td With=25%><A HREF ="AccesArticle?action=creerAF"> Creer Article Frais </A></td>
                <td With=25%><A HREF ="AccesArticle?action=creerV"> Creer Vetement </A></td>
                <td With=25%><A HREF ="AccesArticle?action=creerA"> Creer Article </A></td>
                <td With=25%><A HREF ="AfficherArticle.jsp"> Afficher Article </A></td>
                <td With=25%><A HREF ="AccesArticle?action=affichertouslesA"> Afficher tous les Articles </A></td>
                <td With=25%><A HREF ="Somme.jsp"> Afficher Somme d'un fournisseur </A></td>
                <td With=25%><A HREF ="RechercherF.jsp"> Recherche fournisseur </A></td>
            </tr>
    </body>
</html>
