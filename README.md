> 🌐 **This README is available in two languages** — [English](#-receptor-simples-com-postman--simple-receiver-with-postman) below, [Português](#-receptor-simples-com-postman) after.

---

<br>

# 📡 Receptor Simples com Postman — Simple Receiver with Postman

> Spring Boot project focused on building REST API endpoints that **receive and process external HTTP requests**, tested end-to-end using **Postman** as the HTTP client.


---

## 🎯 Goal

Practice creating endpoints that **accept incoming data** through HTTP `POST` requests, simulating real-world client-server communication. Postman was used throughout the project to act as the client, sending requests and validating the server's responses — no frontend needed.

---

## 🧩 Classes

### `ReceptorController`

The entry point for incoming data. This controller exposes a `POST` endpoint that reads the request body and processes it as a Java object — mimicking real use cases like user registration or form submissions.

**Key concept explored:** the `@RequestBody` annotation, which binds the HTTP request body directly to a method parameter, handling deserialization automatically.

**Postman's role here:** sending `POST` requests with a JSON body to test whether the server correctly receives and processes the payload.

---

### `SensorController`

A practical, logic-driven controller that receives a temperature value and evaluates it against a threshold (30°C), returning different responses depending on the input:

- 🌡️ **Above 30°C** → high temperature warning
- ✅ **30°C or below** → temperature within safe range

This class reinforces how endpoints can contain real business logic beyond just returning data.

---

## 🔍 How Postman Was Used

Postman is a tool that allows developers to simulate HTTP requests without a frontend interface. In this project, it served as the **client layer**, enabling:

| Action | Description |
|---|---|
| Send `POST` requests | Submitted JSON payloads to `ReceptorController` to verify correct body parsing |
| Test conditional logic | Sent different temperature values to `SensorController` and validated each response |
| Inspect server responses | Verified HTTP status codes and response bodies in real time |
| Reproduce client-server flow | Simulated the full request-response cycle typical of real-world API consumption |

---

## 🛠️ Spring Annotations Used

| Annotation | Purpose |
|---|---|
| `@RestController` | Marks the class as an HTTP controller, enabling it to handle requests and return data directly in the response body |
| `@PostMapping` | Maps a method to handle incoming `POST` HTTP requests — typically used for sending data to the server |
| `@RequestBody` | Binds the HTTP request body to a method parameter and automatically deserializes the JSON into a Java object |

---

## 💡 Key Learnings

- How `POST` requests differ from `GET` and when to use them
- How Spring handles request body deserialization via `@RequestBody`
- How Postman bridges the gap between server development and client testing
- How to embed conditional business logic inside REST controllers

---

## 🚀 Tech Stack

- **Java** — main language
- **Spring Boot** — REST API framework
- **Postman** — API testing and client simulation

---

<br>
<br>

---

---

<br>

# 📡 Receptor Simples com Postman

> Projeto Spring Boot voltado para a criação de endpoints REST que **recebem e processam requisições HTTP externas**, com testes realizados de ponta a ponta usando o **Postman** como cliente HTTP.

🔗 [Ver Repositório](https://github.com/aliciaBalbino/Receptor-Simples-com-Postman)

---

## 🎯 Objetivo

Praticar a criação de endpoints que **aceitam dados externos** via requisições HTTP do tipo `POST`, simulando a comunicação real entre cliente e servidor. O Postman foi utilizado ao longo do projeto para agir como cliente, enviando requisições e validando as respostas do servidor — sem necessidade de frontend.

---

## 🧩 Classes

### `ReceptorController`

O ponto de entrada para os dados recebidos. Este controlador expõe um endpoint `POST` que lê o corpo da requisição e o processa como um objeto Java — simulando casos reais como cadastro de usuários ou envio de formulários.

**Conceito-chave explorado:** a anotação `@RequestBody`, que vincula o corpo da requisição HTTP diretamente a um parâmetro do método, realizando a desserialização automaticamente.

**Papel do Postman aqui:** enviar requisições `POST` com corpo em JSON para verificar se o servidor recebe e processa corretamente o payload.

---

### `SensorController`

Um controlador prático e orientado à lógica, que recebe um valor de temperatura e o avalia em relação a um limite (30°C), retornando diferentes respostas conforme a entrada:

- 🌡️ **Acima de 30°C** → alerta de temperatura elevada
- ✅ **30°C ou abaixo** → temperatura dentro do limite seguro

Essa classe reforça como endpoints podem conter lógica de negócio real, além de apenas retornar dados.

---

## 🔍 Como o Postman Foi Usado

O Postman é uma ferramenta que permite a desenvolvedores simular requisições HTTP sem uma interface frontend. Neste projeto, ele atuou como a **camada cliente**, possibilitando:

| Ação | Descrição |
|---|---|
| Enviar requisições `POST` | Submeteu payloads JSON ao `ReceptorController` para verificar a leitura correta do body |
| Testar lógica condicional | Enviou diferentes valores de temperatura ao `SensorController` e validou cada resposta |
| Inspecionar respostas do servidor | Verificou códigos de status HTTP e corpos de resposta em tempo real |
| Reproduzir o fluxo cliente-servidor | Simulou o ciclo completo de requisição-resposta típico do consumo de APIs reais |

---

## 🛠️ Anotações Spring Utilizadas

| Anotação | Função |
|---|---|
| `@RestController` | Marca a classe como um controlador HTTP, habilitando-a a lidar com requisições e retornar dados diretamente no corpo da resposta |
| `@PostMapping` | Mapeia um método para tratar requisições HTTP do tipo `POST` — geralmente usadas para enviar dados ao servidor |
| `@RequestBody` | Vincula o corpo da requisição HTTP a um parâmetro do método e desserializa automaticamente o JSON em um objeto Java |

---

## 💡 Principais Aprendizados

- Como requisições `POST` diferem de `GET` e quando utilizá-las
- Como o Spring lida com a desserialização do corpo da requisição via `@RequestBody`
- Como o Postman preenche a lacuna entre o desenvolvimento do servidor e os testes do cliente
- Como incorporar lógica de negócio condicional dentro de controllers REST

---

## 🚀 Tecnologias

- **Java** — linguagem principal
- **Spring Boot** — framework para APIs REST
- **Postman** — teste de API e simulação de cliente
