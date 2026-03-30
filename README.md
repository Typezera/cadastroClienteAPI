# 🚀 Sistema de Cadastro de Clientes (Fullstack)

Projeto fullstack desenvolvido com **Spring Boot (backend)** e **React + TailwindCSS (frontend)**, com o objetivo de praticar e consolidar conceitos de desenvolvimento web moderno, incluindo API REST, integração frontend-backend e boas práticas de arquitetura.

---

## 🧠 Sobre o Projeto

Este projeto consiste em um sistema de gerenciamento de clientes, onde é possível:

* 📌 Cadastrar novos clientes
* 🔍 Buscar cliente por ID
* 📋 Listar todos os clientes
* ✏️ Atualizar dados de um cliente
* ❌ Remover clientes

A aplicação segue o padrão arquitetural:

```bash
Controller → Service → Repository → Database
```

---

## 🛠️ Tecnologias Utilizadas
### 🔙 Backend

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 / MySQL (dependendo da configuração)

### 🔜 Frontend (em desenvolvimento)

* ReactJS
* JavaScript (ES6+)
* TailwindCSS
https://github.com/Typezera/cadastroClienteFrontend    *<- link repositorio Frontend
---

## ⚙️ Funcionalidades da API

| Método | Endpoint      | Descrição                |
| ------ | ------------- | ------------------------ |
| POST   | /cliente      | Criar novo cliente       |
| GET    | /cliente/{id} | Buscar cliente por ID    |
| GET    | /cliente      | Listar todos os clientes |
| PUT    | /cliente/{id} | Atualizar cliente        |
| DELETE | /cliente/{id} | Remover cliente          |

---

## 📡 Status HTTP utilizados

* `200 OK` → Sucesso em operações GET/PUT
* `201 Created` → Cliente criado com sucesso
* `204 No Content` → Cliente removido
* `404 Not Found` → Cliente não encontrado

---

## 🧱 Estrutura do Projeto

```bash
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 ├── dto/
```

---

## 🔄 Padrões Utilizados

* ✅ DTO (Data Transfer Object)
* ✅ Separação de camadas (Controller, Service, Repository)
* ✅ Uso de Optional para tratamento de dados
* ✅ API RESTful
* ✅ Boas práticas de status HTTP

---

## 💻 Como rodar o projeto

### Backend

```bash
# Clone o repositório
git clone https://github.com/Typezera/cadastroClienteAPI.git

# Acesse o projeto
cd cadastroClienteAPI

# Rode a aplicação (Linux/Mac)
./mvnw spring-boot:run

# Rodar no Windows
mvnw.cmd spring-boot:run

# Ou se tiver o Maven instalado
mvn spring-boot:run
```

---

## 🎯 Objetivo

Este projeto foi desenvolvido com foco em:

* Evoluir no backend com Spring Boot
* Praticar construção de APIs REST
* Integrar backend com frontend moderno
* Criar um projeto real para portfólio

---

## 👨‍💻 Autor

Desenvolvido por Typezera 😄
Em busca de oportunidade como desenvolvedor backend/fullstack.

