FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9090
RUN mkdir -p /app/
ADD build/libs/costmanagement-0.0.1-SNAPSHOT.jar /app/costmanager.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/costmanager.jar"]


#ARG JAR_FILE
#ADD ${JAR_FILE} costmanagement-0.0.1-SNAPSHOT.jar
#EXPOSE 9090
#RUN mkdir -p /app/
#ADD build/libs/costmanagement-0.0.1-SNAPSHOT.jar /app/costmanager.jar
#ENTRYPOINT ["java", "-jar", "/app/costmanager.jar"]