<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>    
    <jsp:include page="../../head.jsp"/>
    <body>
        <div id="container">
            <jsp:include page="../../header.jsp"/>
            <html:form action="StubAction.do" method="POST" onsubmit="alert('En Recherche du Stub')">
                <fieldset>
                    <legend>Appeler un Stub</legend>
                    <table>
                        <tr><td>Nom du Stub</td><td><html:text property="stub" size="16" maxlength="16"/></td></tr>
                        <tr><td><html:submit value="Valider"/></td></tr>
                    </table>
                </fieldset>
            </html:form><br/>
            <jsp:include page="../../footer.jsp"/>

            <html:errors/>
        </div>
    </body>

</html:html>