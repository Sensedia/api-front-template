# Camada de Interface

### Camada responsável pela exibição de informações do sistema ao usuário e também por interpretar comandos do usuário

Dentro do pacote de interface, podemos criar subpacotes, como:
  * **interface.controller** (pacote que contem os controllers responsáveis por receber e responder as requisições http);
  * **interface.converter** (pocote que contém as classes responsáveis por converter os payload de request e response);
  * **interface.validator** (pacote que contém as classes responsáveis por validar os payloads de request);
  * **interface.payload** (pacote que contém as classes que representam o request e o response);
  * **interface.interceptor** (pacote que contem interceptors das requisições http)
