# Projeto ESG Inteligente - Spring Boot + Docker

## 🚀 Como executar

```bash
./mvnw clean package
docker build -t esg-app .
docker run -p 8080:8080 esg-app