FROM openjdk:11-jre-slim-stretch
MAINTAINER Dominik Schadow <dominikschadow@gmail.com>

VOLUME /tmp

EXPOSE 8080

ADD target/client-info.jar app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]