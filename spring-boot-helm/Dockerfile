FROM openjdk:21-slim

EXPOSE 8080

ADD build/libs/spring-boot-helm.jar spring-boot-helm.jar

ENTRYPOINT ["java", "-jar","/spring-boot-helm.jar"]
