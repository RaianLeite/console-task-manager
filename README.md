# 🚀 Console Task Manager

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

> **Um gerenciador de tarefas robusto, limpo e eficiente rodando diretamente no console.**

---

## 📖 Sobre o Projeto

Este projeto é um sistema de gerenciamento de tarefas (CRUD) desenvolvido em **Java Puro**.

Ele nasceu de uma iniciativa pessoal para consolidar e expandir os conhecimentos adquiridos durante o curso de Java do professor **Nélio Alves**. Enquanto o curso forneceu a base teórica, este projeto serviu como meu laboratório prático para aplicar conceitos de **Arquitetura de Software**, **Clean Code** e recursos modernos do Java (como **Stream API** e **Lambdas**) em um cenário real.

O objetivo não foi apenas "fazer funcionar", mas fazer o código ser **legível, escalável e profissional**.

---

## ✨ Funcionalidades

O sistema permite ao usuário gerenciar sua rotina através de um menu interativo no terminal:

* ✅ **Adicionar Tarefa:** Criação de tarefas com título, descrição e data de vencimento.
* 📋 **Listar Todas:** Visualização completa da lista de tarefas.
* 🔍 **Filtragem Inteligente:** Listar apenas tarefas **Pendentes** ou **Concluídas**.
* 🔄 **Atualizar Status:** Marcar tarefas como concluídas através do ID.
* 🗑️ **Exclusão:** Remover tarefas da lista de forma segura.
* 🛡️ **Validações:** Tratamento de erros para datas inválidas e IDs inexistentes.

---

## 🛠️ Tecnologias e Conceitos Aplicados

Este projeto vai além do básico. Aqui estão as tecnologias e padrões que utilizei:

* **Linguagem:** Java 17+
* **Padrão de Arquitetura:** Separação em Camadas (Model, Service, App/View).
* **Java Streams API:** Para filtragem e busca eficiente de dados (`filter`, `findFirst`, `collect`).
* **Lambdas & Method References:** Para um código mais conciso e moderno.
* **POO Sólida:** Encapsulamento, Enums e Responsabilidade Única (SRP).
* **Tratamento de Exceções:** Uso de `try-catch` para garantir que o programa não pare inesperadamente.

---

## 🏗️ Estrutura do Projeto

A organização foi pensada para facilitar a manutenção e a leitura do código:

```text
src/
└── taskmanager/
    ├── app/           # Interface com o Usuário (Main, Menu, Inputs)
    │   └── Main.java
    ├── model/         # Representação dos Dados (Entidades)
    │   ├── Task.java
    │   └── TaskStatus.java
    └── service/       # Regra de Negócio (Lógica, CRUD, Streams)
        └── TaskService.java

```

---
## 🖥️ Demonstração de Uso
Como o sistema interage com o usuário no console:

```
=== GERENCIADOR DE TAREFAS ===
1 - Adicionar Nova Tarefa
2 - Listar Tarefas Pendentes
3 - Listar Tarefas Concluídas
...

Escolha uma opção: 1

--- Nova Tarefa ---
Título: Estudar Spring Boot
Descrição: Focar em injeção de dependência
Data de Vencimento (aaaa-mm-dd): 2025-12-20
>> Tarefa adicionada com sucesso!
```

---

## 🚀 Como Rodar o Projeto
Pré-requisitos: Java JDK 17 ou superior instalado.

1. Clone o repositório:

```
git clone [https://github.com/raian-leite/console-task-manager.git](https://github.com/raian-leite/console-task-manager.git)
```
2. Abra na sua IDE favorita (Eclipse, IntelliJ, VS Code).

3. Localize o arquivo principal: ```src/taskmanager/app/Main.java```.

4. Execute a aplicação (Run as Java Application).

---

## 🧠 O Que Aprendi Desenvolvendo Isso?
Este projeto foi um divisor de águas nos meus estudos. As principais lições foram:

1. **O Poder da Organização:** Entendi na prática por que não devemos colocar toda a lógica na classe ```Main```. Separar a regra de negócio (```TaskService```) da interface (```Main```) tornou o código muito mais limpo.

2. **Domínio de Collections:** Aprofundei o uso de ```List```, ```ArrayList``` e como manipulá-las.

3. **Java Moderno:** Saí do loop ```for``` tradicional e aprendi a usar ```Streams``` e ```removeIf``` para escrever códigos mais elegantes e performáticos.

4. **Resolução de Problemas:** Enfrentei desafios reais (como limpar o buffer do Scanner e tratar datas) e busquei as melhores soluções.

---

## 🔮 Próximos Passos (Roadmap)
Estou constantemente evoluindo este projeto. As futuras melhorias incluem:

[ ] **Persistência de Dados:** Salvar as tarefas em arquivo ```.txt``` ou ```.json``` para não perder dados ao fechar.

[ ] **Integração com Banco de Dados:** Conectar com MySQL/PostgreSQL.

[ ] **Interface Gráfica:** Migrar para uma API REST com **Spring Boot**.

[ ] **Testes Unitários:** Implementar JUnit para testar o ```TaskService```.

## 📬 Contato
Gostou do projeto? Estou aberto a feedbacks e oportunidades na área de desenvolvimento Back-end/Java!

Desenvolvido com dedicação por **Raian Dal Piero Leite**.
