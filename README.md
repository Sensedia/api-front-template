# Api Front Template
## Template para projetos java de "api-front"

Esse projeto java tem como base o framework **Spring Boot**. Para rodar este projeto basta executar a classe [**Application.java**](https://github.com/Sensedia/api-front-template/blob/master/src/main/java/com/sensedia/apifront/projectname/Application.java) que possui a anotação de inicialização do springboot e que se encontra no pacote base do projeto.

Por padrão utilizamos um arquivo de configuração para cada ambiente que existir, esses arquivos de configuração ficam na pasta de 
[**resources**](https://github.com/Sensedia/api-front-template/tree/master/src/main/resources).


Um Api-Front tem como objetivo principal realizar a tranformação de um protocolo especifico para rest

O Projeto segue a arquitetura de 4 camadas, onde cada camada é representada pelos pacotes:

1. [**interface**](https://github.com/Sensedia/api-front-template/tree/master/src/main/java/com/sensedia/apifront/projectname/interfaces) (camada responsável por receber e enviar informações para sistemas/clientes externos);

2. [**business**](https://github.com/Sensedia/api-front-template/tree/master/src/main/java/com/sensedia/apifront/projectname/business) (representa os conceitos, regras e lógicas de negócio);

3. [**integration**](https://github.com/Sensedia/api-front-template/tree/master/src/main/java/com/sensedia/apifront/projectname/integration) (É a camada que realializa a cominucação direta com o legado e fornece a fonte dos dados e recursos técnicos que darão suporte às camadas acima);

4. [**infrastructure**](https://github.com/Sensedia/api-front-template/tree/master/src/main/java/com/sensedia/apifront/projectname/infrastructure) (É a camada que fornece recursos técnicos comuns e não funcionais para todas as outras camadas. São normalmente as partes de um sistema responsáveis por log, configurações, documentação e etc.).
