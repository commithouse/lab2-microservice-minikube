FROM maven:3.3-jdk-8
MAINTAINER danielzen
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

COPY target/ProfessorMicroservice-0.0.1-SNAPSHOT.jar ./ProfessorMicroservice-0.0.1.jar
ENTRYPOINT ["java","-jar","/ProfessorMicroservice-0.0.1.jar"]