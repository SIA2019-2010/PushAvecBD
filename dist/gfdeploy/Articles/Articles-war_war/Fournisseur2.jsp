<%-- 
    Document   : Fournisseur2
    Created on : 26 nov. 2019, 11:06:00
    Author     : adeline
--%>

<%@page import="entity.Fournisseur"%>
<<%@page import="entity.Article"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<jsp:useBean id="four" scope="session" class="Fournisseur"></jsp:useBean>
<title>Un fournisseur</title> </head>
<body>
<h1>Afficher Fournisseur</h1>
<tr>   
<td Width=15%><%=four.getId()%></td>
<td Width=30%><%=four.getNom()%></td> 
<td Width=15%><%=four.getAdresse()%></td> 
<td Width=15%><%=four.getTyp()%></td>
</tr> 
<hr>
<TABLE>
<tr>
<td Width=25%><A HREF="AccesArticles?action=vide"> Retour Menu</A></td>
</tr>
</TABLE> 
</body>
</html>
