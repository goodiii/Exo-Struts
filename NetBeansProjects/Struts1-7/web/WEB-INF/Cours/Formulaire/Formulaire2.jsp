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
            <jsp:include page="form1.jsp"/>
            <p>Produit de n et m = <bean:write name="Form" property="produit"/></p>
            <jsp:include page="form2.jsp"/>
            <br/>
            <jsp:include page="../../footer.jsp"/>
        </div>
    </body>

</html:html>