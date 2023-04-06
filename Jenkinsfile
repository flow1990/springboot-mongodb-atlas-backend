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
                    sh "mvn clean package"
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
        sh 'docker ps -f name=springboot-mongodb-atlas-backend -q | xargs --no-run-if-empty docker container stop'
        sh 'docker container ls -a -fname=springboot-mongodb-atlas-backend -q | xargs -r docker container rm'
        //sh 'docker kill springboot-mongodb-atlas-backend'
      	sh 'docker run --rm -d -p 8090:8080 --name springboot-mongodb-atlas-backend flow90/springboot-mongodb-atlas-backend'
      }
    }
  }
}