<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<ul>
    <li><html:link forward="formulaire">Formulaire</html:link> </li>
    <li><html:link forward="connection">Connection à la base de données MySQL</html:link></li> 
    <li><html:link forward="ntiers">Cours Architecture N-Tiers 10.02</html:link></li>
    <li><html:link forward="stub">IIOP Stub</html:link></li>
    <li><html:link forward="serialCours">Cours Serialisation d'objet</html:link></li>
    <li><html:link forward="serialExo">Exo Serialisation d'objet</html:link></li>
</ul>