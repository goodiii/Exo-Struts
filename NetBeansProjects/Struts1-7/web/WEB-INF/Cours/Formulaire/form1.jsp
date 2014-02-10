<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="Formulaire1.do" method="POST" onsubmit="alert('Veuillez patienter')">
    <fieldset>
        <legend>Produit de n et m</legend>
        <table>
            <tr><td>n</td><td><html:text property="n" size="16" maxlength="16"/></td></tr>
            <tr><td>m</td><td><html:text property="m" size="16" maxlength="16"/></td></tr>
            <tr><td><html:submit value="Valider"/></td><td><html:cancel value="Annuler"/></td></tr>
        </table>
    </fieldset>
</html:form> 