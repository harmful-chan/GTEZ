FROM java:8
ADD amazon-boot.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8093
EXPOSE 5093
ENTRYPOINT ["java","-Xdebug -Xms128m -Xmx128m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5093","-jar","/app.jar", "--server.port=8093"]