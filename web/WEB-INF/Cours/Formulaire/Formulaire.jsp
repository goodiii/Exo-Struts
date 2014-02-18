<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<jsp:include page="../../head.jsp"/>
<body>
    <div id="container">
        <jsp:include page="../../header.jsp"/>
   
        <jsp:include page="form1.jsp"/>      
        <logic:notEmpty name="Form" property="n">
            <div class="resultat">Produit de n et m = <bean:write name="Form" property="produit"/></div>
        </logic:notEmpty>
            <br/>
        <jsp:include page="form2.jsp"/> 
        <logic:notEmpty name="Form" property="l">
            <div class="resultat">Somme de l et de f = <bean:write name="Form" property="produit2"/></div>
        </logic:notEmpty>
        <br/>
        <jsp:include page="../../footer.jsp"/>
    </div>
</body>