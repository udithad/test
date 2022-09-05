pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building Source Code--------------'
                sh 'mvn -f ../seed clean install'
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
        stage('Image') {
            steps {
                echo 'Building Docker Image..............'
                sh './build_scp.sh'
            }
        }
    }
}