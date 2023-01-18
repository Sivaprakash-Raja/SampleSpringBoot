# define base docker image

FROM openjdk:19
LABEL maintainer='FordNextLLC.net'
ADD build/libs/resource_server-0.0.1-SNAPSHOT.jar Demo_docker.jar
ENTRYPOINT ["java", "-jar", "Demo_docker.jar"]