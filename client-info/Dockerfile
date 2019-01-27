FROM openjdk:11-jre-slim-strech
MAINTAINER Dominik Schadow <dominikschadow@gmail.com>

VOLUME /tmp

EXPOSE 8888

ADD target/client-info.jar app.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "app.jar"]