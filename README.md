# 📦 Sistema de Cadastro de Fornecedores

Este projeto é um sistema simples de **CRUD (Create, Read, Update, Delete)** de **fornecedores**, desenvolvido em **Java** com conexão a um banco de dados **MySQL**.

Foi proposto pelos professores do curso para fins didáticos, com o objetivo de ensinar como criar aplicações Java com persistência de dados usando JDBC.

---

## 🚀 Tecnologias utilizadas

- Java 
- MySQL 8
- JDBC (Driver: `mysql-connector-java`)
- Maven
- IntelliJ IDEA e NetBeans
- Biblioteca [dotenv-java](https://github.com/cdimascio/dotenv-java)

---

## 🧪 Como executar

### 1. Clone o projeto

```bash
git clone https://github.com/Joao-V-Dias/fornecedores.git
```

### 2. Configure o banco de dados MySQL

```sql
CREATE DATABASE bd_fornecedor;

USE bd_fornecedor;

CREATE TABLE fornecedor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cnpj VARCHAR(20) NOT NULL UNIQUE
);
```

### 3. Configure a conexão com o banco
Crie um arquivo .env na raiz do projeto com:

```ini
DB_URL=jdbc:mysql://localhost:3306/bd_fornecedor
DB_USER=root
DB_PASS=sua_senha
```