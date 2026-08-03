pipeline {
    agent any

    stages {
        stage('Call Another Job') {
            steps {
                script {
                    def job = build job: 'Job1',
                                    parameters: [
                                        string(name: 'VERSION', value: '2.0')
                                    ],
                                    wait: true

                    echo "Job1 Build Number: ${job.number}"
                    echo "VERSION used in Job1: ${job.buildVariables.VERSION}"
                }
            }
        }
    }
}
