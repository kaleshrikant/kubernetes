FROM openjdk:21-slim

EXPOSE 8080

ADD build/libs/springboot-k8s-example-0.0.1-SNAPSHOT.jar springboot-k8s-example.jar

ENTRYPOINT ["java", "-jar","/springboot-k8s-example.jar"]