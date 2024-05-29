FROM openjdk:8-jdk-alpine
ADD amazon-adv-boot.jar app.jar
EXPOSE 8092
CMD ["java","-jar","/app.jar", "--server.port=8092"]