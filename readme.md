# UserManager

Um projeto simples de gerenciamento de usuários com backend em Spring Boot e frontend estático em HTML/CSS/JavaScript. Permite listar, buscar por ID e cadastrar novos usuários.

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- HTML5
- CSS3
- JavaScript (Fetch API)
- Banco de Dados H2 (ou outro, se preferir)

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.devmaster.userdpt/
│   │       ├── controllers/
│   │       │   └── UserController.java
│   │       ├── entities/
|   |       |   |___Department.java
│   │       │   └── User.java
│   │       ├── repositories/
│   │       │   └── UserRepository.java
│   │       └── UserDptApplication.java
│   └── resources/
│       ├── static/
│       │   ├── index.html
│       │   ├── user.html
│       │   ├── new-user.html
│       │   ├── style.css
│       │   ├── index.js
│       │   └── ...
│       └── application.properties
```

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/UserManager.git
cd UserManager
```

2. Compile e execute com o Spring Boot (IDE ou terminal):

```bash
./mvnw spring-boot:run
```

3. Acesse no navegador:

- `http://localhost:8080/index.html` – Lista de usuários
- `http://localhost:8080/user.html` – Buscar usuário por ID
- `http://localhost:8080/new-user.html` – Cadastro de novo usuário

## 📦 Requisições suportadas

- `GET /users` – Lista todos os usuários
- `GET /users/{id}` – Busca usuário pelo ID
- `POST /users` – Cadastra um novo usuário

## ✍️ Autor

Desenvolvido por [Seu Nome](https://github.com/seu-usuario)
