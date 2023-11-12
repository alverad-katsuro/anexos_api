FROM eclipse-temurin:21.0.1_12-jdk-jammy AS builder

WORKDIR /app

COPY . .

RUN ./mvnw install

FROM eclipse-temurin:21.0.1_12-jdk-jammy AS runner

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

ARG profile

ENTRYPOINT java -jar -Dspring.profiles.active="$profile" app.jar
