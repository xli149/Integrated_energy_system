FROM java:8
VOLUME /tmp
ADD application.jar /application.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/application.jar"]
