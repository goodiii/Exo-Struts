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
            <p> Le délai est différent de la durée: la durée correspond au temps travaillé tandis que le délai est égal au temps travaillé + le temps non-travaillé.</p>
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
                Récupérer project manager book of form: contient tout les docs de gestion de projets.<br/>
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
                cf 5.1.3 Recueillir les exigences : données de sortie<br/>
                .3 Matrice de traçabilité des exigences.</p>

            <h3>Réponse à un appel d'offre</h3>

            <p> Dans un premier temps, il faut identifier les stackholders: le sponsor (qui porte le projet?), les utilisateurs (qui va utiliser le livrable?), les Business Partners (Qui va contribuer au projet?, ex:apport financier),..<br/> 

            <h4>Réalisation du WBS </h4>
            <p>Le WBS est un découpage organisationel des tâches à éxecuter, sous forme hiérarchique.<br/>
                On peut commencer le WBS en intégrant une partie gestion de projet. <br/>                
                Les sections du WBS peuvent être sequentielles (une par une, l'une après l'autre). Chaque section est donc composée de tâches.<br/>
                Le coté séquentielle n'apparait pas dans le WBS.  
                Dans le cadre d'un projet de type informatique, le WBS se compose la plupart du temps d'une section développement, qui va détailler les tâches nécessaires à la production du logiciel.<br/>
                Une section test peut être créer à part entière pour réaliser les tests chez le client.<br/>
                Une section formation s'avère pertinente pour former les clients à l'utilisation du logiciel.<br/>
                Chaques sections et chaques tâches ont une durée estimée ainsi que des ressources nécessaires (humaines/financières). Elles seront utiles pour le GANTT mais n'apparaissent pas dans le WBS qui reste une simple organisation hierarchique.<br/>
            </p>
            <h4>Créer un échéancier</h4>
            <h5> Introduction</h5>
            <p>Il faut respecter l'ordre suivant: <br/>
                1.définir les tâches (demander au techniciens).<br/>
                2.Ordonnancer ces tâches (PERT, Réseaux, GANTT).<br/>
                3.Calculer la durée/travail en introduisant les ressources (génériques puis réelles).<br/>
                4.Coller au plus proche de la réalité: appliquer les calendriers (projet, tâches, ressources, priorités)<br/>
                5.Optimiser le réseau de tâches (marges, chemin critique).<br/>
                6.Résoudre les conflits (suractivités, heures sup..)<br/>

                Il faut prévoir a capacité illimité: il est toujours possible de faire sous-traiter si les ressources ne sont pas disponibles en internes<br/>
                Le délai peut être déduit soit par le travail, soit par la durée, soit par les ressources.<br/>
                Le tableau de dépendance. <br/>
                Tableau à double entrée reliant les tâches à réaliser et l'ordre à respecter.<br/>
            </p>
            <table>
                <tr><td>Ancetre</td><td>tache</td><td>ordre</td></tr>
                <tr><td>-</td><td>tache1</td><td>1</td></tr>
                <tr><td>tache1</td><td>tache2</td><td>2</td></tr>
                <tr><td>tache1+tache2</td><td>tache3</td><td>3</td></tr>     
            </table>

            <p>L'ancetre correspond à la tâche à accomplir pour réaliser la tâche indiquée<br/>
                l'ordre indique la phase dans laquelle se trouve la tâche</p>

            <h4>La méthode PERT Program Evaluation & Review Technic</h4>
            <p>Une représentation de tâches sous forme de vecteurs qui peuvent être liés les unes aux autres (la fin de l'un déclenche le début de l'autre).
                Les ronds symbolisent des étapes (début/fin)</p>
            <h4>La méthode des potentiels (MPM)</h4>
            <p>La mm que la méthode PERT mais les vecteurs sont remplacés par des boites, dont les étapes de fin et débuts sont symbolisés par la droite et la gauche de la boite.</p>
            <h4>Le formalisme réseau</h4>
            <p>La mm que MPM sauf que ???</p>
            <h5>Etablir un planning</h5>
            <p>Principe de prudence<br/>
                On commence les tâches le plus tot possible
                
                <jsp:include page="../../footer.jsp"/>
        </div>
    </body>
</html:html>