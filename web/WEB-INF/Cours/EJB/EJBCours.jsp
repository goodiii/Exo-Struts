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
            <h3>Enterprise Java Bean</h3>
            <p>Cf. Java Community Process<br/>
                L'ouverture de Java et la transparance des process a séduit une grande partie des entreprises. De nombreuses grandes entrprises ont tenté l'aventure. A Jee 1.2, 18 entreprises sont certifiés. A jee 1.6, ils n'en restent que 8. La course est intense et seul quelqu'uns parviennent à survivre.<br/>
            </p>
            <h4>Container Jee complet</h4>
            <p> cf. Les containers d'EJB.<br/>
                L'idée des EJB vient de IBM<br/>
            </p>
            <a href="../../../RESSOURCES/Documents/EJB/les containers d'EJB.doc">lien vers le fichier EJB container</a>
            <p> Les container WebSphere et WebLogic sont utilisés actuellement. Ceux sont des bonnes solutions</p>
            <p> On notera que Jboss utilise TomCat. Jboss contient d'ailleurs un ensemble de serveurs qui communiquent.<br/>
                Lorsque l'on lance le serveur JBoss, si on observe les ports TCP en écoute (netstat -ano), on remarque cette multitude de serveurs. Le port 8080 correspond à JBoss. On obtient son PID (process Id). Quelques lignes en dessous, on retrouve une 10aine de lignes où la connection est établie avec le mm PID.<br/>    
                Pour voir plus en détail: https://community.jboss.org/wiki/UsingJbossBehindAFirewall <br/>           
                Pour lancer JBoss, on peut faire cmd: run--host=0.0.0.0<br/>

                Lors de la création du build, l'EJB doit être mis en .jar dans JBoss<br/>

                Mission 3.<br/>
                Les annotations @local et @Remote dans les interfaces indiquent que les méthodes sont accessibles depuis l'extérieur.<br/>
                PremierEJB est 'lié' à deux listeners TCP: @local et @remote.<br/>
                Il existe 2 annotations différentes, l'une pour les clients en local et l'autre pour les clients extérieurs.<br/>
                Lors du déploiement de la webapp sur le server JBoss, l'EJB va être ajouté au registry, les méthodes de l'EJB vont devenir accessibles aux clients par le biais des interfaces, en local ou ext. (remote) suivant les annotations, les classes vont être copiés. Tout ceci à partir du .jar copié dans le \jboss6\server\default\deploy.<br/> 
                La webapp ne dispose pas de client, nous ne pouvons pas la tester immédiatement. Voir mission 4.<br/>
                Mission 4<br/>

                Les étapes du processus sont:<br/>
                1. Envoi du lookup("PremierEJB/remote") du client vers le registry qui le retourne au client<br/>
                2. Le client renvoit le stub vers le StubRemote.<br/>
                3. Le stubRemote s'adresse par TCP/IP à l'interface remote du server<br/>
                4. L'interface tape dans l' EJB (PremierEJB) qui va chercher les méthodes du Pojo<br/>
                5. PremierEJB renvoit la méthode par l'interface remote en TCP/IP vers le stubRemote<br/>
                6. Les résultats de la requete sont renvoyé au client<br/>

                Mission 5 et 6.<br/>

                Exo sup.: <br/>
                - Ecrivez un EJB qui expose une méthode String getEntrée()<br/>
                - Placez votre EJB dans JBoss<br/>
                - Ecrivez un client distant qui accède à l'EJB<br/>

                Dans le cadre de la mission6, le fichier .ear correspond à un fichier compressé qui regroupe des .jar (qui contiennent des classes) et un .war (qui contient une webapp).<br/>
                On notera les annotations @stateless et @stateful dans les session beans.<br/>
                Pour lancer la webapp: http://localhost:8080/webapp/StatefulServlet<br/>
                Le container ne doit pas trouver les informations laissées par le premier client. C'est le cas en @stateful. Chaque client à sa session. Dans le cas du @stateless, c'est le container qui fait selon son humeur. A éviter donc.<br/>
                En @stateless, le container n'a pas pour vocation de créer une nouvelle instance de la classe.<br/>


                Mission 7:<br/>
                1. Créer 2 .jar l'un contenant un SessionBean @Stateful, l'autre un SessionBean @Stateless.<br/>
                Ils implémentent une interface @remote. (Mettez un compteur dans les deux sessions beans).<br/>
                2. Créer deux clients qui accèdent aux sessions beans.<br/>
                cf correction dans /Documents.<br/>
                Dans cette mission, le nombre de classes a ete réduite. Pour faire fonctionner le build: ant etape1 puis ant etape2 (pour le stateful), puis 3 et4 (pour le stateles)<br/>

                Mission 8:<br/>
                1. Ecrire un client qui s'adresse au registry,<br/>
                2. Le client s'adresse à un EJB qui s'adresse au registry<br/>
                3. Le 1er EJB s'adresse à un 2ème EJB<br/>
                
            </p>  
            <jsp:include page="../../footer.jsp"/>           
        </div>
    </body>
</html:html>