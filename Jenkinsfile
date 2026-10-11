pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                echo 'Source Code Checkout'
            }
        }

        stage('Sangram') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Avtar Singh compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Unit Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Budle') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy to Nexus Arifactory') {
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