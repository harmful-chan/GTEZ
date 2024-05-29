FROM openjdk:8-jdk-alpine
ADD wimoor-gateway.jar app.jar
EXPOSE 8099
CMD ["java","-jar", "/app.jar", "--server.port=8099"]