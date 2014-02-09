<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>    
    <jsp:include page="head.jsp"/>
    <body>
        <div id="container">
            <jsp:include page="header.jsp"/>
            <html:form action="Action1.do" method="POST" onsubmit="alert('Calcul en cours')">
                <table>
                    <tr><td>n</td><td> <html:text property="n" size="16" maxlength="16"/></td></tr>
                    <tr><td>m</td><td><html:text property="m" size="16" maxlength="16"/></td></tr>
                    <tr><td colspan="2"><html:submit property="submit" value="Valider"/></td></tr>
                </table>
            </html:form><br/>
            <jsp:include page="footer.jsp"/>
            
            <html:errors/>
        </div>
    </body>

</html:html>