FROM openjdk:21-oracle
LABEL authors="sskma"

EXPOSE 8080
ADD target/devopapi.jar devopapi.jar
ENTRYPOINT ["java", "-jar", "devopapi.jar"]
ENTRYPOINT ["top", "-b"]