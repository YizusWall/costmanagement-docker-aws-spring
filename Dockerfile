FROM openjdk:8-jdk-alpine
EXPOSE 9090
RUN mkdir -p /app/
ADD build/libs/costmanager-0.0.1-SNAPSHOT.jar /app/costmanager.jar
ENTRYPOINT ["java", "-jar", "/app/costmanager.jar"]