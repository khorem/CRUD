# Projet Spring Boot CRUD

Ce projet est une application de démonstration pour un CRUD (Create, Read, Update, Delete) basique utilisant Spring Boot.

## Objectif

L'objectif de ce projet est de fournir un exemple simple et fonctionnel d'une application CRUD utilisant Spring Boot, Hibernate et PostgreSQL. Cela peut servir de point de départ pour des projets plus complexes nécessitant des opérations CRUD sur une base de données relationnelle.

## Fonctionnalités

- **CRUD complet**: Permet la création, la lecture, la mise à jour et la suppression d'entités.
- **Validation des données**: Utilise les annotations de validation de Spring pour garantir l'intégrité des données.
- **Pagination**: Supporte la pagination des résultats pour gérer de grandes collections d'entités.

## Technologies Utilisées

- **Spring Boot**: Framework Java pour créer des applications autonomes et prêtes à l'emploi.
- **Hibernate**: Framework de persistance pour la gestion des objets en base de données relationnelles.
- **PostgreSQL**: Système de gestion de base de données relationnelle.
- **Maven**: Outil de gestion de projets de logiciels basés sur Java.

## Configuration Requise

- JDK 8 ou supérieur
- Maven 3.x
- PostgreSQL Server

## Comment Utiliser

1. **Cloner le Repository**:

   ```
   git clone https://github.com/votre_utilisateur/spring-boot-crud.git
   ```

2. **Configurer la Base de Données**:

   - Créer une base de données PostgreSQL.
   - Mettre à jour les informations de connexion à la base de données dans le fichier `application.properties`.

3. **Compiler et Exécuter l'Application**:

   ```
   mvn spring-boot:run
   ```

4. **Tester les Endpoints**:

   Utiliser un outil comme Postman pour tester les endpoints exposés par l'application.
