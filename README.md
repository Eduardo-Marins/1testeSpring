# API de Usuários com Spring Boot

Projeto desenvolvido para estudos de Spring Boot e APIs REST.

## Funcionalidades

* Cadastro de usuários
* Listagem de usuários
* Armazenamento em memória utilizando ArrayList

## Tecnologias utilizadas

* Java
* Spring Boot
* Maven

## Endpoints

### Cadastrar usuário

POST /usuarios

Exemplo:

```json
{
  "nome": "Eduardo",
  "idade": 17,
  "email": "eduardo@email.com",
  "senha": "123456"
}
```

### Listar usuários

GET /usuarios

## Objetivo do projeto

Praticar conceitos fundamentais de desenvolvimento backend com Spring Boot, incluindo:

* Controllers
* Rotas REST
* RequestBody
* JSON
* Collections (ArrayList)
* Requisições HTTP GET e POST

## Melhorias futuras

* Buscar usuário por ID
* Atualizar usuário
* Remover usuário
* Integração com banco de dados MySQL
* Camada Service
* Validações de dados
* Spring Data JPA
* Spring Security
