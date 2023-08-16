pipeline {
    agent any

    stages {
        stage('test') {
            steps {
                git branch: 'main', credentialsId: 'git', url: 'https://github.com/saikumarm96/Spring.git'
                sh 'mvn clean install'
                sh 'sudo docker build -t saikumarm96/docker1:spring .'
                sh 'sudo docker login'
                sh 'sudo docker push saikumarm96/docker1:spring'
                sh 'sudo docker run -d -p 8082:8080 saikumarm96/docker1:spring'
            }
        }
    }
}
