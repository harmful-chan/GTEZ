FROM openjdk:8-jdk-alpine
ADD erp-boot.jar app.jar
EXPOSE 8086
CMD ["java","-jar","/app.jar", "--server.port=8086"]