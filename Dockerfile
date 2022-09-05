FROM openjdk:11
ADD target/*.jar test-latest
ENTRYPOINT ["java", "-jar","test-latest"]
EXPOSE 8081