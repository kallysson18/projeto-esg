# Projeto ESG Inteligente - Spring Boot + Docker

## 🚀 Como executar

```bash
docker compose up --build

#### Projeto ESG Inteligente - Spring Boot + Docker

## 🚀 Como executar

docker compose up --build
###Instruções:
Certifique-se de ter o Docker e o Docker Compose instalados.
Clone o repositório ou extraia o arquivo .ZIP.
Abra o terminal na pasta raiz do projeto.
Execute o comando: docker compose up --build
Acesse as aplicações no navegador:
Ambiente de Produção: http://localhost:8080
Ambiente de Staging: http://localhost:8081
Pipeline CI/CD
Ferramenta utilizada: GitHub Actions.
Funcionamento: O pipeline é disparado automaticamente a cada push na branch main.
Etapas:
Checkout code: Copia o código para o ambiente do GitHub.
Set up Java: Configura o JDK 21 (Eclipse Temurin).
Build with Maven: Compila o projeto e gera o arquivo .jar.
Docker Build (Local): A imagem é construída localmente via Dockerfile para garantir a portabilidade.
Containerização
Dockerfile: Utilizamos uma imagem base do Java 21 para criar um container leve e eficiente. O arquivo realiza a cópia do .jar gerado pelo Maven e expõe a porta 8080.
Orquestração: O docker-compose.yml foi configurado para subir duas instâncias da mesma imagem, simulando ambientes de Staging (porta 8081) e Produção (porta 8080), utilizando redes isoladas e nomes de containers específicos.
Tecnologias Utilizadas
Linguagem: Java 21
Framework: Spring Boot 3.x
Banco de Dados: H2 (In-memory)
Container: Docker & Docker Compose
CI/CD: GitHub Actions
IDE: IntelliJ IDEA

## Pipeline CI/CD:<img width="1440" height="900" alt="Captura de Tela 2026-04-21 às 12 43 04" src="https://github.com/user-attachments/assets/2f8008f5-c09e-4f1e-801e-f3e9701022de" />

## Containerização:<img width="1179" height="665" alt="Captura de Tela 2026-04-21 às 12 35 41" src="https://github.com/user-attachments/assets/f1c7ddc8-6e3b-43fb-afb7-28a86fd79a0a" />

## Prints do funcionamento:

### Logs da Orquestração (Docker Compose)
<img width="937" height="566" alt="Captura de Tela 2026-04-21 às 12 23 05" src="https://github.com/user-attachments/assets/900f396b-89f7-472a-82a8-5fa8bc2be1de" />

### Ambiente de Produção (Porta 8080)
<img width="1440" height="900" alt="Captura de Tela 2026-04-20 às 20 23 54" src="https://github.com/user-attachments/assets/72ff9448-314d-4909-a92f-eb0ff3a1958f" />


### Ambiente de Staging (Porta 8081)
<img width="1440" height="900" alt="Captura de Tela 2026-04-21 às 12 24 16" src="https://github.com/user-attachments/assets/b5e6cf57-67bb-46c4-9910-b54948cb343c" />


## ✅ Checklist de Entrega

- [OK] Projeto compactado em .ZIP com estrutura organizada
- [OK] Dockerfile funcional
- [OK] docker-compose.yml ou arquivos Kubernetes
- [OK] Pipeline com etapas de build, teste e deploy
- [OK] README.md com instruções e prints
- [OK] Documentação técnica com evidências (PDF ou PPT)
- [OK] Deploy realizado nos ambientes staging e produção

