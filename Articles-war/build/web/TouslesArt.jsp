<%-- 
    Document   : TouslesArt
    Created on : 26 nov. 2019, 09:46:21
    Author     : adeline
--%>

<%@page import="entity.Fraicheur"%>
<%@page import="entity.Vetement"%>
<%@page import="java.util.List"%>
<%@page import="entity.Article"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <title>JSP Page</title>
       
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" href="newcss2.css" type="text/css">
<jsp:useBean id="listearticle" scope="request" class="java.util.List"></jsp:useBean> 
<title>Article</title>
</head> 
<body>
<h1>Afficher Article</h1>
<p> <%
String attribut = (String) request.getAttribute("message"); out.println( attribut );
%> 
</p>
<TABLE border width=50%> 
    <tr> <TD>Numéro</TD>
        <TD>designation</TD> 
        <TD>prix</TD>
        <TD>coloris</TD>
        <TD>date</TD>

    </tr>
    <%Vetement v; %>
    <%Fraicheur f; %>
<% List<Article> lesarticles=listearticle; 
for(Article art : lesarticles){%>


<tr><td Width=15%><%=art.getId()%></td>
<td Width=15%><%=art.getDesignation()%></td> 
<td Width=30%><%=art.getPrix()%></td>
<%if (art  instanceof Vetement)
{v = (Vetement)art ;%>
<td Width=30%><%=v.getColoris()%></td>
<td Width=30%> </td>
<% }
else if(art  instanceof Fraicheur)
{f = (Fraicheur)art ; %>
<td Width=30%> </td>
<td Width=30%><%=f.getDatelimite()%></td>


<%}
else {%>
<td Width=30%> </td>
<td Width=30%> </td>
<%}%>
</tr>
<%}%>
</TABLE> 
<td Width=25%><A HREF="AccesArticle?action=vide"> Retour Menu</A></td>
</body>
        
    </body>
</html>
