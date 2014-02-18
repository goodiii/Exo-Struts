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
            <h3>Cours de gestion de projet</h3>
            <p> Un projet est une entreprise temporaire décidée dans le but de créer un produit, un service ou un résultat unique</p>
            <p>Un projet peut être perçu comme un triangle Contenu/Cout/Délai. Il est important de répondre à ces 3 critères.</p>

            <p>Concernant la qualité du contenu, il est préférable de se limiter aux exigences du Donneur d'ordre. Les + niveaux contenus ne sont pas toujours bien perçus (ressenti de surcout/ Vente forcée).</p>
            <p>L'assurance qualité consiste que le produit finis correspondera aux attentes pré-prod.</p>

            <p>Un projet doit être découpé en sous-projets. Ces sous projets pourront être assignés à une équipe interne ou à des tiers extérieurs</p>

            <h4>Cycle de vie du projet et cyle de vie du produit</h4>
            <p>Cycle de vie projet:ensemble de phases, prenant le nom des livrables.</p>
            <p>Différencier le cycle de vie produit et le cyle de vie du projet.</p>
            <br/>
            <p> Sous MS Project, le temps d'un projet doit etre défini en semaine et non en mois.</p>
            <br/>
            <p>Cf. le PMBOK <br/>
                Tableau 3-1. Correspondances entre groupes de processus de management de projet et
                domaines de connaissance.<br/>
                Le chef de projet ne doit pas être juge et parti.<br/>
                Il trouve son équipe, la fédère, effectue un rôle de monitoring, notamment sur les aspects qualité.<br/>
                Mais il doit rester en dehors de l'aspect technique. Il peut toutefois intervenir techniquement sur d'autres projets.<br/>
                Cf. Figure 3-3. Interactions des processus de management de projet<br/>
                Donner des fourchettes de tarification et de délai dans un premier temps.<br/>
                Récupérer prject manager book of form: contient tout les docs de gestion de projets.<br/>
                -> Project Charter<br/>
                -> High-level Project and Product Requirements: Le besoin rempli par le produit: Pourquoi ce produit/livrable?<br/>
                -> Initial Risk: ne pas oublier de spécifier les riques majeurs d'échecs.  Nécessite une étude de faisabilité. Ne rien signer au hasard.  <br/>      
                -> Summary MileStones: Noter les moments remarquables (peuvent  être interne(fonctionnalitée ok,...) ou externe(réunion client pour controle de l'avancée,...). Ils peuvent être associés à des paiements.<br/>
                -> Success critere possible en informatique: % de bug<br/>
                -> Acceptance criteria: A Spécifier obligatoirement.<br/>
                -> Staffing Decisions: Les responsables du perso peuvent être multiples.<br/>
                -> ..<br/>
                La project chart peut être découpée en partie et signer à chaque sous partie.<br/>

                Les qualités rédactionnelles sont importantes. Les documents doivent etre parfaitement renseignés.<br/>
                cf 5.1.3 Recueillir les exigences : données de sortie
                .3 Matrice de traçabilité des exigences.
                Dans le WBS, ne pas oublier la gestion de projet. <br/>
                Dans le WBS, on découpe les tâches a executer de facon hierarchique, jusqu'au plus bas niveau.<br/>                 
                Les sections du WBS sont sequentielles (une par une, l'une après l'autre). Chaque section est donc composée de tâches.<br/>
                Chaques sections et chaques tâches ont une durée estimée.
                Une section management de projet encadre la durée entiere du projet.
            </p>

            <jsp:include page="../../footer.jsp"/>
        </div>
    </body>
</html:html>