FROM openjdk:17-jdk-slim

WORKDIR /app

COPY labveb3/pom.xml .
COPY labveb3/src ./src

RUN apt-get update && apt-get install -y maven \
    && mvn clean package -DskipTests


EXPOSE 8080

CMD ["java", "-jar", "target/lab-0.0.1-SNAPSHOT.jar"]
