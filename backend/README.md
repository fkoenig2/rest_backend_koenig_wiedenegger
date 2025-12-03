

# Informationssysteme "ReST Backend"

Dieses Projekt implementiert ein Spring Boot Backend, das eine ReST-API (inkl.
 CRUD-Funktionen) für eine bestehende PostgreSQL-Datenbank (`venlab`)
 bereitstellt. Das gesamte System, einschließlich der Datenbank und 
eines Admin-Tools, wird über Docker Compose verwaltet und gestartet.

Die API-Dokumentation wird automatisch über Springdoc (Swagger) generiert.

## 1. Projektstruktur

- `/backend`: Enthält die vollständige Spring Boot Maven-Anwendung (Java-Quellcode, `pom.xml`, `Dockerfile`).

- `/backup`: Enthält das `restore.sql`-Skript und die zugehörigen `.dat`-Dateien, die zum Initialisieren der Datenbank benötigt werden.

- `docker-compose.yml`: Die zentrale Konfigurationsdatei, die alle Dienste (Datenbank, Backend, Adminer) startet und vernetzt.

- `.env`: (Muss erstellt werden) Enthält die Passwörter und Konfigurationen für die Docker-Dienste.

- `openapi-export.md`: Ein JSON-Export der generierten OpenAPI-Spezifikation.



## 2. Voraussetzungen

- Docker Desktop (oder Docker Engine mit Docker Compose)



## 3. Einrichtung (Erforderlich vor dem ersten Start)

Vor dem ersten Start **muss** eine `.env`-Datei im Hauptverzeichnis (neben `docker-compose.yml`) erstellt werden.

**`.env`-Datei-Vorlage:**

Code-Snippet

```
# Anmeldedaten für die Datenbank
POSTGRES_USER=postgres
POSTGRES_PASSWORD=passwort

# WICHTIG: Muss auf 'postgres' gesetzt werden, 
# damit das restore.sql-Skript die 'venlab'-DB selbst erstellen kann.
POSTGRES_DB=postgres

# (Optional: Adminer-Login-Daten, falls benötigt)
PGADMIN_EMAIL=admin@example.com
PGADMIN_PASSWORD=admin
```



## 4. Ausführung

Um das gesamte System (Datenbank, Backend-API und Adminer) zu starten:

1. Öffne ein Terminal im Hauptverzeichnis des Projekts.

2. Führe den folgenden Befehl aus:
   
   Bash

1. ```
   docker compose up --build -d
   ```
   
   - `--build`: Erstellt das Java-Backend-Image (`backend-app`) mithilfe des `Dockerfile`.
   
   - `-d`: Startet alle Container im Hintergrund (detached).

Das System ist nun einsatzbereit.



## 5. Zugriffspunkte

- **ReST API (Swagger UI):** `http://localhost:8081/swagger-ui.html` *(Port 8081, da Port 8080 vom Adminer belegt wird).*

- **OpenAPI JSON-Spezifikation:** `http://localhost:8081/v3/api-docs` *(oder der Pfad, der in deiner Swagger-UI angezeigt wird)*

- **Datenbank-Verwaltung (Adminer):** `http://localhost:8080`

- **Adminer-Login-Daten:**
  
  - **System:** `PostgreSQL`
  
  - **Server:** `db`
  
  - **Benutzer:** `postgres`
  
  - **Passwort:** `passwort`
  
  - **Datenbank:** `venlab` *(Das ist die DB, die das Skript erstellt hat)*



## 6. System stoppen

Um alle laufenden Container zu stoppen:

Bash

```
docker compose down
```

Um die Container zu stoppen und das Datenbank-Volume (alle Daten) zu löschen (Reset):

Bash

```
docker compose down -v
```

## 7. Quellenverzeichnis

RESTful API Tutorial – https://restfulapi.net
FastAPI Docs – https://fastapi.tiangolo.com
Spring Boot Guide – https://spring.io/guides
Docker Compose Overview – https://docs.docker.com/compose
Postgres Docker Hub Image – https://hub.docker.com/_/postgres
OpenAPI Specification – https://swagger.io/specification

## 8. Promptverzeichnis

„Hilf mir, eine leicht erweiterbare Backend-Architektur für eine REST-API aufzusetzen. Voraussetzungen:
- CRUD für bestehende Postgres-Datenbank
- ORM-Nutzung
- Betrieb in Docker Compose
Schlage mir geeignete Tools und ein minimales Ausgangsprojekt vor.“

„Erstelle eine Docker-Compose-Konfiguration für folgende Komponenten:
- Postgres-Datenbank
- Backend-Service
- Gemeinsames Docker-Netzwerk“

„Hilf mir CRUD-REST-Endpoints für ein bestehendes relationales Datenmodell zu erstellen.
Gib Beispiele für:
- GET all
- GET by ID
- POST
- PUT
- DELETE"
