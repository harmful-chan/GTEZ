FROM java:8
ADD erp-boot.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8086
EXPOSE 5086
ENTRYPOINT ["java","-Xdebug -Xms128m -Xmx128m -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5086","-jar","/app.jar", "--server.port=8086"]