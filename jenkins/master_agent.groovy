pipeline {
    agent none

    stages {

        stage('Run on Controller') {
            agent { label 'built-in' }

            steps {
                echo "Running on Jenkins Controller"
                sh 'hostname'
                sh 'pwd'
            }
        }

        stage('Run on Agent') {
            agent { label 'agent1' }

            steps {
                echo "Running on Jenkins Agent"
                sh 'hostname'
                sh 'pwd'
            }
        }
    }

    post {
        always {
            echo "Pipeline completed successfully."
        }
    }
}
