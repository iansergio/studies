### Sumário
<!-- [Apostila Java](https://www.alura.com.br/apostila-java-orientacao-objetos) -->

<!-- Alterar os links após atualizar a checkbox -->
> #### :white_check_mark: [RESTful APIs](#-api)  
> - Conceitos de arquitetura REST
> - Implementação de endpoints RESTful no Spring Boot
> - Boas práticas para criar APIs REST status codes, métodos HTTP

> #### :white_check_mark: [Beans no Spring](#-beans)  
> - O que são Beans e como são gerenciados pelo Spring.
> - Ciclo de vida dos Beans.
> - Escopos de Beans (Singleton, Prototype, etc.)

> #### :grey_exclamation: [Spring Boot Peripherals](#)  
> - Introdução ao Spring Boot e como ele facilita a configuração.
> - Utilização de Starters no Spring Boot.
> - Profiles e propriedades no Spring Boot (application.properties, YAML).

> #### :grey_exclamation: [Spring Data](#)  
> - Integração com bancos de dados usando Spring Data JPA.
> - Criação de repositórios (Repositories) e consultas personalizadas.
> - Uso de Query Methods e @Query.

> #### :grey_exclamation: [Como Dockerizar Aplicações Spring](#)  
> - Criando um Dockerfile para um projeto Spring Boot.
> - Configuração de volumes, networks e environment variables no Docker.
> - Execução de contêineres e orquestração com Docker Compose.

> #### :grey_exclamation: [Test Containers](#)  
> - O que são Test Containers.
> - Como usar Test Containers para testes de integração em Spring.
> - Exemplos práticos com banco de dados e outros serviços.

> #### :grey_exclamation: [REST e Service](#)  
> - Diferenças entre camadas REST (Controller) e Service no Spring.
> - Boas práticas na separação de responsabilidades.

> #### :grey_exclamation: [Components e Service no Spring](#)  
> - Diferença entre @Component, @Service e @Repository.
> - Como e quando usar cada anotação.
> - Injeção de dependências e autowiring.

> #### :grey_exclamation: [Debugging e Leitura de Código](#)  
> - Como usar o depurador (debugger) em IDEs como IntelliJ ou Eclipse.
> - Ferramentas de logging e tracing.
> - Leitura de logs e erros comuns.
***

### :computer: API
_Application Programming Interface_  
Conjunto de rotinas e padrões estabelecidos por uma aplicação para que outras aplicações possam usar as funcionalidades da mesma.
- Responsável por estabelecer conexão entre serviços.
- Intermediador para trocar informações.

### :calling: REST
_Representational State Transfer_  
Será feita uma transferencia de dados de uma maneira representativa ou didática.   
- A transferencia de dados geralmente é feita usando o protocolo HTTP.   
- O Rest delimita obrigações nessas transferencias de dados.

### :bulb: RESTful
#### Necessidades para ser RESTful
- _Client-Server_: Separação do cliente e do armazenamento de dados (servidor).

- _Stateless_: Cada requisição que o cliente faz para o servidor deverá conter todas as informações necessárias para o servidor entender e enviar uma _RESPONSE_ (resposta) para a _REQUEST_ (requisição).

- _Cacheable_: As respostas de uma requisição deverão ser explícitas ao dizer se aquela requisição pode ou não ser cacheada pelo cliente.

- _Layered System_: O cliente acessa um endpoint sem precisar saber da complexidade, quais passos estão sendo percorridos para o servidor responder a requisição, ou quais outras camadas o servidor estará lidando para que que a requisição seja respondida.

#### Opcional
_Code on Demand_: Dá a possibilidade da aplicação pegar códigos, como o JavaScript por exemplo, e executar no cliente.  
***

### :snake: Beans
_Beans_ são objetos que são instanciados, configurados, e gerenciados pelo contêiner do Spring com base nos princípios da injeção de dependência e inversão de controle.. Eles representam componentes em uma aplicação Spring e são definidos em uma configuração anotados com _@Configuration_.  

#### Ciclo de vida dos Beans

- **Criação**: Inicialmente, o contêiner carrega as definições de beans a partir do arquivo de configuração ou das anotações e cria instâncias desses beans.

- **Injeção de dependências**: O contêiner injeta as dependências necessárias conforme especificado. Isso pode ser feito via construtor, setters, ou anotação _@Autowired_.

- **Inicialização**: Após a criação e injeção de dependências, o contêiner pode executar métodos de inicialização definidos, como _@PostConstruct_ ou _afterPropertiesSet()_, dependendo do escopo e ciclo de vida dos beans.

- **Uso**: O bean é utilizado se necessário na aplicação.

- **Destruição**: No encerramento do contêiner, é possivel chamar o método _@PreDestroy_ ou qualquer outro método configurado para a destruição do bean (aplica-se apenas aos beans com escopos destrutíveis, como _singleton_ e _prototype_).

#### Escopos dos Beans  
Os escopos definem a frequência de criação e reutilização de uma instância do bean.

- _Singleton_: O bean é criado apenas uma vez pelo contêiner e é compartilhado por toda a aplicação. Esse é o escopo padrão.

- _Prototype_: Uma nova instância do bean é criada sempre que ele é solicitado.

- _Request_: Uma nova instância do bean é criada para cada solicitação HTTP (Aplicações web).

- _Session_: Uma nova instância do bean é criada para cada sessão HTTP (Aplicações web).

- _Application_: Escopo que cria uma instância do bean por servlet context (contêiner web).

- _WebSocket_: Cria uma instância do bean para cada sessão WebSocket.