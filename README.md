
# Projeto web services com Spring Boot e JPA / Hibernate 

Este projeto consiste em uma aplicação Java utilizando Spring Boot e JPA/Hibernate para gerenciar um modelo de domínio com funcionalidades de CRUD, tratamento de exceções e integração com banco de dados H2. É ideal para aprendizado de construção de APIs RESTful com uma arquitetura bem definida.


## Funcionalidades

### Gerenciamento de Usuários

- Cadastro de Usuários: Permite adicionar novos usuários com informações como nome, e-mail, telefone e senha.
- Consulta de Usuários: Listagem e busca detalhada de usuários por ID.
- Atualização de Usuários: Modificação de dados de um usuário existente.
- Exclusão de Usuários: Remoção de usuários do sistema.
### Gerenciamento de Pedidos (Orders)

- Registro de Pedidos: Associação de pedidos a usuários com datas no padrão ISO 8601.
- Consulta de Pedidos: Detalhamento de pedidos e seus itens associados.
### Gerenciamento de Produtos e Categorias

- Cadastro de Produtos: Registro de produtos com nome, descrição, preço e categoria.
- Associação a Categorias: Organização de produtos em categorias específicas (muitos-para-muitos).
 - Listagem de Produtos e Categorias: Visualização de todos os produtos e categorias disponíveis.
### Itens do Pedido (Order Items)

- Associação de Produtos a Pedidos: Criação de itens do pedido com quantidade, preço unitário e subtotal.
 - Cálculo de Totais: Determinação automática do subtotal e total de cada pedido.
### Pagamentos

- Cadastro de Pagamentos: Relacionamento um-para-um entre pedidos e pagamentos.
- Consulta de Pagamentos: Detalhamento do pagamento associado a um pedido.
### Tratamento de Exceções

- Erros Personalizados: Respostas claras para erros como recurso não encontrado (404) e conflitos no banco de dados (400 ou 500).
- Mensagens Detalhadas: Informações completas no formato JSON para facilitar o entendimento dos erros.
### Console do Banco de Dados H2

- Acesso ao Banco: Interface para consultar e gerenciar os dados diretamente no banco de dados em memória.


## Documentação da API

#### Retorna um usuário por ID
GET /users  

```http
  GET /users/{id} 
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` |	Obrigatório. O ID do usuário que você quer obter. |


#### Cadastra um novo usuário
```http
  POST /users
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `Nenhum	` | `-` |	Dados do usuário no corpo da requisição de exmplo.|

Corpo da Requisição (JSON):
{  
  "name": "Bob Brown",  
  "email": "bob@gmail.com",  
  "phone": "000000000",  
  "password": "*********"  
}  

#### Atualiza um usuário existente

```http
  PUT /users/{id} 
``` 
| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` |	Obrigatório. ID do usuário. |



### Pedidos (Orders) 
#### Retorna todos os pedidos
```http
  GET /orders 
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` |	Obrigatório. ID do pedido. |


#### Cadastra um novo pedido

```http
  POST /users
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `Nenhum	` | `-` |	Dados do pedido no corpo da requisição de exmplo.|

{  
  "moment": "2019-06-20T19:53:07Z",  
  "status": "PAID",  
  "userId": 1  
}  


#### Exclui um pedido

```http
  DELETE /orders/{id} 
``` 
| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` |	Obrigatório. ID do pedido. |




### Product (Produtos)
#### Retorna todos os produtos 

```http
  GET /products   
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `Nenhum` | `-` |	Nenhum parâmetro necessário. |


#### Retorna um produto por ID

```http
  GET /products/{id}  
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` |	Obrigatório. ID do produto. |




#### Exclui um produto pelo ID

```http
  DELETE /products/{id} 
``` 
| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` |	Obrigatório. ID do produto. |









## Melhorias

 ### Tratamento de Erros
Adicionar mensagens de erro mais detalhadas nas respostas para que os desenvolvedores saibam o motivo exato do erro.
Melhorar o uso de códigos HTTP específicos para diferentes tipos de erro (por exemplo, 400 para erros de validação, 404 para recursos não encontrados).


## 🛠 Tecnologias usadas 
<div style="display: inline_block"><br/>
<img align="center" alt="java" src=https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white>
<img align="center" alt="spring" src=https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white>  
<img align="center" alt="jpa" src=https://img.shields.io/badge/JPA-1572B6?style=for-the-badge&logo=jpa&logoColor=white>  
<img align="center" alt="Hibernate" src=https://img.shields.io/badge/Hibernate-43853D?style=for-the-badge&logo=hibernate&logoColor=white>

  

</div> <br>

