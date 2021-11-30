 FROM openjdk:18-jdk-slim
 LABEL maintainer=kevindai

 copy target/*.jar /usr/local/docker-java-demo.jar

 ENTRYPOINT ["java","-jar","/usr/local/docker-java-demo.jar"]