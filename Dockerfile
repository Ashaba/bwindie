FROM gradle:6.8.3-jdk11 AS BUILD

COPY . /src
WORKDIR /src
RUN ./gradlew build

FROM openjdk:14-jdk-alpine
COPY --from=BUILD /src/build/libs/bwindie-*.jar ./run.jar

CMD [ "java","-jar","run.jar" ]
EXPOSE 3000
