# IOB Loan Status (demo app)

A small Spring Boot **2.7.18 / Java 8** web app, kept old on purpose for the Tanzu Platform modernisation demo:
assess in Tanzu Hub, upgrade with Application Advisor (`cf repo`), push, restage.

What the Advisor upgrade path (2.7 -> 3.x -> 4.0) will visibly change:
- `pom.xml`: Java 8 -> 17, Spring Boot 2.7.18 -> 3.x -> 4.0 (and starter changes Boot 4 needs)
- `RequestIdFilter.java`, `LoanController.java`: `javax.*` imports -> `jakarta.*` (Boot 3.0 step)
- `LoanController.java`: trailing-slash mappings kept working (Spring Framework 6 change)
- `application.properties`: `server.max-http-header-size` -> `server.max-http-request-header-size` (Boot 3.0)

Build: `mvn -q package`  ·  Run locally: `mvn spring-boot:run` (http://localhost:8080)  ·  Push: `cf push`
The home page shows the running Spring Boot, Spring Framework and Java versions, and the app instance.
