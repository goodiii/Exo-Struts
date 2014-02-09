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
            n  = <bean:write name="bean" property="n"/>
            m = <bean:write name="bean" property="m"/>
            Produit de n et m = <bean:write name="bean" property="produit"/>
            </br>
            <html:form action="/Action2.do" >
                <table>
                    <tr><td>l</td><td> <html:text property="l" size="16" maxlength="16"/></td></tr>
                    <tr><td>f</td><td><html:text property="f" size="16" maxlength="16"/></td></tr>
                    <tr><td colspan="2"><html:submit property="submit" value="Submit"/></td></tr>
                </table>
            </html:form><br/>
            <jsp:include page="footer.jsp"/>
        </div>
    </body>

</html:html>