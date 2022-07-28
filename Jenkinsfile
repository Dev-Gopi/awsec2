pipeline {
    agent any
    tools{
        maven 'maven_3.8.6'
    }
    stages{
        stage('Checkout from github'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Dev-Gopi/awsec2']]])
            }
        }
        stage('Build mvn project'){
            steps{
                sh 'mvn clean package shade:shade'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker image build -t aws-ec2-test:latest .'
                }
            }
        }
        stage('Run docker image'){
            steps{
                script{
                    sh 'docker run -d -p 8081:8082 aws-ec2-test:latest'
                }
            }
        }
        // stage('Docker Push') {
        //     steps {
        //         withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
        //         sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
        //         sh 'docker push aws-ec2-test:latest'
        //     }
        // }
    }
}