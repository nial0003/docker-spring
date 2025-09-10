FROM maven:3.9.11-eclipse-temurin-21

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

RUN cp target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]