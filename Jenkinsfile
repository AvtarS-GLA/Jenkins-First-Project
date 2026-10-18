pipeline {
    agent any

    stages {

        stage('Pull Git Code') {
            steps {
                echo 'Source Code Checkout'
            }
        }

        stage('Setup Environment') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Validate Test Cases') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Packaging') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Placing To Artifactory') {
            steps {
                sh 'mvn deploy'
            }
        }
    }

    post {
        success {
            echo 'Pipeline Successful'
        }

        failure {
            echo 'Pipeline Failed'
        }
    }
}