FROM openjdk:8
WORKDIR /usr/src/app
COPY / ./
RUN apt-get update && apt-get install maven -y && mvn install && mv /usr/src/app/target/*.jar /usr/src/app/app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app.jar"]

