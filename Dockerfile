FROM openjdk:8-jdk-alpine
RUN addgroup -S gentlemen-messenger-group && adduser -S gentlemen-messenger-user -G gentlemen-messenger-group
USER gentlemen-messenger-user:gentlemen-messenger-group
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 80