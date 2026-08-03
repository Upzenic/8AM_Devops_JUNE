pipeline {
    agent none

    stages {
        stage('Run on Multiple Agents') {
            parallel {
                stage('NODE1') {
                    agent { label 'NODE1' }
                    steps {
                        echo "Running on ${env.NODE_NAME}"
                    }
                }

                stage('NODE2') {
                    agent { label 'NODE2' }
                    steps {
                        echo "Running on ${env.NODE_NAME}"
                    }
                }
            }
        }
    }
}
