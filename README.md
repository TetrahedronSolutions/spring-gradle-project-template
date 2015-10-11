# TSol Server Gradle

## Description
We want to explore the uses of a Java Dev Stack consisting of:
* Java @latest
* Gradle 2.5
* Drools 6.1
* JUnit 4.*
* Spring Boot @latest
* Ubuntu 14.04 LTS

## Set-up:
1. Install Java 7 or 8
2. Install [Gradle-2.5](http://exponential.io/blog/2015/03/30/install-gradle-on-ubuntu-linux/)

## How-to Run
* `gradle build`
* `java -jar build/libs/*`

## Practices
* [Linting](https://github.com/google/styleguide)
* [Database-Connection](https://spring.io/guides/gs/relational-data-access/)
* [Spring-Dockerization](http://spring.io/guides/gs/spring-boot-docker/)
* [REST-Services](https://spring.io/guides/tutorials/bookmarks/)
* [Model Validation](http://spring.io/guides/gs/validating-form-input/)

## File Structures
- gradle
- src
    |_main
    |  |_net
    |      |_tsol
    |          |_modules
    |              |_module_services
    |              |_module_router_controller
    |_resources
    |  |_rules
    |       |_rule_file
    |_test
        |_test_module
            |_module_unit_test
