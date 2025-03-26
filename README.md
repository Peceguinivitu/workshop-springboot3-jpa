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
```
  





## 🧪 Testes de API via Postman

### 🔍 Visão Geral
Todos os endpoints foram testados via Postman, seguindo boas práticas REST:
- **Códigos de status** HTTP adequados
- **Validação de esquema** JSON
- **Testes de erro** (404, 400, etc.)

---
## 🌐 Endpoints 

### 👤 **Usuários** (`/users`)
| Método | Endpoint          | Descrição                     | Status |
|--------|-------------------|-------------------------------|--------|
| POST   | `/users`          | Cria novo usuário             | 201    |
| GET    | `/users`          | Lista todos usuários          | 200    |
| GET    | `/users/{id}`     | Busca usuário por ID          | 200    |
| PUT    | `/users/{id}`     | Atualiza usuário              | 200    |
| DELETE | `/users/{id}`     | Remove usuário                | 204    |

**Exemplo de criação:**
```http
POST http://localhost:8093/users
Content-Type: application/json

{
  "name": "Maria Silva",
  "email": "maria@email.com",
  "password": "*****",
  "phone": "11999999999"
}
```

### 📦 **Produtos** (`/Produtos`)
| Método | Endpoint          | Descrição                     | Status |
|--------|-------------------|-------------------------------|--------|
| GET    | `/Produtos`          | Lista todos produtos          | 200    |
| GET    | `/Produtos/{id}`     | Busca produtos por ID          | 200    |

**Exemplo:**
```http
GET http://localhost:8093/products
Content-Type: application/json

{
  "id": 1,
        "name": "The Lord of the Rings",
        "descripton": "Lorem ipsum dolor sit amet, consectetur.",
        "price": 90.5,
        "imgUrl": ""
        "categories": [
    {
      "id": 2,
      "name": "Books"
    }
  ]


}

```
### 🏷️ **Categorias** (`/categories`)
| Método | Endpoint            | Descrição                     |
|--------|---------------------|-------------------------------|
| GET    | `/categories`       | Lista todas categorias        |
| GET    | `/categories/{id}`  | Busca categoria por ID        |


**Exemplo:**
```http
GET http://localhost:8093/categories 
Content-Type: application/json

{
  
   
 {
        "id": 2,
        "name": "Books"
    }
````



### 🛒 **Pedidos** (`/orders`)
| Método | Endpoint               | Descrição                     |
|--------|------------------------|-------------------------------|
| GET    | `/orders`              | Lista pedidos                 |
| GET    | `/orders/{id}`         | Busca pedido por ID           |


**Exemplo:**
```http
GET http://localhost:8093/categories 
Content-Type: application/json

{
    "moment": "2019-06-20T19:53:07Z",
    "orderstatus": "PAID",
    "id": 1,
    "client": {
        "id": 1,
        "name": "Maria Brown",
        "email": "maria@gmail.com",
        "phone": "988888888",
        "password": "123456"
    },
    "payment": {
        "id": 1,
        "moment": "2019-06-20T22:53:07Z"
    },
    "items": [
        {
            "quantity": 2,
            "price": 90.5,
            "product": {
                "id": 1,
                "name": "The Lord of the Rings",
                "descripton": "Lorem ipsum dolor sit amet, consectetur.",
                "price": 90.5,
                "imgUrl": "",
                "categories": [
                    {
                        "id": 2,
                        "name": "Books"
                    }
                ]
            },
            "subtotal": 181.0
        },
````











