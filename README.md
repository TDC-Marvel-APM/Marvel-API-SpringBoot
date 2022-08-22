# Marvel-API-SpringBoot

![](https://static.tumblr.com/04af51dfb06e67ea9326f3b650368444/omquokj/7KIof5vc5/tumblr_static_2rsye1x7vwg0goo4swwwwksok.gif)

## Sobre
Projeto feito para demonstração de Execução de APM com ELK(Elastic, Logstash e Kibana) na palestra sobre ELK, APM e Observabilidade - Observabilidade e implementação na pratica e seus conceitos de uso.

Versão do Java - java version "1.8.0_311"

## Passo a passo de como utilizar 💡

1. Acesse o site https://cloud.mongodb.com/ e crie sua conta por lá
2. Acessando sua conta crie um novo projeto e deixe o nome TDC - Testes e em add membros deixe como está no caso ele vai deixar você seu usuario de cadastro como owner
3. depois de criar clique na aba Network Access e clicando nele clica em Add IP Address e seleciona ALLOW ACCESS FROM ANYWHERE e clica em confirm
4. depois de criar clique na aba clica em Add New Database User e em Password Authentication coloque um user e passwoard que desejar
5. Clica na aba de DataBase clica em Create e seleciona o banco share, e clica em confirm, ele demora um pouco para carregar mas logo ja estará criado seu banco
6. Clica em Connect e logo em seguida seleciona connect your application e nele você  receberá na parte Add your connection string into your application code a url do nosso banco, copia e cola isso dentro da pasta ./src/main/resources dessa maneira:
    ```
    spring.data.mongodb.uri=mongodb+srv://giovana:queijo@cluster0.e2ye4.mongodb.net/?retryWrites=true&w=majority
    spring.data.mongodb.database=Marvel
    ```
7.Dentro do projeto vocês verão um arquivo chamado Marvel Universe.postman_collection.json com ele vocês conseguem importar no seu postman e utilizar as rotas desse projeto


## Tecnologias usadas nesse projeto projeto 💻

- 🍃 [MongoDB](https://www.mongodb.com/pt-br)
- 💎 [SpringBoot](https://spring.io/projects/spring-boot)
- ☕️ [Java](https://www.java.com/pt-BR/)
- 🦌 [ELK](https://www.elastic.co/pt/what-is/elk-stack)
- 💌 [Postman](https://www.postman.com/)