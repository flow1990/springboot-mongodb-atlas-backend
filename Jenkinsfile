pipeline {
    agent any
    tools {
       maven 'MVN_3.8.6'
    }
    stages {

        stage('Compilation'){
            steps{
                script{
                    sh "mvn clean install -DskipTests"
                }
            }
        }

        stage('Testing'){
            steps{
                script{
                    sh "mvn test"
                }
            }
        }
        
        stage('Deployment'){
            steps{
                script{
                    sh "nohup mvn spring-boot:run -Dserver.port=8081 &"
                }
            }
        }
    }
}