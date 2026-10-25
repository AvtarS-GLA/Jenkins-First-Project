pipeline {
    agent {
        label 'linux'
    }

    options {
        skipDefaultCheckout()
    }

    stages {

        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('Pull Git Code') {
            steps {
                checkout scm
            }
        }

        stage('Setup Environment') {
            steps {
                sh 'hostname'
                sh 'java -version'
                sh 'mvn -version'
                sh 'git --version'
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
            cleanWs()
        }

        failure {
            echo 'Pipeline Failed'
            cleanWs()
        }
    }
}