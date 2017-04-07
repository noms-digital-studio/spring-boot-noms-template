# Sample Spring Boot Template

Sample Template for Spring Boot Applications conforming to 12 factor app.
Demo exposes a rest service backed by data from a database.


## Getting Started

`grade clean build` to build
`gradle bootRun` to run or use Intellij Run Configuration 

## Spring Profiles
- `default` the absence of a profile means the service will use an in-memory database
- `logtoconsole` this use stand logging format rather and json logstash


 
### End points

#### View Names
- Method: GET
- Content Type: `application/json'
- URI: `/name`

Message Body:-
```json
{
   
}
```

#### Health Check

`/health` 
Returns Spring Boot Actuator health status

### Prerequisites
- Java 8 JDK

### Dependencies
None

## Installing

Service can be run either locally or using Docker.

### Docker

`docker build -t noms-digital-studio/spring-boot-noms-template .`

then

`docker run -d -p 8080:8080 noms-digital-studio/spring-boot-noms-template`

### Local

`./gradlew build`

then

`java -jar build/libs/spring-boot-noms-template-*-.jar`



## Running the tests

```
./gradlew test
```

### Acceptance tests

```
Feature Files in  /test/resources/features
```

These demonstrate the behaviour of the application
### Coding style tests

Findbugs

```
Configuration in /config/checkstyle and /config/findbugs
```

## Deployment

See kd

## Built With

* [Spring Boot](https://projects.spring.io/spring-boot/) 


## Versioning


## Authors

[NOMS Digital Studio](https://github.com/noms-digital-studio)

## License

## Acknowledgments
