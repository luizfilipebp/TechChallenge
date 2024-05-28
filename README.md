# FilaOnline

FilaOnline é um app Spring Boot para gestão de filas online para eventos.

O projeto é uma estrutura mockada para exemplificar alguns domínios
e um controller com endpoints relacionados ao dominio "Atividade"

## Features

- Gestão de filas online
- Gestão de atividades
- Gestão do evento

## Tecnologias usadas

- Spring Boot
- Spring Web
- JPA
- H2
- Lombok

## Requisitos

- JDK 17 ou superior
- Maven

## Como rodar

1. Clonar repositório:

    ```bash
    git clone https://github.com/your-username/FilaOnline.git](https://github.com/luizfilipebp/TechChallenge.git
    ```

2. Ter a porta 8080 default disponível ou alterar no `application.properties`:

    ```properties
    server.port=8080
    ```

3. Para rodar sem ide:

    ```bash
    cd pastaDoProjeto
    mvn spring-boot:run
    ```

4. Realizar chamadas get disponíveis, exemplo: `localhost:8080/lista-atividades/`.

5. Curls dos endpoints disponíveis para importação no postman:

    ```curl 1
   curl --location 'localhost:8080/lista-atividades/'
    ```

    
    ```curl 2
   curl --location 'localhost:8080/lista-atividades/FeiraGeek2024'
    ```
