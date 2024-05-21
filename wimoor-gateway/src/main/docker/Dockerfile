FROM java:8
ADD wimoor-gateway.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8099
EXPOSE 5099
ENTRYPOINT ["java","-Xdebug -Xms128m -Xmx128m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5099", "-jar", "/app.jar", "--server.port=8099"]