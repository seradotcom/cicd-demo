FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/cicd-demo-1.0-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]