# Gerenciamento de Produtos

Este é um projeto completo de uma aplicação de gerenciamento de produtos, desenvolvido como uma aplicação full-stack. A aplicação utiliza Java com Spring Boot para o backend e Vue.js para o frontend. O objetivo deste projeto é permitir que os usuários gerenciem produtos, incluindo a listagem, adição, edição e exclusão de produtos, com validação de entrada de dados.

![Captura de tela da aplicação](screenshot.png)

## Recursos Principais

- **Listagem de Produtos**: Visualize todos os produtos cadastrados em uma tabela.

- **Adição de Novos Produtos**: Adicione novos produtos com informações como nome, quantidade e valor.

- **Edição de Produtos**: Edite os detalhes dos produtos existentes.

- **Exclusão de Produtos**: Remova produtos da lista quando não forem mais necessários.

- **Validação de Entrada de Dados**: Garanta que os dados inseridos sejam válidos com mensagens de erro detalhadas.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- **Java Development Kit (JDK)**: A aplicação backend é desenvolvida em Java e requer o JDK 8 ou superior.

- **Maven**: Utilizamos o Maven para gerenciar as dependências do projeto.

- **Node.js**: O ambiente Vue.js requer o Node.js para gerenciar pacotes.

- **Vue CLI**: Instale o Vue CLI para executar o servidor de desenvolvimento do frontend.

- **Banco de Dados**: Configure seu banco de dados no arquivo `src/main/resources/application.properties`. Por padrão, este projeto está configurado para usar o H2 Database para simplificar a configuração.

## Configuração

### Backend (Spring Boot)

1. Abra o projeto em seu IDE preferido.

2. Configure o banco de dados no arquivo `src/main/resources/application.properties` (caso necessário). Aqui está um exemplo de configuração para o H2 Database:

   ```properties
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=password
   spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

# Executar a Aplicação Spring Boot

1. Para executar a aplicação Spring Boot, siga os passos abaixo:

   - Abra o seu ambiente de desenvolvimento (IDE) e importe o projeto.

   - Localize a classe `ProductApplication.java` no projeto.

   - Execute esta classe como um aplicativo Java para iniciar o servidor Spring Boot.

# Iniciar o Frontend (Vue.js)

2. Para iniciar o frontend Vue.js, siga os passos abaixo:

   - Abra o terminal e navegue até o diretório `frontend` do projeto.

   - Execute o comando `npm install` para instalar todas as dependências do frontend.

   - Após a instalação das dependências, inicie o servidor de desenvolvimento com o comando `npm run serve`.

# Uso

Após configurar o projeto, você pode começar a usar a aplicação:

- Acesse a aplicação no seu navegador em `http://localhost:8080/demo/products` (ou a porta configurada) para interagir com o gerenciamento de produtos.

- A tela principal exibe uma tabela de produtos existentes, se houver algum.

- Para adicionar um novo produto, preencha os campos "Nome," "Quantidade," e "Valor" no formulário no topo da página e clique em "Salvar."

- Para editar um produto existente, clique no ícone de lápis na coluna "Opções" da tabela. Os campos do produto serão preenchidos automaticamente no formulário. Faça as alterações desejadas e clique em "Salvar" para atualizar o produto.

- Para excluir um produto, clique no ícone de lixeira na coluna "Opções" da tabela. Confirme a exclusão quando solicitado.

# Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir um problema ou enviar um pull request.

# Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.

