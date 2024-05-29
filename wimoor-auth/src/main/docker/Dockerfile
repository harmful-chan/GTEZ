FROM openjdk:8-jdk-alpine
ADD wimoor-auth.jar app.jar
EXPOSE 8087
CMD ["java","-jar","/app.jar", "--server.port=8087"]