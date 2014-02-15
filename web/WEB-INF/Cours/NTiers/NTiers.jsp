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
            <h2>Architecture N-Tiers</h2>
            <p>Ref.: 404-J2SE (CORBA en JAVA)</p>
            <p>RPC: Remote Procedure Call</p>
            <p>Corba 1990 (archi N-Tiers RPC).
                Pour réutiliser l'existant COBOL, on découpe COBOL en modules. Mais cela n'a pas fonctionné???????????
                Interface Definition Language (IDL) : Fichier interface de l'ensemble des methodes accessibles à distance.</p>
            <p> Part1: hello.idl</p>
            <p> Contenu de hello.idl:</p>
            <p>    module HelloApp { <br/>
                interface Hello { <br/>
                string sayHello();<br/>
                oneway void shutdown();<br/>
                };<br/>
                };<br/><br/>
                On notera les ; derriere les } (comme en C++). <br/><br/>
                Part2: hello.idl  <br/>
                Dans  une invite de commandes :<br/>
                idlj -fall Hello.idl<br/>

                A partir du dossier ou se trouve hello.idl : tree /F HelloApp<br/>
                Le dossier HelloApp a été créé. </p>
            <p> Part3: HelloServer.java</p>
            Crée une instance de helloImpl et l'introduit dans le registry ORB<br/>
            <p> Part4: HelloClient.java</p>
            <p>Ici, on obtient un représentant local de l'objet distant</p>
            <p> Part5(Mission6): Examinons les états de connections</p>
            <p> Dans l'invite de commande:</p>
            <p> start   orbd                 -ORBInitialPort    1050    -ORBInitialHost (on lance le server ORBD, 1050 est le port d ecoute.)</br>
                start   java HelloServer     -ORBInitialPort    1050    -ORBInitialHost   localhost (On lance le helloserver qui se connecte au server ORBD grace aux coordonnées, localhost correspond a l ip du server ORDB)</br>
                java    HelloClient          -ORBInitialPort    1050    -ORBInitialHost   localhost (On lance le client qui se connecte au server ORDB)</br>

                IOR = Interoperable Object Reference</p>
            <p>Entre chaque opération, lancez un netstat -ano pour suivre l’état des connexions liées à cet exemple</p>
            <p>1.Le client recoit les coordonnées du registry </p>
            <p>2.Il se connecte au registry et demande à travailler avec l'objet distant inscrit dans le nom "hello" </p>
            <p>3.Le registry envoie un représentant de l'objet distant </p>
            <p>4.Le client travaille avec ce représentant local(= proxy = stub) de l'objet distant </p>
            <p> Veuiller à ce que les fichiers dans le HelloApp soient générés </p>
            
            RPC: note du 12.02.
            
            <p>1. On lance le registry</p>
            <p>2. L'objet distant est créé et exposé sur le net</p>
            <p>3. l'objet distant est inscrit dans le registry</p>
            <p>4. Le client récupère le stub  associé à l'objet distant</p>
            <p>5. le client utilise le stub pour accéder à l'objet distant</p> 




            <jsp:include page="../../footer.jsp"/>

            <html:errors/>
        </div>
    </body>

</html:html>