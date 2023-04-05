FROM openjdk:17-oracle

ADD target/springboot-mongodb-atlas-0.0.1-SNAPSHOT.jar target/springboot-mongodb-atlas-0.0.1-SNAPSHOT.jar
CMD java -jar target/springboot-mongodb-atlas-0.0.1-SNAPSHOT.jar