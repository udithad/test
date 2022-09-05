FROM openjdk:11
ADD target/*.jar test
ENTRYPOINT ["java", "-jar","myapplication"]
EXPOSE 8081