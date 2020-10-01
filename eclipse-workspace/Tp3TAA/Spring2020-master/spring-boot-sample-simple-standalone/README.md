TP3 Partie 1: Injection de dépendances
==========================================

Objectif :
Réalisé un projet spring avec implémentation des classes métiers et réalisation de 2 sénario.
-------------------------------------------
Réalisation:
J'ai mis en place les 3 interfaces IJustHaveALook, IFastLane et ILane. Ces interface on des methodes et ces methode sont appelées dans le run de la classe client. on crée via l'annotation @Autowired au deçus des instance des 3 interfaces qui nous permet de faire l’injection de dépendances entre les beans de l’application.

Ensuite, le run est appeler dans SampleSimpleApplication.java a l'interieur du main pour executer le run de la classe client.

