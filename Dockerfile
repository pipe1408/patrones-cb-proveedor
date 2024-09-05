FROM amazoncorretto:17-alpine
COPY build/libs/patrones-cb-proveedor-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]