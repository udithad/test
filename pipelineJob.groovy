pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
        stage('Image') {
            dir ('test-service') {
                def app = docker.build "localhost:8081/test-service:latest"
                app.push()
            }
        }
    }
}