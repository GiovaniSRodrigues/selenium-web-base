# 🧪 Projeto de Testes Automatizados com Selenium + Java (Modularizado)

Esse é um framework base para automação de testes com Java e Selenium, pensando em ser **modularizado e reutilizável** para ser usado em qualquer projeto.  

A estrutura foi desenvolvida com foco em separação de responsabilidades, organização e escalabilidade.

---

## 📦 Estrutura Modular

O projeto é dividido em **módulos Maven** independentes:

| Módulo            | Responsabilidade                                                                 |
|-------------------|-----------------------------------------------------------------------------------|
| `selenium-config` | Configuração central do Selenium (driver, logs, screenshots)                      |
| `test-commons`    | Utilitários genéricos e reutilizáveis (datas, JSON, arquivos, enums, etc.)        |
| `test-core`       | Classe base de testes, gerenciamento de setup/teardown e lógica comum             |
| `test-cases`      | Os testes automatizados, organizados por domínio (pode usar JUnit ou Cucumber)    |

---

## 💻 Como importar no IntelliJ IDEA

Como se trata de um projeto **multi-módulo**, o IntelliJ não importa automaticamente todos os subprojetos.

### 🔁 Etapas:

1. Abra o projeto `test-framework` como **diretório raiz**
2. Vá em:  
   `File` > `Project Structure` > `Modules`
3. Clique no `+` (canto superior esquerdo) > **Import Module**
4. Selecione o `pom.xml` de cada subpasta:  
   - `selenium-config/pom.xml`  
   - `test-commons/pom.xml`  
   - `test-core/pom.xml`  
   - `test-cases/pom.xml`
5. Clique em OK para finalizar

---

## ▶️ Como rodar os testes

### 🧪 Usando Maven (linha de comando)

Para rodar os testes:
 - `mvn clean install`
 - `mvn test -pl test-cases` 

---

### 🧱 Tecnologias utilizadas
Java 17+

Maven

Selenium 4

WebDriverManager

JUnit 5

Cucumber (opcional)

SLF4J + Logback

Modularização com Maven multi-module

---

### 📁 Estrutura de pastas resumida
test-framework/
│
├── selenium-config/     → DriverFactory, Logger, ScreenshotManager
├── test-commons/        → Utils, constantes e enums
├── test-core/           → BaseTest e lógica comum
├── test-cases/          → Testes automatizados
│   ├── pages/           → PageObjects (POM)
│   ├── steps/           → Step Definitions (Cucumber)
│   └── features/        → Arquivos .feature (Cucumber)
