# Cadastro de Usuários

Bem-vindo ao projeto **Cadastro de Usuários**, uma aplicação Spring Boot que implementa um CRUD (Create, Read, Update, Delete) para gerenciamento de usuários. Este projeto utiliza Java 24, Spring Boot 3.5.5, Spring Data JPA e o banco de dados em memória H2 para demonstração.

## Descrição do Projeto

Este é um projeto de exemplo que demonstra a criação de uma API RESTful para gerenciamento de usuários, com operações básicas de CRUD. A aplicação foi construída com Spring Boot e utiliza o banco de dados H2 para persistência de dados durante a execução.

### Funcionalidades

- **Criar**: Adicionar novos usuários ao sistema.
- **Ler**: Consultar todos os usuários ou um usuário específico por ID.
- **Atualizar**: Modificar informações de um usuário existente.
- **Deletar**: Remover um usuário do sistema.

## Tecnologias Utilizadas

- **Java 24**: Linguagem de programação principal.
- **Spring Boot 3.5.5**: Framework para construção da aplicação.
- **Spring Data JPA**: Para interação com o banco de dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Lombok**: Para redução de código boilerplate.
- **Gradle**: Ferramenta de build e gerenciamento de dependências.
- **JUnit**: Para testes unitários.

## Pré-requisitos

Para executar este projeto, você precisará ter instalado:

- [Java 24 JDK](https://www.oracle.com/java/technologies/javase/jdk24-downloads.html)
- [Gradle](https://gradle.org/install/) (ou use o wrapper incluído no projeto)
- Um IDE como IntelliJ IDEA, Eclipse ou VS Code (opcional, mas recomendado)

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/cadastro-usuario.git
   cd cadastro-usuario
   ```

2. **Execute a aplicação**:
   Use o Gradle wrapper para compilar e executar a aplicação:
   ```bash
   ./gradlew bootRun
   ```

3. **Acesse a API**:
   A aplicação estará disponível em `http://localhost:8080`. Você pode usar ferramentas como Postman ou cURL para testar os endpoints.

4. **Acesse o console do H2** (opcional):
   O banco de dados H2 pode ser acessado em `http://localhost:8080/h2-console`. Use as credenciais padrão definidas no arquivo `application.properties` (se configurado).

## Estrutura do Projeto

```plaintext
cadastro-usuario/
├── src/
│   ├── main/
│   │   ├── java/com/Vitor/cadastro_usuario/
│   │   └── resources/
│   └── test/
├── gradle/
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── .gitignore
├── .gitattributes
└── HELP.md
```

- **src/main/java**: Contém o código-fonte da aplicação.
- **src/main/resources**: Arquivos de configuração, como `application.properties`.
- **src/test**: Testes unitários e de integração.
- **build.gradle**: Configuração do Gradle com dependências e plugins.
- **settings.gradle**: Configuração do nome do projeto.
- **gradlew** e **gradlew.bat**: Scripts para executar o Gradle em diferentes sistemas operacionais.
- **.gitignore**: Arquivos e diretórios ignorados pelo Git.
- **.gitattributes**: Configurações para tratamento de finais de linha.

## Endpoints da API

A API possui os seguintes endpoints (exemplo):

- `POST /api/usuarios`: Cria um novo usuário.
- `GET /api/usuarios`: Lista todos os usuários.
- `GET /api/usuarios/{id}`: Busca um usuário por ID.
- `PUT /api/usuarios/{id}`: Atualiza um usuário existente.
- `DELETE /api/usuarios/{id}`: Remove um usuário.

**Nota**: Os endpoints exatos dependem da implementação das classes no pacote `com.Vitor.cadastro_usuario`. Consulte o código ou a documentação da API para detalhes.

## Como Contribuir

1. Faça um fork do repositório.
2. Crie uma branch para sua feature: `git checkout -b minha-feature`.
3. Faça commit das suas alterações: `git commit -m 'Adiciona minha feature'`.
4. Envie para o repositório remoto: `git push origin minha-feature`.
5. Abra um Pull Request.

## Referências

- [Documentação oficial do Gradle](https://docs.gradle.org)
- [Guia do Spring Boot Gradle Plugin](https://docs.spring.io/spring-boot/3.5.5/gradle-plugin)
- [Spring Web](https://docs.spring.io/spring-boot/3.5.5/reference/web/servlet.html)
- [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.5/reference/data/sql.html#data.sql.jpa-and-spring-data)
- [Guia: Construindo uma API REST com Spring](https://spring.io/guides/gs/rest-service/)
- [Guia: Acessando dados com JPA](https://spring.io/guides/gs/accessing-data-jpa/)

## Licença

Este projeto está licenciado sob a [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).
