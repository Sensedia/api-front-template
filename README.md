# Api Front Template
## Template para projetos java de "api-front"

Esse projeto java tem como base o framework **Spring Boot**.
Um Api-Front tem como objetivo principal realizar a tranformação de um protocolo especifico para rest

O Projeto segue a arquitetura de 3 camadas, onde cada camada é representada pelos pacotes:

- **interface** (camada responsável pela exibição de informações do sistema ao usuário e também por interpretar comandos do usuário);

- **domain** (representa os conceitos, regras e lógicas de negócio);

- **infrastructure** (fornece recursos técnicos que darão suporte às camadas superiores. São normalmente as partes de um sistema responsáveis por persistência de dados, conexões com bancos de dados, envio de mensagens por redes, gravação e leitura de discos, etc.).
