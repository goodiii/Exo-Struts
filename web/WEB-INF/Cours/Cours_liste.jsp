<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<h3>Cours et Exo disponibles</h3>
<h4>Formulaires</h4> 
<ul>
    <li><html:link forward="formulaire">Formulaire</html:link></li>
    </ul>
    <h4>Connections aux bases de données</h4> 
    <ul>
        <li><html:link forward="connection">Connection à la base de données MySQL</html:link></li> 
    </ul>
    <h4>Architectures N-Tiers</h4> 
    <ul>
        <li><html:link forward="ntiers">Cours Architecture N-Tiers 10.02</html:link></li>
    <li><html:link forward="stub">IIOP Stub</html:link></li>
    </ul>
    <h4>Sérialisation d'objet</h4> 
    <ul>
        <li><html:link forward="serialCours">Cours Serialisation d'objet</html:link></li>
    <li><html:link forward="serialExo">Exo Serialisation d'objet</html:link></li>
    </ul>
    <h4>EJB</h4>
    <ul>
        <li><html:link forward="EJBCours">Cours sur les EJB</html:link></li>
    </ul>
    <h4>Gestion de projet</h4> 
    <ul>
        <li><html:link forward="gestionProjetCours">Cours de gestion de projet</html:link></li>
</ul>