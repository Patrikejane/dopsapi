FROM openjdk:21-jdk

EXPOSE 8080
ADD target/devopapi.jar devopapi.jar
ENTRYPOINT ["java", "-jar", "devopapi.jar"]
