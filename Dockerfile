FROM openjdk:21-jdk-bullseye

ENV APP_JAR mercedes-back-0.0.1-SNAPSHOT.jar

WORKDIR /app

COPY target/mercedes-back-0.0.1-SNAPSHOT.jar mercedes-back-0.0.1-SNAPSHOT.jar

RUN chmod +x mercedes-back-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "mercedes-back-0.0.1-SNAPSHOT.jar"]

#docker build -t mercedes-back .
#docker run -p 8080:8080 mercedes-back