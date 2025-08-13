FROM openjdk:21-slim

EXPOSE 8080

ADD build/libs/spring-boot-crud-k8s.jar spring-boot-crud-k8s.jar

ENTRYPOINT ["java", "-jar","/spring-boot-crud-k8s.jar"]