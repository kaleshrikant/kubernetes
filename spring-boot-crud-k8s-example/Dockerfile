FROM openjdk:21-slim

EXPOSE 8080

ADD build/libs/spring-boot-crud-k8s-example-0.0.1-SNAPSHOT.jar spring-boot-crud-k8s-example.jar

ENTRYPOINT ["java", "-jar","/spring-boot-crud-k8s-example.jar"]