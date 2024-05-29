FROM openjdk:8-jdk-alpine
ADD admin-boot.jar app.jar
EXPOSE 8085
CMD ["java","-jar", "/app.jar", "--server.port=8085"]