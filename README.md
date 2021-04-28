# Instruções para API _Spring Boot_

[][https://img.shields.io/github/stars/gadelhati/demo?style=social]

### Tecnologias utilizadas:

<a href="https://redux.js.org" target="_blank">
	<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/redux/redux-original.svg" alt="redux" height="40"/>
</a>
<a href="https://spring.io/" target="_blank">
	<img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" height="40"/>
</a>
<a href="https://www.h2database.com/" target="_blank">
	<img src="https://www.h2database.com/html/images/h2-logo-2.png" alt="h2" height="40"/>
</a>
<a href="https://nodejs.org" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/nodejs/nodejs-original-wordmark.svg" alt="nodejs" height="40"/>
</a>
<a href="https://www.nginx.com" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/nginx/nginx-original.svg" alt="nginx" width="40"/>
</a>
<a href="https://git-scm.com/" target="_blank">
	<img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40"/>
</a>
<a href="https://heroku.com" target="_blank"> <img src="https://www.vectorlogo.zone/logos/heroku/heroku-icon.svg" alt="heroku" width="40"/></a>
<a href="https://www.java.com" target="_blank">
	<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40"/>
</a>
<a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
	<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="javascript" width="40"/>
</a>

[comment]: <> (<a href="https://www.jenkins.io" target="_blank">)
[comment]: <> (	<img src="https://www.vectorlogo.zone/logos/jenkins/jenkins-icon.svg" alt="jenkins" width="40"/>)
[comment]: <> (</a>)

<a href="https://www.linux.org/" target="_blank">
	<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/linux/linux-original.svg" alt="linux" width="40"	/>
</a>
<a href="https://www.postgresql.org" target="_blank">
	<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="40" height="40"/>
</a>
<a href="https://reactjs.org/" target="_blank">
	<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/react/react-original-wordmark.svg" alt="react" width="40" height="40"/>
</a>
<a href="https://redux.js.org" target="_blank">
	<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/redux/redux-original.svg" alt="redux" width="40" height="40"/>
</a>

[comment]: <> (![Spring Boot]&#40;https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg "Spring Boot!"&#41;)

### Link para criação de um projeto similar, acesse:

> [https://start.spring.io/](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.5.RELEASE&packaging=war&jvmVersion=1.8&groupId=br.eti.gadelha&artifactId=gadelha&name=gadelha&description=Demo%20project%20for%20Spring%20Boot%20to%20Gadelha&packageName=br.eti.gadelha.gadelha&dependencies=lombok,web,h2,devtools,configuration-processor,jersey,security,data-jpa,postgresql,cloud-config-server,actuator,validation){:target="_blank"}

Relative links

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

> [http://localhost:8080/h2-ui](http://localhost:8080/h2-ui) {:target="_blank"} 

Relative links

## HTTP Status code list:

> [HHTP Status Code](https://httpstatuses.com/) {:target="_blank"}

Relative links

## Altere a JDBC URL para o path descrito no console:
```
2021-04-18 21:44:01.317  INFO 7560 --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-ui'. Database available at 'jdbc:h2:mem:testdb'
```
no caso:
```
jdbc:h2:mem:testdb
```
Aplicação _Spring Boot_ para: [Acompanhamento do projeto no redemine](https://redmine.chm.mb/projects/siscoep){:target="_blank"}

Relative links

## Requirements

For building and running the application you need:

- [x] [JDK](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) - Neste projeto utilzamos a versão JDK 8 update 211.
- [x] [Lombok](https://projectlombok.org/) - Download the Lombok plugin for your IDE. This is required to add Lombok dependency support.

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

[comment]: <> ([![All Contributors]&#40;https://img.shields.io/badge/all_contributors-4-orange.svg?style=flat-square&#41;]&#40;#contributors-&#41;)

