<%-- 
    Document   : Fraicheur
    Created on : 17 nov. 2019, 10:18:26
    Author     : adeline
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Fournisseur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                        <link rel ="stylesheet" href="newcss2.css" type="text/css">

              <jsp:useBean id="listefournisseurs" scope="request" class="java.util.List"></jsp:useBean> 
                <title>JSP Page</title>
                </head>
                <body>
                  <h1>Creation article frais </h1>
                <% List<Fournisseur>lesFour = listefournisseurs; %>
                <div>
                <form method="get" action="AccesArticle">
                <fieldset>
                <legend>Informations Articles </legend>
                <label for="identifiantFournisseur">identifiant <span class="requis">*</span></label>
                <%--<input type="text" id="identifiantFournisseur" name="identifiantFournisseur" value="" size="20" maxlength="20" />
                <br/>--%>
                <select name="identifiantFournisseur">
                <% for (Fournisseur f :lesFour) {%>
                <option value ="<%=f.getId()%>"><%=f.getNom()%></option> <% }%>
                </select>
                <br />
           
                <label for="designation">Designation <span class="requis">*</span></label>
                <input type ="text" name="designation" value =" " size="80" maxlength="20" /> <br/>
                <label for="prix">Prix <span class="requis">*</span></label>
                <input type ="double" name="prix" value =" " size="20" maxlength="20" /> <br/>
                <label for="limit">date limite <span class="requis">*</span></label>
                <input type ="date" name="limit" value =" " size="20" maxlength="20" /> <br/>
                <input type ="hidden" name ="action" value="docreerAF">
            </fieldset>
            <input type="submit"value ="Valider"/>
            <input type="reset"value ="Remettre à zéro"/>
        </form>
            
    </body>
</html>
