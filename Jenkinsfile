pipeline {
    agent any
    tools{
        maven 'maven_3.8.6'
    }
    stages{
        stage('build mvn project'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Dev-Gopi/awsec2']]])
                sh 'mvn clean package shade:shade'
            }
        }
//         stage('build docker image'){
//             steps{
//                 script{
//                     sh 'docker image build -t devops-integration:latest .'
//                     sh 'docker run -d -p 8081:8080  devops-integration:latest'
//                 }
//             }
//         }
        // stage('Docker Push') {
        //     steps {
        //         withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
        //         sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
        //         sh 'docker push devops-integration:latest'
        //     }
        // }
    }
}