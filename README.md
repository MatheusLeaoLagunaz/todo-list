# 📝 ToDo List - Spring Boot

Um projeto desenvolvido durante o **curso introdutório da Rocketseat**, criando uma **API de gerenciamento de tarefas (ToDo List)**.  
Esse foi meu **primeiro projeto com Spring Boot** e me ajudou a aprender conceitos de **APIs REST, segurança e boas práticas em Java**.
Irei expandir este projeto continuamente, buscando melhorias e implementações adicionais com o objetivo de aperfeiçoar meus conhecimentos em desenvolvimento de APIs, Spring Boot e boas práticas de programação.

---

## 🌐 Deploy Online

A API está hospedada e disponível para testes no Render:  
👉 [https://todo-list-bryl.onrender.com](https://todo-list-bryl.onrender.com)

> ⚠️ Este link não possui interface visual (frontend).  
> Para testar as rotas, é necessário utilizar um cliente de requisições HTTP, como **API Dog**, **Postman** ou **Insomnia**.


---

##  Tecnologias Utilizadas

-  **Java 21**
-  **Spring Boot**
-  **Spring Web**
-  **Spring Data JPA**
-  **Spring Security + BCrypt** (criptografia de senhas)
- ️**H2 Database** (banco em memória)
-  **Maven** (gerenciador de dependências)
-  **API Dog** (para testar a API)
-  **Docker** (para empacotamento da aplicação)

---

## 📚 Funcionalidades

- ✅ Cadastro e autenticação de usuários
- 🔒 Criptografia de senhas com **BCrypt**
- 🗂️ Metodos: criar, listar, atualizar
- 💾 Persistência com **H2 Database**
- 🧱 Organização inicial seguindo a estrutura MVC
- 🧪 Testes de endpoints com **API Dog**

---

# 📝 To-Do List API

API desenvolvida em **Java com Spring Boot**, como parte do curso introdutório da **Rocketseat**.  
Este projeto tem como objetivo o aprendizado prático de **desenvolvimento back-end**, **boas práticas de API REST** e **deploy em produção**.

---

## 🚀 Deploy

A API está hospedada e pode ser acessada em:  
👉 [https://todo-list-bryl.onrender.com](https://todo-list-bryl.onrender.com)

> ⚠️ Este link é apenas da **API**, não de uma interface visual.  
> Você pode testá-la usando ferramentas como **API Dog**, **Postman** ou **Insomnia**.

---

## 📡 Endpoints da API

Abaixo estão todas as rotas disponíveis e como utilizá-las.

> 🧠 Endereço base:
> ```
> https://todo-list-bryl.onrender.com
> ```

---


### ‍️Usuários

#### Registrar novo usuário
- **POST** `/users/register`
- **Body (JSON):**
```json
{
  "username": "matheus",
  "password": "123456"
} 
```

### Tarefas

####  Criar uma Tarefa
- **POST** `/tasks/`
```json
{
    "description": "Descrição da tarefa",
    "title": "Título",
    "priority": "Alta",
    "startAt": "2025-10-08T12:30:00",
    "endAt": "2025-10-08T15:35:00",
    "idUser": "09bfae22-c11d-4df2-8d96-d97be914eb0a"
}
```
#### Visualizar Tarefas Criadas
- **GET** `/tasks/`

#### Editar Tarefa
- **PUT** `/tasks/{id}`
- **Exemplo:** `https://todo-list-bryl.onrender.com/tasks/dbc26cd5-4019-4e8e-8700-b9ed870254d8`
```json
{
    "description": "Descrição alterada",
    "title": "Título Alterado",
    "priority": "Alta",
    "startAt": "2025-10-06T12:30:00",
    "endAt": "2025-10-06T15:35:00"
}
```
## ⚙️ Como Executar Localmente

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/MatheusLeaoLagunaz/todo-list.git
