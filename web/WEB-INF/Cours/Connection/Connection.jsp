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
            <ul>
                <li><a href="Connect.do">Ouvrir/Fermer une connection à la SGBD MySQL</a></li>
            </ul>              
            <br/>
            <jsp:include page="../../footer.jsp"/>
        </div>
    </body>

</html:html>