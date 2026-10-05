pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Source Code Checkout'
            }
        }

        stage('Environment') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    
        stage('Publish To Nexus') {
            steps {
                sh 'mvn deploy'
            }
        }

    post {
        success {
            echo 'Pipeline Successful'
        }
}