pipeline {
    agent any
    stages {
        stage('Package Application'){
            steps{
                script{
                    sh "npm install"
                    sh "mvn clean package"
                }
            }
        }

    stage('Build Docker Container') {
      steps {
      	sh 'docker build -t flow90/springboot-mongodb-atlas-backend:latest .'
      }
    }

    stage('Deploy Container') {
      steps {
        sh 'docker ps -f name=springboot-mongodb-atlas-backend -q | xargs --no-run-if-empty docker container stop'
        sh 'docker container ls -a -fname=springboot-mongodb-atlas-backend -q | xargs -r docker container rm'
      	sh 'docker run --rm -d -p 8090:8080 --name springboot-mongodb-atlas-backend flow90/springboot-mongodb-atlas-backend'
      }
    }
  }
}
