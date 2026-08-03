pipeline {
    agent any

    parameters {
        string(name: 'VERSION', defaultValue: '1.0', description: 'Application Version')
    }

    stages {
        stage('Build') {
            steps {
                echo "VERSION = ${params.VERSION}"
            }
        }
    }
}
