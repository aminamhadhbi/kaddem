FROM openjdk:8
EXPOSE 8055
ENTRYPOINT ["java","-jar","kaddem.jar"]
