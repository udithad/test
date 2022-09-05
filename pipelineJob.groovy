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
            dir ('Build Docker') {
                sh './build_scp.sh'
            }
        }
    }
}