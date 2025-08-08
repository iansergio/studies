# Microserviços
> São formas de estruturar um sistema como um conjunto de pequenos serviços independentes, onde cada um roda seu próprio processo e geralmente se comunicam por api's rest. Cada microserviço tem foco em **uma única funcionalidade ou domínio de negócio**  

> Cada serviço é autônomo, possuindo seu próprio banco de dados, ciclo de vida e equipe responsável. Os **deploys** são realizados **de forma independente**, garantindo que, caso um serviço falhe, os demais não sejam afetados.
> Além disso, apenas o serviço necessário é escalado, evitando a necessidade de escalar todo o sistema. Cada microserviço pode utilizar tecnologias diferentes, adequadas às suas necessidades específicas.
> A **comunicação** entre os microserviços **geralmente ocorre** via rede, **por meio de HTTP/RES**T ou **mensagens assíncronas utilizando filas e eventos**.

## Componentes comuns com Spring Boot

**API Gateway (Spring Cloud Gateway e Spring Security)**
- Entrada única, roteia as chamadas para os microserviços. Pode fazer autenticação, rate limiting, logging

**Service Discovery (Spring Cloud Netflix Eureka)**  
- Registro de descoberta dinâmica de serviços  

**Config Server (Spring Cloud Config)**  	
- Centraliza as configurações dos microserviços

**Microserviços**  
- Serviços independentes, focados em domínios

**Bancos de Dados**  
- Um banco separado para cada microserviço

**Mensageria/Event Bus (Spring Cloud OpenFeign)**	
- Comunicação assíncrona entre serviços

**Monitoramento/Logging (Spring Cloud Sleuth + Zipkin)** 	
- Saúde dos serviços, logs centralizados
