# 🌟 API RESTful de E-commerce com Spring Boot

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1+-6DB33F?logo=spring)](https://spring.io/)
[![H2 Database](https://img.shields.io/badge/H2-Database-1e90ff)](https://www.h2database.com/)
[![License](https://img.shields.io/badge/license-MIT-blue)](LICENSE)

Projeto desenvolvido durante o curso da [DevSuperior](https://devsuperior.com.br), implementando uma **API RESTful** completa com Spring Boot, JPA/Hibernate e banco H2.

## 📋 Índice
- [Diagrama do Sistema](#-diagrama-do-sistema)
- [Funcionalidades](#-funcionalidades)
- [Tecnologias](#-tecnologias)
- [Como Executar](#-como-executar)
- [Endpoints](#-endpoints)

## 🔍 Diagrama do Sistema
![Modelo de Domínio](https://github.com/user-attachments/assets/a63e366d-1cec-43a5-874e-18af72da6022)  
*(Diagrama das entidades User, Product e Category com seus relacionamentos)*

## 🚀 Funcionalidades

✔️ **CRUD completo** para Usuários, Produtos e Categorias  
✔️ **Relações Many-to-Many** entre Produtos e Categorias  
✔️ **Validação de dados** nos endpoints  
✔️ **Tratamento de erros** personalizado  
✔️ **Filtros** por categoria e preço


## 💻 Tecnologias

- **Backend**
  ![Java](https://img.shields.io/badge/Java-17-007396?logo=java)
  ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1+-6DB33F?logo=spring)
  ![Hibernate](https://img.shields.io/badge/Hibernate-5.6-59666C?logo=hibernate)
  
- **Banco de Dados**
  ![H2](https://img.shields.io/badge/H2-2.1-1e90ff)
  ![JPA](https://img.shields.io/badge/JPA-2.2-59666C)

- **Ferramentas**
  ![Postman](https://img.shields.io/badge/Postman-FF6C37?logo=postman)
  ![Maven](https://img.shields.io/badge/Maven-3.8-C71A36?logo=apache-maven)




  ## 🏃 Como Executar

```bash
# 1. Clone o repositório
git clone https://github.com/Peceguinivitu/workshop-springboot3-jpa

# 2. Execute o projeto
mvn spring-boot:run
  



## 🧪 Testes de API via Postman

### 🔍 Visão Geral
Todos os endpoints foram testados via Postman, seguindo boas práticas REST:
- **Códigos de status** HTTP adequados
- **Validação de esquema** JSON
- **Testes de erro** (404, 400, etc.)

---

### 👥 **Testes de Usuários (`/users`)**
#### `GET /users` - Listagem
**Request:**
```http
GET http://localhost:8093/users
Accept: application/json








