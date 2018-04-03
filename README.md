# Api Front Template
## Template para projetos java de "api-front"

Esse projeto java tem como base o framework **Spring Boot**. Para rodar este projeto basta executar a classe **Application.java** que possui a anotação de inicialização do springboot e que se encronta no pacote base do projeto.

Por padrão utilizamos um aruivo de configuração para cada ambiente que existir, esse arquivo de configuração ficam na pasta de 
[**resources**](https://github.com/Sensedia/api-front-template/tree/master/src/main/resources).


Um Api-Front tem como objetivo principal realizar a tranformação de um protocolo especifico para rest

O Projeto segue a arquitetura de 3 camadas, onde cada camada é representada pelos pacotes:

- **interface** (camada responsável por receber e enviar informações para sistemas/clientes externos);

- **domain** (representa os conceitos, regras e lógicas de negócio);

- **infrastructure** (fornece recursos técnicos que darão suporte às camadas superiores. São normalmente as partes de um sistema responsáveis por persistência de dados, conexões com bancos de dados, envio de mensagens por redes, gravação e leitura de discos, etc.).
