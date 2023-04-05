pipeline {
  agent any
  tools {
    maven 'MVN_3.8.6'
  }
  stages {

  stage("Compilation") {
    sh "mvn clean install -DskipTests"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "mvn test"
    }
    stage("Deployment") {
      sh 'nohup mvn spring-boot:run -Dserver.port=8081 &'
    }
    }
  }
}