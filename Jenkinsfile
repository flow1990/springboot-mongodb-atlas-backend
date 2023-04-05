pipeline {
  agent any
  tools {
    maven 'MVN_3.8.6'
  }
  stages {

    stage("Compilation") {
      sh "mvn clean install -DskipTests"
    }
  
    stage("Tests") {
        sh "mvn test"
    }
  
    stage("Deployment") {
        sh 'nohup mvn spring-boot:run -Dserver.port=8081 &'
    }
  }
}