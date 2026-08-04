pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                catchError(buildResult: 'FAILURE', stageResult: 'SUCCESS') {
                    echo 'Running build...'
                    sh 'exit 1'   // simulate a build failure
                }
            }
        }

        stage('Test') {
            steps {
                catchError(buildResult: 'UNSTABLE', stageResult: 'SUCCESS') {
                    echo 'Running tests...'
                    sh 'exit 1'   // simulate a test failure, but don't fail the build
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                sh 'echo Deployment successful'
            }
        }
    }

    post {
        always {
            echo "Final build result: ${currentBuild.result}"
        }
    }
}

