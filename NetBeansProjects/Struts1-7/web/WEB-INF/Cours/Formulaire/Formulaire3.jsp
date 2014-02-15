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
            <jsp:include page="form2.jsp"/>
            Produit de n et m = <bean:write name="Form" property="produit"/></br>
            Somme de l et de f = <bean:write name="Form" property="produit2"/></br>
            </br>
            <jsp:include page="../../footer.jsp"/>
        </div>
    </body>

</html:html>