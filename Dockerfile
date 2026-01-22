# Используем готовый JDK
FROM eclipse-temurin:25-jdk-jammy

# Устанавливаем рабочую папку
WORKDIR /app

# Копируем pom.xml и mvnw
COPY pom.xml mvnw ./
COPY .mvn .mvn

# Копируем весь исходный код
COPY src ./src

# Делаем mvnw исполняемым
RUN chmod +x mvnw

# Собираем приложение
RUN ./mvnw clean package -DskipTests

# Указываем порт приложения
EXPOSE 8081

# Запуск приложения
CMD ["java", "-jar", "target/flower-website-0.0.1-SNAPSHOT.jar"]
