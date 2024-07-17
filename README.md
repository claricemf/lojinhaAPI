# lojinhaAPI
**Automação da API REST com JUnit e RestAssured**

Este projeto tem como objetivo a automatização dos cenários de testes para os endpoints de Usuário, Produto e Componente da API REST. 

___

**Estrutura do Projeto:**

Eu estou utilizando a seguinte estrutura para este projeto:

```
lojinhaAPI/
  main/
      java/config/
          Configuration.java
          ConfigurationManager.java
  resources/
      api.properties
  test/java
      dataFactory/
          ComponenteDataFactory.java
          ProdutoDataFactory.java
          UsuarioDataFactory.java
      modulos/
          componente/
              ComponenteTest.java
          produto/
              ProdutoTest.java
          usuario/
              UsuarioTest.java
          BaseAPI.java
      pojo/
          ComponentePojo.java
          ProdutoPojo.java
          UsuarioPojo.java
```
