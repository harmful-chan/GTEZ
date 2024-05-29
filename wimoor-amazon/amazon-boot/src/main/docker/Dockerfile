FROM openjdk:8-jdk-alpine
ADD amazon-boot.jar app.jar
EXPOSE 8093
CMD ["java","-jar", "/app.jar", "--server.port=8093"]