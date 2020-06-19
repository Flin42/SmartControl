### smartcontrol

## Build with
- Gradle 6.4.1

## Development Profile Template
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

spring.datasource.url=jdbc:mysql://localhost:3306/smartcontroldb
spring.datasource.username=test
spring.datasource.password=test
```

## Build
`gradlew clean build`

## Run
`gradlew bootRun --args="--spring.profiles.active=develop"`