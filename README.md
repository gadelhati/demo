# Instruções para API _Spring Boot_

![spring](https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg "Spring Boot!")

### Link para criação de um projeto similar, acesse:

> [https://start.spring.io/](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.5.RELEASE&packaging=war&jvmVersion=1.8&groupId=br.eti.gadelha&artifactId=gadelha&name=gadelha&description=Demo%20project%20for%20Spring%20Boot%20to%20Gadelha&packageName=br.eti.gadelha.gadelha&dependencies=lombok,web,h2,devtools,configuration-processor,jersey,security,data-jpa,postgresql,cloud-config-server,actuator,validation)

```
netstat -a -n -o
tskill "NÚMERO DO PID"
```
Para rodar a API, utilize o comando:
```
mvn spring-boot:run
```
Isso irá gerar a Base de dados. Acessível através da url.
Para abrir console do banco de dados **H2**, acesse:

> [http://localhost:8080/h2-ui](http://localhost:8080/h2-ui)

## Altere a JDBC URL para o path descrito no console:
```
2021-04-18 21:44:01.317  INFO 7560 --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-ui'. Database available at 'jdbc:h2:mem:testdb'
```
no caso:
```
jdbc:h2:mem:testdb
```
Aplicação _Spring Boot_ para: [Acompanhamento do projeto no redemine](https://redmine.chm.mb/projects/siscoep)

## Requirements

For building and running the application you need:

- [x] [JDK](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) - Neste projeto utilzamos a versão JDK 8 update 211.
- [ ] [Lombok](https://projectlombok.org/) - Download the Lombok plugin for your IDE. This is required to add Lombok dependency support.

## Running

First, clone the project and build locally:

```
git clone http://10.5.193.26/00038059/siscoep
```

Para criar o arquivo _.war_, digite no terminal do _intellij_:

```
mvn clean package
```

serão criados dois arquivos com a extensão .war, o com nome menor é o que será utilizado.