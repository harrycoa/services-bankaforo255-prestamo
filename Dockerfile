FROM openjdk:13
VOLUME /tmp
EXPOSE 8078
ADD ./target/services-bankaforo255-prestamo-0.0.1-SNAPSHOT.jar service-prestamo.jar
ENTRYPOINT ["java", "-jar","/service-prestamo.jar"]