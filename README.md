# 🎤♿ Sistema de Eventos Acessíveis API

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <img src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black" alt="Swagger" />
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-orange?style=for-the-badge" alt="Status" />
</p>

---

## 📖 Sobre o Projeto

O **Sistema de Eventos Acessíveis** é uma API RESTful desenvolvida com o objetivo de facilitar o gerenciamento de eventos inclusivos e focados em acessibilidade para diferentes públicos. 

A aplicação permite o cadastro e o vínculo inteligente entre participantes, organizadores, eventos e categorias, integrando **preferências de acessibilidade** para garantir que pessoas com necessidades específicas tenham uma experiência integrada e acolhedora.

> 🎓 *Este projeto foi desenvolvido como trabalho prático para a disciplina de API RESTful.*

---

## 🎯 Objetivos Teóricos e Práticos

O núcleo do projeto é consolidar boas práticas de desenvolvimento API, aplicando os seguintes conceitos:

*   **Arquitetura em Camadas:** Divisão clara de responsabilidades (Controller, Service, Repository, Entity).
*   **Padrão DTO (Data Transfer Object):** Segurança e otimização no tráfego de dados entre a API e o cliente.
*   **Mapeamento Objeto-Relacional Avançado:** Relacionamentos complexos com JPA/Hibernate.
*   **Tratamento Global de Exceções:** Retornos HTTP padronizados e amigáveis para o usuário da API.
*   **Validação de Dados:** Uso rigoroso do Bean Validation para consistência no banco de dados.

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Função no Projeto |
| :--- | :--- |
| **Java 17** | Linguagem robusta e fortemente tipada base do sistema. |
| **Spring Boot 3.x** | Framework para setup ágil e gerenciamento do ciclo de vida da API. |
| **Spring Data JPA** | Abstração de persistência e repositórios de dados. |
| **Hibernate** | Mecanismo de ORM para mapear as classes às tabelas do banco. |
| **PostgreSQL** | Banco de dados relacional para armazenamento seguro das informações. |
| **Maven** | Gerenciador de dependências e automação do build. |
| **Swagger / OpenAPI** | Documentação interativa e testes rápidos dos endpoints. |

---

## 🧱 Arquitetura de Dados (Entidades Principais)

O ecossistema da API é sustentado por 5 pilares principais:

*   👤 **Participante:** Usuários que frequentam os eventos.
*   ♿ **PreferenciaAcessibilidade:** Necessidades específicas vinculadas a cada participante (ex: intérprete de Libras, rampa de acesso, audiodescrição).
*   🎤 **Evento:** Detalhes da atividade, local, data e estrutura disponível.
*   🏢 **Organizador:** Entidade responsável por criar e gerenciar a logística dos eventos.
*   🗂️ **CategoriaEvento:** Classificação temática para facilitar a busca e organização.

---

## 📚 Aprendizados Consolidados

Desenvolver esta API permitiu solidificar habilidades críticas para o mercado:
1. Modelagem de banco de dados relacional voltada para cenários do mundo real.
2. Escrita de código limpo e desacoplado usando os recursos do ecossistema Spring.
3. Uso estratégico de versionamento com **Git** (padrão de commits organizados e evolução incremental do repositório).

---

## 📬 Informações de Entrega e Avaliação

*   **Status atual:** 🚧 Projeto em desenvolvimento progressivo.
*   **Desenvolvedora:** Raquel Taveira 
*   **GitHub:** [Acesse meu perfil](https://github.com/Raquel-Beep)

---
Submetido como repositório público para avaliação de competências backend.
