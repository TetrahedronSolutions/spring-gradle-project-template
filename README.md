# TSol Server Gradle

## Description
We want to explore the uses of a Java Dev Stack consisting of:
* Java (7 or 8)
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
* [Spring-Dockerization](http://spring.io/guides/gs/spring-boot-docker/)
* [REST-Services](https://spring.io/guides/tutorials/bookmarks/)
* [Model Validation](http://spring.io/guides/gs/validating-form-input/)
* [Different module Components](http://javapapers.com/spring/spring-component-service-repository-controller-difference/)
* [Database connections example](https://github.com/spring-projects/spring-data-jpa-examples)
* [Database-Connection](https://spring.io/guides/gs/relational-data-access/)
* [Spring Database Libs](http://projects.spring.io/spring-data/#quick-start)

# Module Types
When to use different components/annotations in your application

### Repository
Repository modules are generally used when supplying some type of data
extraction in your application

```
  import org.springframework.stereotype.Repository;

  @Repository
  public class TemplateRepository {
    ...
  }
```

### Routes/Controller
Routes/Controllers are a very simplistic method call to a service or Repository
to get data. If your methods grow bigger than a simple method call to service
than your need to more that code to the Service or Repository

```
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.bind.annotation.RequestMapping;

  @RestController
  @RequestMapping(value="/template")
  public class TemplateRoute {
    ...
  }
```

### Model
Models are used to define data objects when extracted from the database and used
to return the JSON object. Use the `@Data` annotation for your models in order
to create all your gets, sets, and constructors.

```
  import lombok.Data;

  @Data
  public class Template {
    private int id;
    ...
  }
```

### Services
Services are where all the Business Logic is placed. Services will communicate
with Repository to get data and be accessed by Routes/Controllers.

```
  import org.springframework.stereotype.Service;

  @Service
  public class TemplateServices {
    ...
  }
```

## File Structures

The File architecture that we are utilizing follows modularized components.
In prior experiences with a MVC framework, the biggest problems was the old
file structure in which there were 3 folder that hold all your Models,
Controller, and Views. Since this application is only back-end we have
eliminated the view components. However if we wanted to get a list of
contributers from our database we would have all the files relating to the
extraction of contributers will be placed in one folder.

As you have seen in the documentation we call all our controllers Routes.
The reason for this is because the controller/route files functionality is only
this is the path to hit this services and this is the service method. Hence,
the name controller seems incorrect. Route is better since its just a path to
a service.

```
  build.gradle
  src
    |_main
    |  |_net
    |  |    |_tsol
    |  |        |_modules
    |  |            |_module_services
    |  |            |_module_router_controller
    |  |            |_module_repository
    |  |            |_module_repository
    |  |            |_module_Model_Object
    |  |_resources
    |    |_rules
    |         |_rule_file
    |_test
        |_test_module
            |_module_unit_test
```
