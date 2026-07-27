pipeline {
    agent any

    stages {
        stage('Server Details') {
            steps {
                script {
                    echo "Node Name      : ${env.NODE_NAME}"
                    echo "Workspace      : ${env.WORKSPACE}"
                    echo "Jenkins URL    : ${env.JENKINS_URL}"
                    echo "Job Name       : ${env.JOB_NAME}"
                    echo "Build Number   : ${env.BUILD_NUMBER}"
                }

                sh '''
                echo "=============================="
                echo "Hostname : $(hostname)"
                echo "IP Address:"
                hostname -I
                echo "Operating System:"
                uname -a
                echo "=============================="
                '''
            }
        }
    }
}
