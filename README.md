# 📋 To-do List API - Java + Spring Boot

Uma API REST simples para gerenciar tarefas, desenvolvida com **Java 17**, **Spring Boot** e **Maven**. O objetivo deste projeto é praticar a criação de uma API com as operações básicas de CRUD usando armazenamento em memória.

---

## 🚀 Como rodar o projeto

### ✅ Pré-requisitos
- Java 17+
- Maven 3.6+

### ▶️ Executando localmente

```bash
# Clone o repositório
git clone https://github.com/alguemqualquer123/api_store_java.git
cd api_store_java

# Execute a aplicação
mvn spring-boot:run

A API estará disponível em: http://localhost:8080


# 🔧 Endpoints da API
| Método | Rota          | Descrição               |
| ------ | ------------- | ----------------------- |
| POST   | `/tasks`      | Criar uma nova tarefa   |
| GET    | `/tasks`      | Listar todas as tarefas |
| GET    | `/tasks/{id}` | Buscar tarefa por ID    |
| DELETE | `/tasks/{id}` | Remover tarefa por ID   |

# 🧱 Estrutura do Projeto

todo-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.todo/
│   │   │       ├── controller/   # Controladores REST
│   │   │       ├── model/        # Modelo de dados
│   │   │       ├── service/      # Lógica de negócio
│   │   │       └── TodoApiApplication.java
│   │   └── resources/
│   │       └── application.properties
└── pom.xml


# ✅ Critérios de Aceite

Código roda com mvn spring-boot:run

Estrutura limpa, separada por camadas (MVC)

Todas as rotas funcionam corretamente

Boas práticas aplicadas (nomes claros, classes organizadas)

README explicativo


# 🌱 Extras (opcional)

Adicionar campo completed (boolean) na tarefa

Criar rota PUT /tasks/{id}/complete para marcar como concluída

Usar banco H2 para persistência simples dos dados



# 📫 Contato

Dúvidas ou sugestões? Fique à vontade para abrir uma issue ou me chamar no Discord!# to-do-list-tarefa
# to-do-list-tarefa
# to-do-list-tarefa
