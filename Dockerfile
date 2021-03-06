FROM maven:3.6.3-jdk-11

WORKDIR /app

COPY . .

RUN mvn package

ENTRYPOINT ["java"]