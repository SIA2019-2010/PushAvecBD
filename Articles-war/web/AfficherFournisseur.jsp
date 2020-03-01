<%-- 
    Document   : AfficherFournisseur
    Created on : 9 nov. 2019, 15:15:13
    Author     : adeline
--%>

<%@page import="entity.Fournisseur"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" href="newcss2.css" type="text/css">
<jsp:useBean id="listefournisseurs" scope="request" class="java.util.List"></jsp:useBean> 
<title>Fournisseurs</title>
</head> <body>
<h1>Afficher Fournisseur</h1>
<p> <%
String attribut = (String) request.getAttribute("message"); out.println( attribut );
%> 
</p>
<TABLE border width=50%> 
    <tr> <TD>Numéro</TD>
        <TD>Nom</TD> 
        <TD>Adresse</TD>
        <TD>Type</TD> </tr>
<% List<Fournisseur> lesFour=listefournisseurs; 
for(Fournisseur cp : lesFour){%>


<tr><td Width=15%><%=cp.getId()%></td>
<td Width=15%><%=cp.getNom()%></td> 
<td Width=30%><%=cp.getAdresse()%></td>
<td Width=30%><%=cp.getTyp()%></td></tr>
<%}%>
</TABLE> 
<td Width=25%><A HREF="AccesArticle?action=vide"> Retour Menu</A></td>
</body>
</html>

