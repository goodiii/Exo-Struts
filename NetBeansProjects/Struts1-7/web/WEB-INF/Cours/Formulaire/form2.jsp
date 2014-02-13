<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:form action="/Formulaire2.do" method="POST" onsubmit="alert('Veuillez patienter')" >
    <fieldset>
        <legend>Somme de l et f</legend>
        <table>                   
            <tr><td>l</td><td><html:text property="l" size="16" maxlength="16"/></td></tr>
            <tr><td>f</td><td><html:text property="f" size="16" maxlength="16"/></td></tr>
            <tr><td><html:submit value="Valider"/></td><td><html:cancel value="Annuler"/></td></tr>
        </table>
    </fieldset>
</html:form><br/>