# Getting Started

### Development Profile Template
- create `application-develop.properties` at the project root.
- use below as a starting template for your development profile:
```
# LOGGING
logging.file=logs/develop.log
logging.level.root=INFO
logging.level.org.springframework=INFO
logging.level.com.datasoldier=DEBUG
logging.level.com.datasoldier.smartcontrol=DEBUG

spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=false

# DATABASE
spring.datasource.url=jdbc:mysql://localhost:3306/smartcontroldb
spring.datasource.username=test
spring.datasource.password=test
```

### Build
`gradlew clean build`

### Run
`gradlew bootRun --args="--spring.profiles.active=develop"`

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

