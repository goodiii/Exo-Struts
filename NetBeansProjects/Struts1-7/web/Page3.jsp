<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>

    <head>
        <html:base/>
    </head>
    <body bgcolor="white"><p/>
        n  = <bean:write name="bean" property="n"/>
        m = <bean:write name="bean" property="m"/></br>
        l  = <bean:write name="bean" property="l"/>
        f = <bean:write name="bean" property="f"/></br>
        Produit de n et m = <bean:write name="bean" property="produit"/></br>
        Somme de l et de f = <bean:write name="bean" property="produit2"/></br>
        </br>
        <html:form action="/Action2.do" >

        </html:form><br/>

    </body>

</html:html>