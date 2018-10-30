FROM openjdk:11.0.1-jre-slim
MAINTAINER Holger Casties "holger.casties@siemens.com"
COPY *.jar /app/kafka-processor.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/app/kafka-processor.jar"]
