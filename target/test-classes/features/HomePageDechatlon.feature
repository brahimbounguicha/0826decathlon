#Proservice

Feature: verif menu page

Scenario: acceder a chaque menu de la page d'acceuil

Given utilisateur est sur home page 
When utilisateur clique sur "Enfants" & le sous menu "Chaussures de bain"
Then utilisateur est sur la page de "Proservices"