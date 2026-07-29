pipeline {
    agent any

    parameters {
        string(
            name: 'USERNAME',
            defaultValue: '',
            description: 'Enter your name'
        )
    }

    stages {
        stage('Validate Input') {
            steps {
                script {
                    if (params.USERNAME.trim() == "") {
                        error("Username cannot be empty!")
                    } else {
                        echo "Welcome ${params.USERNAME}"
                    }
                }
            }
        }
    }
}
