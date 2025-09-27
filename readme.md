# 📚 CRUD Biblioteca

Um projeto em **Spring Boot + MySQL** que implementa um sistema simples de cadastro de livros.
Permite **criar, listar, atualizar e deletar** registros de livros de forma prática via API REST.

---

## 🔧 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Lombok**

---

## 🚀 Como rodar o projeto

### 1. Pré-requisitos
- [Java 17+](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/)

### 2. Clonar o repositório
```bash
git clone https://github.com/Phhenrique3/Cadastro_livros.git
cd Cadastro_livros

3. Configurar o banco de dados

No seu MySQL, crie o banco:

CREATE DATABASE crud_biblioteca;


A aplicação já está configurada para conectar em:

host: localhost
porta: 3307
usuário: root
senha: (vazio)


Se precisar, altere no arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3307/crud_biblioteca?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=

4. Rodar a aplicação
mvn spring-boot:run


A API ficará disponível em:

http://localhost:8080/livros

🔍 Endpoints da API
Listar todos os livros
GET /livros

Buscar livro por ID
GET /livros/{id}

Cadastrar novo livro
POST /livros
Content-Type: application/json

{
  "titulo": "Walison",
  "autor": "Fernanda",
  "ano": 2003
}

Atualizar um livro
PUT /livros/{id}
Content-Type: application/json

{
  "titulo": "Novo Título",
  "autor": "Novo Autor",
  "ano": 2024
}

Deletar um livro
DELETE /livros/{id}

📂 Estrutura do Projeto
src/
├── main/
│   ├── java/com/example/crud_biblioteca/
│   │   ├── CrudBibliotecaApplication.java   # Classe principal
│   │   ├── controller/LivroController.java  # Endpoints REST
│   │   ├── model/Livro.java                 # Entidade Livro
│   │   └── repository/LivroRepository.java  # Interface de persistência
│   └── resources/
│       └── application.properties           # Configurações do projeto

📌 Melhorias Futuras

Paginação e filtros avançados

Validações com Bean Validation

Documentação automática com Swagger

Testes unitários e de integração

📄 Licença

Este projeto é open-source e pode ser usado livremente.


👉 Esse README já tá no formato pra você só colar no **README.md** do repositório.

Quer que eu adicione também **badges do GitHub** (Java, Spring Boot, MySQL, Maven) pra deixar mais estiloso?
