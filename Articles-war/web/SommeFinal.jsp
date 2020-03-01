<%-- 
    Document   : SommeFinal
    Created on : 19 nov. 2019, 11:30:32
    Author     : adeline
--%>

<%@page import="entity.Fournisseur"%>
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
            String attribut = (String)request.getAttribute("message2"); 
            out.println(attribut);
            %>
        </p>
    </body>
</html>
