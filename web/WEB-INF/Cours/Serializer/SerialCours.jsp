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
            <br/>
            <h3>Mission.2</h3>
            <p>1. le readObject() suit le process suivant (le deserializer doit absolument connaitre les classes).:</p>
            <p> - Il lit une séquence de bytes correspondant à un objet</p>
            <p> - Il désérialise l'objet à condition de connaitre sa classe </p>
            <p> - On caste le bon type d'objet </p>
            <p>Mission.3</p>
            <p>Dans cet exercice, on ne serialize qu'un seul objet. Mais tout les objets étant liés les uns aux autres par une variable frere, tout les objets vont ainsi etre sérialisés. </p>
            <p>Lors de la désérialisation, les objets freres peuvent etre appelés par la variable qui les relient (ici, frere).</p>
            <jsp:include page="../../footer.jsp"/>
        </div>
    </body>

</html:html>