FROM openjdk:8
EXPOSE 8083
ADD target/aws-ec2-test.jar aws-ec2-test.jar
ENTRYPOINT ["java","-jar","/aws-ec2-test.jar"]