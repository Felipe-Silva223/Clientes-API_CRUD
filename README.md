# CLIENTES API 🗂️

## Descrição do Projeto 🌟
O projeto CLIENTES API tem como objetivo desenvolver uma API RESTful para gerenciar informações de clientes. A aplicação permite realizar operações CRUD (Create, Read, Update, Delete) sobre os dados dos clientes, proporcionando uma interface robusta e eficiente para manipulação dessas informações. 🚀

## Tecnologias Utilizadas 🛠️
- **Linguagem de Programação:** Java ☕
- **Framework:** Spring Boot 🌱
- **Banco de Dados:** PostgreSQL 🐘

## Funcionalidades Principais 📜
1. **Cadastro de Clientes:**
   - Permitir a criação de novos registros de clientes com as seguintes informações:
     - `UUID idCliente`: Identificador único do cliente. 🔑
     - `String name`: Nome do cliente. 🧑‍🤝‍🧑
     - `String cpf`: CPF do cliente. 🆔
     - `String cep`: CEP do cliente. 📮
     - `String endereco`: Endereço completo do cliente. 🏡

2. **Consulta de Clientes:**
   - Buscar informações detalhadas de um cliente específico através de seu `idCliente`. 🔍
   - Listar todos os clientes cadastrados, com opções de paginação e filtros. 📜

3. **Atualização de Dados:**
   - Atualizar as informações de um cliente existente, permitindo modificar os dados como nome, CPF, CEP e endereço. ✏️

4. **Exclusão de Clientes:**
   - Remover o registro de um cliente do sistema, garantindo que os dados sejam excluídos de forma segura e eficiente. 🗑️

## Arquitetura do Sistema 🌐
- **Controle:** Utilização de controladores Spring Boot para definir endpoints RESTful que gerenciam as operações de CRUD.
- **Serviço:** Camada de serviço para encapsular a lógica de negócios e interações com o banco de dados.
- **Repositório:** Interface de repositório utilizando Spring Data JPA para abstrair operações com o banco de dados PostgreSQL.

## Estrutura de Dados do Cliente 📊

```java
import java.util.UUID;

public class Cliente {
    private UUID idCliente;
    private String name;
    private String cpf;
    private String cep;
    private String endereco;

    // Getters e Setters
}

