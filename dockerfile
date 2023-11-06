EXPOSE 8080
ADD target/kaddemproject.jar kaddemproject.jar
ENTRYPOINT ["java","-jar","kaddem.jar"]
