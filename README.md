# SecureAPI-Gateway

En Spring Boot-baserad API Gateway för autentisering och auktorisering i en mikrotjänstarkitektur.

---

## Översikt

**SecureAPI-Gateway** är en **Spring Boot**-applikation som fungerar som en gateway för autentisering och auktorisering när flera mikrotjänster samarbetar.

Syftet är att:

- Enhetligt hantera användares identitet och roller  
- Säkerställa att endast auktoriserade användare/tjänster når skyddade resurser  
- Centralisera gemensamma säkerhetsfunktioner såsom JWT-validering, routing och policies

---

## Funktioner

- 🛡️ **JWT-baserad autentisering**  
- 🔐 **Roll- och behörighetskontroll** (authorization)  
- 🚦 **Routing till downstream-mikrotjänster**  
- 🌐 **API Gateway mönster** – fungerar som enda ingångspunkt för klienter  
- 🔧 **Konfigurerbar säkerhetskontext** för olika tjänster  
- 🐳 **Docker & Docker Compose** stöd för enkel uppsättning och distribution  

---

## Teknostack

- **Backend-ramverk:** Spring Boot (Java 17+)  
- **Säkerhetsramverk:** Spring Security, JWT  
- **Databas / identity store:** Kan vara in memory, eller externt IAM / User service  
- **Byggverktyg:** Maven  
- **Containerisering:** Docker & Docker Compose  

---
