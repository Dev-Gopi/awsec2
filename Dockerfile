FROM openjdk:8
EXPOSE 8080
ADD target/aws-ec2-test.jar aws-ec2-test.jar
ENTRYPOINT ["java","-jar","/aws-ec2-test.jar"]