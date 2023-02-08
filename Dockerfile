FROM openjdk:8
EXPOSE 8080
ADD /target/flowchart-service-0.0.1-SNAPSHOT.jar document.jar
ENTRYPOINT ["java","-jar","/ document.jar"]