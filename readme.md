# README - API REST de Gerenciamento de Produtos

## Visão Geral

Esta aplicação é uma API REST desenvolvida como parte do desafio final do Bootcamp "Arquiteto(a) de Software". A API foi projetada utilizando Java com Spring Boot, aplicando o padrão arquitetural Model-View-Controller (MVC) para garantir organização, modularidade e escalabilidade. Ela permite realizar operações CRUD (Create, Read, Update, Delete) e outras funcionalidades adicionais, como busca por nome e contagem de registros.

## Funcionalidades

A API oferece as seguintes operações:

1. **CRUD de Produtos**:

   - **Create**: Adicionar um novo produto.
   - **Read**: Listar todos os produtos ou buscar por ID.
   - **Update**: Atualizar um produto existente.
   - **Delete**: Remover um produto.

2. **Funcionalidades Extras**:

   - **Contagem de Registros**: Endpoint para retornar o número total de produtos cadastrados.
   - **Busca por Nome**: Endpoint que retorna produtos com base em termos do nome.

## Estrutura de Pastas

A organização do projeto segue o padrão recomendado:

└── src/main/java/com/desafiofinal/api<br>
├── controller<br>
│ └── ProdutoController.java<br>
├── model<br>
│ └── Produto.java<br>
├── repository<br>
│ └── ProdutoRepository.java<br>
├── service<br>
│ └── ProdutoService.java <br>
└── ApiApplication.java

                                    
- **controller**: Contém os endpoints REST.
- **model**: Define as entidades de domínio.
- **repository**: Gerencia a persistência com Spring Data JPA.
- **service**: Implementa a lógica de negócios.
- **ApiApplication**: Classe principal para inicializar o projeto.

## Configuração e Execução

### Pré-requisitos

- **Java 17** ou superior instalado.
- **Maven** para gerenciamento de dependências.

### Configuração Inicial

1. Clone este repositório:

   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd <PASTA_DO_PROJETO>

2. Certifique-se de que o Maven está instalado e configurado corretamente:
   
   ```bash
   mvn -version

3. Acesse a aplicação em: http://localhost:8080<br>
(OBS Foi feito apenas uma view para demonstrar a execução do projeto, mas as interações poderão ser feitas via postman e insomnia ou qualquer ferramenta/view que faça uma requisição para os endpoints do projeto)

### Banco de Dados
- Esta aplicação utiliza o banco de dados em memória H2.
- Para acessar o console do H2, use:
    - URL: http://localhost:8080/h2-console
    - JDBC URL: jdbc:h2:mem:testdb
    - Usuário: sa
    - Senha: (deixe em branco)
    - 
### Endpoints Disponíveis
#### CRUD de Produtos

1. Listar todos os produtos
- GET /produtos
2. Buscar produto por ID

- GET /produtos/{id}
3. Criar um novo produto

- POST /produtos
- Corpo da Requisição:
    ```json
    {
    "nome": "Produto A",
    "preco": 100.0,
    "descricao": "Descrição do Produto A"
    }

4. Atualizar produto

- PUT /produtos/{id}
5. Deletar produto

- DELETE /produtos/{id}
#### Funcionalidades Extras
1. Contar produtos cadastrados

- GET /produtos/contar
2. Buscar produtos por nome

- GET /produtos/nome/{nome}
#### Testes
- A API foi testada manualmente utilizando o Postman.
#### Melhorias Futuras
- Implementar testes automatizados com JUnit e Mockito.
- Adicionar paginação e ordenação nos endpoints de listagem.
- Integrar Swagger para documentação interativa da API.
  
Autor
Desenvolvido por [Glayson Leonardo](https://www.linkedin.com/in/glayson1997/)
