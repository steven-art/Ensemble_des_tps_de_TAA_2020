TP2 TAA : Des Servlets à la notion de service
=============================================

Objectif:
Mise en place des servets qui correspond au vu de notre application et utilisation de jpa et mise en place d'un architecture Rest.
-------------------------------------
Réalisation:
Pour la réalisation du tp2 la première partie est le projet TP2 et la seconde partie du TP correspond au projet JaxRSOpenAPI-master.

dans un premier temps il faillait mettre en place d'une servlet qui retournait des reponses en fonction des requetes envoyées.
il y a deux servlets celle CardServlet et UserInfo il est possible de testé apres avoir lancer jetty les url suivente:


http://localhost:8080/UserInfo
http://localhost:8080/CardServlet

----------------------------------------

Partie 2: projet JaxRSOpenAPI-master 

Utilisation de JAX-RS et de OpenAPI:
pour tester de rentrer des information dans la base de donnée il faut lancer jetty et ensuite lancer la base de donnée hsqldb.

Il fallait réaliser les classe ressource qui contiennent le methode doPost et doGet pour réalisé les requetes.

Les classe DAO qui permettent de s'abstrait de la façon dont son stock les données des objets metier.  
