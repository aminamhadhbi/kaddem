FROM openjdk:8
EXPOSE 8055
ADD /target/timesheet-1.0.war kaddem.jar
ENTRYPOINT ["java","-jar","kaddem.jar"]
