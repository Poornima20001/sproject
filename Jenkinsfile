pipeline {
    agent any

    tools {
        maven 'mvn 3.9.9'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    credentialsId: 'github_root_crentional',
                    url: 'https://github.com/Poornima20001/sproject.git'
            }
        }

        stage('Workspace') {
            steps {
                bat 'dir'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Verify JAR') {
            steps {
                bat 'dir target'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t springboot-app:1.0 .'
            }
        }

        stage('List Docker Images') {
            steps {
                bat 'docker images'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker run -d -p 8080:8080 --name springboot-container springboot-app:1.0'
            }
        }
    }
}
