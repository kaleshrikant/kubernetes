FROM openjdk:21-slim

EXPOSE 8080

ADD build/libs/SpringBoot-k8s-Yaml-0.0.1-SNAPSHOT.jar SpringBoot-k8s-Yaml.jar

ENTRYPOINT ["java", "-jar","/SpringBoot-k8s-Yaml.jar"]