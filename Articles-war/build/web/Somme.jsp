<%-- 
    Document   : Somme
    Created on : 19 nov. 2019, 11:29:18
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
            <h1>Quel fournisseur </h1>
        <form method="get" action="AccesArticle">
        <fieldset>
        <legend> Recherche fournisseur </legend>
        <label for="identifiantFournisseur">Num Fournisseur <span class="requis">*</span></label>
        <input type="text" id="identifiantFournisseur" name="identifiantFournisseur" value="" size="20" maxlength="20" /><br/>
        <input type ="hidden" name ="action" value="afficherSomme">
        </fieldset>
            <input type="submit"value ="Valider"/>
            <input type="reset"value ="Remettre à zéro"/>
        </form>
    </body>
</html>
