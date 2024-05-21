FROM java:8
ADD amazon-adv-boot.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8092
EXPOSE 5092
ENTRYPOINT ["java","-Xdebug -Xms128m -Xmx128m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5092","-jar","/app.jar", "--server.port=8092"]