<%-- 
    Document   : CreerFournisseur
    Created on : 5 nov. 2019, 11:27:14
    Author     : adeline
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Creer Fournisseur</h1>
        <form methode ="get" action="AccesArticle">
            <fieldset> 
                <legend> Informations Fournisseurs </legend> 
                <label for="nom">Nom <span class="requis">*</span></label>
                <input type ="text" name="nom" value =" " size="20" maxlength="20" /> <br/>
                <label for="adresse">Adresse <span class="requis">*</span></label>
                <input type ="text" name="adresse" value =" " size="80" maxlength="20" /> <br/>
                <tr><td>type de fournisseur</td><td>
                     <SELECT size="1" name="typ">
                <OPTION value ="National">Grand</OPTION>
                <OPTION value ="Regional">Petit</OPTION> 
                        </SELECT>
                    </td></tr>
                <input type ="hidden" name ="action" value="insererF">
            </fieldset>
            <input type="submit"value ="Valider"/>
            <input type="reset"value ="Remettre à zéro"/>
        </form>
            
                
    </body>
</html>
