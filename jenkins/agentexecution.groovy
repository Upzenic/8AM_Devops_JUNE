pipeline {
    agent {
        label 'NODE1 || NODE2'
    }

    stages {
        stage('Run Job') {
            steps {
                echo "Running on: ${env.NODE_NAME}"

                sh '''
                    echo "Executing build..."
                    hostname
                '''
            }
        }
    }

    post {
        always {
            echo "Pipeline completed on ${env.NODE_NAME}"
        }
    }
}
