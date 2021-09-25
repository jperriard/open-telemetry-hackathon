FROM openjdk:11

# RUN adduser -system --group spring
# USER spring:spring

WORKDIR /usr/src/app
COPY . .

RUN ./gradlew

EXPOSE 8181

CMD ["./gradlew",  "bootRun"]
