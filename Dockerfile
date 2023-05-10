FROM openjdk:17
EXPOSE 8091
ADD target/app-tarefa.jar app-tarefa.jar
ENTRYPOINT ["java","jar","app-tarefa.jar"]