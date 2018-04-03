# Api Front Template
## Template para projetos java de "api-front"

Esse projeto java tem como base o framework **Spring Boot**. Para rodar este projeto basta executar a classe [**Application.java**](https://github.com/Sensedia/api-front-template/blob/master/src/main/java/com/sensedia/apifront/projectname/Application.java) que possui a anotação de inicialização do springboot e que se encronta no pacote base do projeto.

Por padrão utilizamos um arquivo de configuração para cada ambiente que existir, esses arquivos de configuração ficam na pasta de 
[**resources**](https://github.com/Sensedia/api-front-template/tree/master/src/main/resources).


Um Api-Front tem como objetivo principal realizar a tranformação de um protocolo especifico para rest

O Projeto segue a arquitetura de 3 camadas, onde cada camada é representada pelos pacotes:

1. **interface** (camada responsável por receber e enviar informações para sistemas/clientes externos);
  ⋅⋅* controller (pacote que contem os controllers responsáveis por receber e responder as requisições http);
  ⋅⋅* converter (pocote que contém as classes responsáveis por converter os payload de request e response);
  ⋅⋅* validator (pacote que contém as classes responsáveis por validar os payloads de request);
  ⋅⋅* payload (pacote que contém as classes que representam o request e o response);
  ⋅⋅* interceptor (pacote que contem interceptors das requisições http)

2. **domain** (representa os conceitos, regras e lógicas de negócio);

3. **infrastructure** (fornece recursos técnicos que darão suporte às camadas superiores. São normalmente as partes de um sistema responsáveis por persistência de dados, conexões com bancos de dados, envio de mensagens por redes, gravação e leitura de discos, etc.).
