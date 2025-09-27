# labseq

This project uses Quarkus.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw clean package
```
Then:

```shell script
 docker build -f .\src\main\docker\Dockerfile.jvm -t quarkus/quarkus-docker-jvm .
```

Then:

```shell script
 docker run -i --rm -p 8080:8080 quarkus/quarkus-docker-jvm
```

## Provided Code

### REST

You can run the code by easily navigate to: [http://localhost:8080/q/swagger-ui](http://localhost:8080/q/swagger-ui)
