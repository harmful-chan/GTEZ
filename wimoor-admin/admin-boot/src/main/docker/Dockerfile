FROM java:8
ADD admin-boot.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8085
EXPOSE 5085
ENTRYPOINT ["java","-Xdebug -Xms128m -Xmx128m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5085","-jar","/app.jar", "--server.port=8085"]