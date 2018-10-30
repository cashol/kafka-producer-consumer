FROM openjdk:11.0.1-jre-slim
MAINTAINER Holger Casties "holger.casties@siemens.com"
COPY *.jar /app/kafka-sink.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/app/kafka-sink.jar"]
