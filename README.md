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

Altere a JDBC URL para o path descrito no console:
```
2021-04-18 21:44:01.317  INFO 7560 --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-ui'. Database available at 'jdbc:h2:mem:testdb'
```
no caso:
```
jdbc:h2:mem:testdb
```