# Sample API

## Descrição

Este projeto é uma API de exemplo que demonstra a criação e manipulação de dados de carros e cores. Ele permite realizar operações CRUD (Create, Read, Update, Delete) em diferentes entidades.

## Funcionalidades

- **Gerenciamento de Carros**: Permite criar, atualizar, visualizar e deletar carros.
- **Gerenciamento de Cores**: Permite criar, atualizar, visualizar e deletar cores associadas aos carros.

## Estrutura do Projeto

- `controller/`: Contém as classes de controle que lidam com as requisições HTTP.
- `model/`: Contém as classes de modelo que representam as entidades do projeto.
- `repository/`: Contém as classes de repositório que lidam com a persistência de dados.
- `service/`: Contém as classes de serviço que encapsulam a lógica de negócios.

## Diagrama de Classes

```mermaid
classDiagram
    class Car {
        +String id
        +String make
        +String model
        +int year
        +Color color
    }

    class Color {
        +String id
        +String name
        +String hexCode
    }

    Car "1" *-- "1" Color
