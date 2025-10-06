FROM ubuntu:latest AS buil

RUN apt-get install maven -y
RUN mvn clean install

EXPOSE 8080

COPY --from=build /target/todolist-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "app.jar"]