FROM java:8
ADD wimoor-auth.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8087
EXPOSE 5087
ENTRYPOINT ["java","-Xdebug -Xms128m -Xmx128m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5087","-jar","/app.jar", "--server.port=8087"]