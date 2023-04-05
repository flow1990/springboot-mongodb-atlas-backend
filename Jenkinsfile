pipeline {
    agent any
    tools {
       maven 'MVN_3.8.6'
       jdk 'Java17'
    }
    stages {
        stage('Packaging'){
            steps{
                script{
                    sh "mvn package"
                }
            }
        }

    stage('Docker Build') {
      steps {
      	sh 'docker build -t flow90/springboot-mongodb-atlas-backend:latest .'
      }
    }

    stage('Deploy') {
      steps {
      	sh 'docker run -d -p 8090:8081 flow90/springboot-mongodb-atlas-backend'
      }
    }
  }
}