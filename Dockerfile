FROM openjdk:8
EXPOSE 8080
ADD target/github-cicd-learning-01.jar github-cicd-learning-01.jar
ENTRYPOINT ["java", "-jar", "github-cicd-learning-01.jar"]