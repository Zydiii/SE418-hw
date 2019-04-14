# README

## Phase 1

- Spring Boot
- Git WorkFlow

### How to use

```powershell
cd phase-1
cd gs-rest-service-master
cd initial
./mvnw spring-boot:run
```

### Then in Postman

- Visit *localhost:8080/WordLadder*
- Enter value1 for key word1
- Enter value2 for key word2

## Phase 2

- Spring Boot
- Git WorkFlow

### How to use

```powershell
cd phase-1
cd complete
./mvnw spring-boot:run
```

### Then in Postman

- Give Authorization with Basic Auth
  - Username: user
  - Password: password

- Visit *localhost:8088/WordLadder/Search*
- Enter value1 for key word1
- Enter value2 for key word2
- Visit *localhost:8088/actuator/\**

