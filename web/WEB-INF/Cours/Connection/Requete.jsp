<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="Connect.do" method="POST" onsubmit="alert('Veuillez patienter')">
    <fieldset>
        <legend>Executer une Requete</legend>
        <table>
            <tr><td>Requete</td><td><html:text property="requete" size="24" maxlength="24" /></td></tr>
            <tr><td><html:submit value="Executer"/></td><td><html:cancel value="Annuler"/></td></tr>
        </table>
    </fieldset>
</html:form> 