<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>


<header id="header">
    
    <div id="banniere"><h1 style="text-align:center">D4 S!T3</h1></div>
    <nav id="nav">
        <ul id="ul_nav">
            <li class="li_nav"><html:link forward="accueil">Accueil</html:link></li> 
            <li class="li_nav"><html:link forward="cours">Cours</html:link></li> 
            <li class="li_nav"><html:link forward="projets">Projets</html:link></li> 
            <li class="li_nav"><html:link forward="contact">Contact</html:link></li> 
        </ul>
    </nav>
</header>
