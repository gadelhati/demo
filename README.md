# Instruções para API Spring Boot
```
netstat -a -n -o
tskill "NÚMERO DO PID"
```
Para rodar a API, utilize o comando:
```
mvn spring-boot:run
```
Isso irá gerar a Base de dados. Acessível através da url.
Para abrir console do banco de dados H2, acesse:

> [http://localhost:8080/h2-ui](http://localhost:8080/h2-ui)

## Altere a JDBC URL para o path descrito no console:
```
2021-04-18 21:44:01.317  INFO 7560 --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-ui'. Database available at 'jdbc:h2:mem:testdb'
```
no caso:
```
jdbc:h2:mem:testdb
```
Aplicação Spring Boot para Realizar o controle dos empréstimos de equipamentos e licenças entre as Organizações Militares subordinadas à DHN.: [Acompanhamento do projeto no redemine](https://redmine.chm.mb/projects/siscoep)

## Requirements

For building and running the application you need:

- [JDK](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) - Neste projeto utilzamos a versão JDK 8 update 211.
- [Lombok](https://projectlombok.org/) - Download the Lombok plugin for your IDE. This is required to add Lombok dependency support.

## Running

First, clone the project and build locally:

```
git clone http://10.5.193.26/00038059/siscoep
```

Para criar o arquivo .war, digite no terminal do intellij:

```shell
mvn clean package
```

serão criados dois arquivos com a extensão .war, o com nome menor é o que será utilizado.