# 🚀 Event-Driven AI with Java

This project explores how to integrate **event-driven systems (Kafka, Spring Boot)** with **AI capabilities (LangChain4j, OpenAI, Vector DBs)**.  
The goal: build **real-time, intelligent pipelines** where AI is not just an endpoint, but part of the event flow.

---

## 🌟 Features
- Event-driven architecture using **Apache Kafka** + **Spring Cloud Stream**  
- AI integration via **LangChain4j** and **OpenAI API**  
- Vector database support (**PGVector**) for retrieval-augmented generation (RAG)  
- **Caching with Caffeine** to optimize cost/latency  
- REST + WebSocket APIs for live insights  
- Secure with **JWT authentication**  
- Containerized setup via **Docker Compose**  

---

## 📂 Project Structure
event-driven-ai-java/
├── ai-log-monitor/ # Kafka → AI summarizer for logs
├── ai-doc-qa/ # Event-driven PDF/Doc Q&A
├── shared-utils/ # Common libs (caching, auth, config)
├── docker-compose.yml # Local infra (Kafka + PGVector + App)
└── README.md #

---

## 🛠️ Tech Stack
- **Java 17+**  
- **Spring Boot 3.x** (WebFlux, Cloud Stream)  
- **Apache Kafka**  
- **LangChain4j** + **OpenAI API**  
- **Postgres + PGVector**  
- **Caffeine Cache**  
- **Docker Compose**  

---

## ⚡ Getting Started

### 1. Clone the repo
```bash
git clone https://github.com/akhilrana/event-driven-ai-java.git
cd event-driven-ai-java
