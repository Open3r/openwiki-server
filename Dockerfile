FROM openjdk:21
ARG JAR_FILE=./build/libs/*.jar
COPY ${JAR_FILE} openwiki-server.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "/openwiki-server.jar"]