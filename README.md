# Development and Testing of Quarkus applications using Testcontainers

This is sample code for [Getting started with Testcontainers in a Quarkus Application](https://testcontainers.com/guides/development-and-testing-quarkus-application-using-testcontainers) Guide.

## 1. Setup Environment
Make sure you have Java 8+ and a [compatible Docker environment](https://www.testcontainers.org/supported_docker_environment/) installed.
If you are going to use Maven build tool then make sure Java 17+ is installed.

For example:

```shell
$ java -version
openjdk version "17.0.4" 2022-07-19
OpenJDK Runtime Environment Temurin-17.0.4+8 (build 17.0.4+8)
OpenJDK 64-Bit Server VM Temurin-17.0.4+8 (build 17.0.4+8, mixed mode, sharing)
$ docker version
...
Server: Docker Desktop 4.12.0 (85629)
 Engine:
  Version:          20.10.17
  API version:      1.41 (minimum version 1.12)
  Go version:       go1.17.11
...
```

## 2. Setup Project

* Clone the repository

```shell
git clone https://github.com/testcontainers/tc-guide-testcontainers-in-quarkus-applications.git
cd tc-guide-testcontainers-in-quarkus-applications
```

* Open the **tc-guide-testcontainers-in-quarkus-applications** project in your favorite IDE.

## 3. Run Tests

Run the command to run the tests.

```shell
$ ./gradlew test //for Gradle
$ ./mvnw verify  //for Maven
```

The tests should pass.
