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
            <logic:notEmpty name="ConnectSQL" property="con" >
                <p><bean:write name="ConnectSQL" property="con" /><br/>
                    <bean:write name="ConnectSQL" property="stmt" /></p>
                <p>La connection a la base de données SQL a été établie</p>
                <jsp:include page="Requete.jsp"/>
            </logic:notEmpty>
            <br/>
            <logic:notEmpty name="ConnectSQL" property="requete">
                <bean:write name="ConnectSQL" property="row" />
            </logic:notEmpty>
            <jsp:include page="../../footer.jsp"/>

        </div>
    </body>
</html:html>