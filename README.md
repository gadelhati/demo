# Instruções para API _Spring Boot_

![github](https://img.shields.io/github/stars/gadelhati/demo?style=social "Github")
![java](https://img.shields.io/badge/java-8-007fff "Java")
![springboot](https://img.shields.io/badge/springboot-2.4.5-00ff80 "Spring Boot")
![react](https://img.shields.io/badge/react-17.0.2-40e0d0 "React")

### Tecnologias utilizadas e conhecimentos necessários:

<a href="https://www.w3.org/html/" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/html5/html5-original-wordmark.svg" alt="html5" width="25" height="25"/>
</a>
<a href="https://www.w3schools.com/css/" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/css3/css3-original-wordmark.svg" alt="css3" width="25" height="25"/>
</a>
<a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="javascript" width="25" height="25"/>
</a>
<a href="https://getbootstrap.com" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/bootstrap/bootstrap-plain-wordmark.svg" alt="bootstrap" width="25" height="25"/>
</a>
<a href="https://www.java.com" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="25" height="25"/>
</a>
<a href="https://www.postgresql.org" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="25" height="25"/>
</a>
<a href="https://spring.io/" target="_blank">
    <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="25" height="25"/>
</a>
<a href="https://git-scm.com/" target="_blank">
    <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="25" height="25"/>
</a>
<a href="https://www.linux.org/" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/linux/linux-original.svg" alt="linux" width="25" height="25"/>
</a>
<a href="https://www.docker.com/" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-original-wordmark.svg" alt="docker" width="25" height="25"/>
</a>
<a href="https://heroku.com" target="_blank">
    <img src="https://www.vectorlogo.zone/logos/heroku/heroku-icon.svg" alt="heroku" width="25" height="25"/>
</a>
<a href="https://www.nginx.com" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/nginx/nginx-original.svg" alt="nginx" width="25" height="25"/>
</a>

[comment]: <> (<a href="https://www.jenkins.io" target="_blank">)
[comment]: <> (    <img src="https://www.vectorlogo.zone/logos/jenkins/jenkins-icon.svg" alt="jenkins" width="25" height="25"/>)
[comment]: <> (</a>)

<a href="https://nodejs.org" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/nodejs/nodejs-original-wordmark.svg" alt="nodejs" width="25" height="25"/>
</a>
<a href="https://reactjs.org/" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/react/react-original-wordmark.svg" alt="react" width="25" height="25"/>
</a>
<a href="https://materializecss.com/" target="_blank">
    <img src="https://raw.githubusercontent.com/prplx/svg-logos/5585531d45d294869c4eaab4d7cf2e9c167710a9/svg/materialize.svg" alt="materialize" width="25" height="25"/>
</a>
<a href="https://redux.js.org" target="_blank">
    <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/redux/redux-original.svg" alt="redux" width="25" height="25"/>
</a>

### Link para criação de um projeto similar, acesse:

> [https://start.spring.io/](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.5.RELEASE&packaging=war&jvmVersion=1.8&groupId=br.eti.gadelha&artifactId=gadelha&name=gadelha&description=Demo%20project%20for%20Spring%20Boot%20to%20Gadelha&packageName=br.eti.gadelha.gadelha&dependencies=lombok,web,h2,devtools,configuration-processor,jersey,security,data-jpa,postgresql,cloud-config-server,actuator,validation)

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

> [http://localhost:8080/h2-ui](http://localhost:8080/h2-ui)

Relative links

### HTTP Status code list:

> [HHTP Status Code](https://httpstatuses.com/)

Relative links

### Altere a JDBC URL para o path descrito no console:
```
2021-04-18 21:44:01.317  INFO 7560 --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-ui'. Database available at 'jdbc:h2:mem:testdb'
```
no caso:
```
jdbc:h2:mem:testdb
```
Aplicação _Spring Boot_ para: [Acompanhamento do projeto no redemine](https://redmine.chm.mb/projects/siscoep){:target="_blank"}

Relative links

### Requirements

For building and running the application you need:

- [x] [JDK](https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html) - Neste projeto utilzamos a versão JDK 8 update 211.
- [x] [Lombok](https://projectlombok.org/) - Download the Lombok plugin for your IDE. This is required to add Lombok dependency support.

### Running

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