# agenda
Estudo


Estrutura de pastas sugerida para um projeto de agenda digital usando Java com Spring Boot:

*********************************************************************************

agenda-digital/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── agendadigital/
│   │   │   │               ├── config/
│   │   │   │               │   └── DatabaseConfig.java
│   │   │   │               ├── controller/
│   │   │   │               │   ├── AuthController.java
│   │   │   │               │   ├── EventController.java
│   │   │   │               │   └── UserController.java
│   │   │   │               ├── dto/
│   │   │   │               │   ├── EventDTO.java
│   │   │   │               │   └── UserDTO.java
│   │   │   │               ├── exception/
│   │   │   │               │   ├── CustomException.java
│   │   │   │               │   └── GlobalExceptionHandler.java
│   │   │   │               ├── model/
│   │   │   │               │   ├── Event.java
│   │   │   │               │   └── User.java
│   │   │   │               ├── repository/
│   │   │   │               │   ├── EventRepository.java
│   │   │   │               │   └── UserRepository.java
│   │   │   │               ├── security/
│   │   │   │               │   ├── JwtAuthenticationEntryPoint.java
│   │   │   │               │   ├── JwtRequestFilter.java
│   │   │   │               │   ├── JwtTokenUtil.java
│   │   │   │               │   └── WebSecurityConfig.java
│   │   │   │               ├── service/
│   │   │   │               │   ├── AuthService.java
│   │   │   │               │   ├── EventService.java
│   │   │   │               │   └── UserService.java
│   │   │   │               └── AgendaDigitalApplication.java
│   │   │   ├── resources/
│   │   │   │   ├── application.properties
│   │   │   │   ├── application-dev.properties
│   │   │   │   ├── application-prod.properties
│   │   │   │   └── templates/
│   │   │   │       └── email/
│   │   │   │           └── welcome.html
│   │   ├── test/
│   │   │   └── java/
│   │   │       └── com/
│   │   │           └── example/
│   │   │               └── agendadigital/
│   │   │                   ├── controller/
│   │   │                   │   ├── AuthControllerTest.java
│   │   │                   │   ├── EventControllerTest.java
│   │   │                   │   └── UserControllerTest.java
│   │   │                   ├── service/
│   │   │                   │   ├── AuthServiceTest.java
│   │   │                   │   ├── EventServiceTest.java
│   │   │                   │   └── UserServiceTest.java
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── README.md
├── frontend/
│   ├── public/
│   │   ├── index.html
│   │   ├── favicon.ico
│   │   └── manifest.json
│   ├── src/
│   │   ├── assets/
│   │   │   ├── css/
│   │   │   │   └── styles.css
│   │   │   ├── images/
│   │   │   │   └── logo.png
│   │   ├── components/
│   │   │   ├── Auth/
│   │   │   │   ├── Login.js
│   │   │   │   ├── Register.js
│   │   │   ├── Event/
│   │   │   │   ├── EventList.js
│   │   │   │   ├── EventForm.js
│   │   │   ├── User/
│   │   │   │   ├── UserProfile.js
│   │   ├── contexts/
│   │   │   ├── AuthContext.js
│   │   │   └── EventContext.js
│   │   ├── hooks/
│   │   │   ├── useAuth.js
│   │   │   ├── useEvent.js
│   │   ├── pages/
│   │   │   ├── HomePage.js
│   │   │   ├── LoginPage.js
│   │   │   ├── RegisterPage.js
│   │   │   ├── EventPage.js
│   │   │   ├── UserProfilePage.js
│   │   ├── services/
│   │   │   ├── api.js
│   │   │   └── auth.js
│   │   ├── App.js
│   │   ├── index.js
│   │   ├── routes.js
│   ├── tests/
│   │   ├── App.test.js
│   │   ├── Login.test.js
│   │   └── EventList.test.js
│   ├── .env
│   ├── package.json
│   ├── package-lock.json
│   └── README.md
├── docs/
│   ├── API.md
│   ├── DATABASE.md
│   ├── FRONTEND.md
│   ├── BACKEND.md
│   └── README.md
├── docker-compose.yml
├── Dockerfile
├── README.md
└── .gitignore

*********************************************************************************

### Descrição das pastas e arquivos no backend com Java:

- **src/main/java/com/example/agendadigital/**: Contém o código principal do projeto.
  - **config/**: Configurações específicas, como configuração do banco de dados.
  - **controller/**: Controladores REST que tratam das requisições HTTP.
  - **dto/**: Objetos de transferência de dados (Data Transfer Objects).
  - **exception/**: Tratamento de exceções personalizadas.
  - **model/**: Classes de modelo que representam as entidades do banco de dados.
  - **repository/**: Interfaces que estendem JpaRepository para interação com o banco de dados.
  - **security/**: Classes relacionadas à segurança e autenticação.
  - **service/**: Lógica de negócios e serviços.
  - **AgendaDigitalApplication.java**: Classe principal que inicializa a aplicação Spring Boot.
  
- **src/main/resources/**: Recursos da aplicação.
  - **application.properties**: Configurações gerais da aplicação.
  - **application-dev.properties**: Configurações específicas para o ambiente de desenvolvimento.
  - **application-prod.properties**: Configurações específicas para o ambiente de produção.
  - **templates/**: Templates de email, por exemplo.

- **src/test/java/com/example/agendadigital/**: Testes unitários e de integração.
  - **controller/**: Testes dos controladores.
  - **service/**: Testes dos serviços.

- **mvnw** e **mvnw.cmd**: Scripts para executar o Maven Wrapper.
- **pom.xml**: Arquivo de configuração do Maven, que gerencia as dependências do projeto.
- **README.md**: Documentação e instruções específicas do backend.

