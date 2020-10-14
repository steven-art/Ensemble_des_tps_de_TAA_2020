TP3 Partie 3: Spring-data
==========================================
Objectif:
Il faut mettre en place des classe Dao avec les classe mertier du tp tableau Kanban et faire en sorte de remplir la base de donnée mysql(par exemple) et realisé des requete et reponse dans postman qui utilise les informations trouver dans la base de donnée.

---------------------------------------------

Réalisation:
j'ai recupéré les classes métier du tp sur le tableau Kanban et j'ai réaliser les dao pour chaque classe qui avais besoin de retourné des methode utilisable par le client.
pour la classe user et car j'ai fait un controller qui permet de realisé le requete post, get,delete.

Pour les log:
deux classes de logge permettent lors de l'appel des methodes presentent dans les controllers et quand on fait appel avec posteman au requete si dessous on obtient un retour dans la console spring.
---------------------------------------------
Les requêtes possible a tester sur Postman:

1- créer un utilisateur :
http://localhost:8080/create?email=test@domain.com&name=Test

2- rechercher un utilisateur:
http://localhost:8080/get-by-email/mars@domain.com

3- detruir un utilisateur:
http://localhost:8080/delete?id=1

4- céer une carte :
http://localhost:8080/card/create?libelle=card1&url=urldelacard&note=nouvellecardacollectionee

5- detruit une carte:
http://localhost:8080/card/delete?id=1

6- afficher une carte:
http://localhost:8080/card/get-by-libelle/card1

