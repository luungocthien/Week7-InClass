FROM maven:latest
LABEL authors="ngoct"

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

CMD ["java", "-jar" , "target/tripcost.jar"]
