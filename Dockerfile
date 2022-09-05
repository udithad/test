FROM openjdk:11
ADD target/*.jar test
ENTRYPOINT ["java", "-jar","test-0.0.1-SNAPSHOT"]
EXPOSE 8081