# 🚀 Console Task Manager

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

> **Um gerenciador de tarefas robusto, limpo e eficiente rodando diretamente no console.**

---

## 📖 Sobre o Projeto

Este projeto é um sistema de gerenciamento de tarefas (CRUD) desenvolvido em **Java Puro**.

Ele nasceu de uma iniciativa pessoal para consolidar os conhecimentos adquiridos no curso de Java do professor **Nélio Alves**, servindo como um laboratório prático para aplicar conceitos de:

- **Arquitetura de Software**
- **Clean Code**
- **POO Moderna**
- **Stream API e Lambdas**

O objetivo foi ir além do “funcionar”, criando um código **limpo, escalável e profissional**.

---

## ✨ Funcionalidades

O sistema permite ao usuário gerenciar sua rotina através de um menu simples e intuitivo:

- ✅ **Adicionar Tarefa:** Título, descrição e data de vencimento.  
- 📋 **Listar Todas as Tarefas**  
- 🔍 **Filtrar por Status:** Pendentes ou concluídas.  
- 🔄 **Atualizar Status:** Marcar tarefas como concluídas usando o ID.  
- 🗑️ **Excluir Tarefa**  
- 🛡️ **Validações:** Datas inválidas, ID inexistente, e entrada de dados segura.

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **Java 17+**
- **Padrão em Camadas:** Model, Service e App  
- **Java Streams API** (`filter`, `collect`, `findFirst`, `removeIf`)  
- **Lambda Expressions**  
- **SOLID (SRP principalmente)**  
- **Tratamento de Exceções**  
- **Boas práticas de Clean Code**

---

## 🏗️ Estrutura do Projeto

```text
src/
└── taskmanager/
    ├── app/           # Interface com o Usuário (Main, Menu, Inputs)
    │   └── Main.java
    ├── model/         # Representação dos Dados (Entidades)
    │   ├── Task.java
    │   └── TaskStatus.java
    └── service/       # Regra de Negócio (CRUD, Lógica, Streams)
        └── TaskService.java
🖥️ Demonstração de Uso
plaintext
Copiar código
=== GERENCIADOR DE TAREFAS ===
1 - Adicionar Nova Tarefa
2 - Listar Tarefas Pendentes
3 - Listar Tarefas Concluídas
4 - Listar Todas as Tarefas
5 - Atualizar Status
6 - Remover Tarefa
0 - Sair

Escolha uma opção: 1

--- Nova Tarefa ---
Título: Estudar Spring Boot
Descrição: Focar em injeção de dependência
Data de Vencimento (aaaa-mm-dd): 2025-12-20

>> Tarefa adicionada com sucesso!

🚀 Como Rodar o Projeto
Pré-requisitos: Java JDK 17 ou superior instalado.

Clone o repositório:

Bash

git clone [https://github.com/raian-leite/console-task-manager.git](https://github.com/raian-leite/console-task-manager.git)
Abra na sua IDE favorita (Eclipse, IntelliJ, VS Code).

Localize o arquivo principal: src/taskmanager/app/Main.java.

Execute a aplicação (Run as Java Application).

🧠 O Que Aprendi Desenvolvendo Isso?
Este projeto foi um divisor de águas nos meus estudos. As principais lições foram:

O Poder da Organização: Entendi na prática por que não devemos colocar toda a lógica na classe Main. Separar a regra de negócio (TaskService) da interface (Main) tornou o código muito mais limpo.

Domínio de Collections: Aprofundei o uso de List, ArrayList e como manipulá-las.

Java Moderno: Saí do loop for tradicional e aprendi a usar Streams e removeIf para escrever códigos mais elegantes e performáticos.

Resolução de Problemas: Enfrentei desafios reais (como limpar o buffer do Scanner e tratar datas) e busquei as melhores soluções.

🔮 Próximos Passos (Roadmap)
Estou constantemente evoluindo este projeto. As futuras melhorias incluem:

[ ] Persistência de Dados: Salvar as tarefas em arquivo .txt ou .json para não perder dados ao fechar.

[ ] Integração com Banco de Dados: Conectar com MySQL/PostgreSQL.

[ ] Interface Gráfica: Migrar para uma API REST com Spring Boot.

[ ] Testes Unitários: Implementar JUnit para testar o TaskService.

📬 Contato
<div align="left"> <a href="https://www.linkedin.com/in/raian-leite/" target="_blank"> <img src="https://img.shields.io/badge/-LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"> </a> <a href="mailto:raianleite97@gmail.com"> <img src="https://img.shields.io/badge/-Email-D14836?style=for-the-badge&logo=gmail&logoColor=white"> </a> </div>
Desenvolvido com dedicação por Raian Dal Piero Leite.
