pipeline {
    agent {
        label 'built-in'
    }

    environment {
        BACKUP_DIR = "/tmp/jenkins_backup"
        JENKINS_HOME = "/var/lib/jenkins"
    }

    stages {

        stage('Create Backup Directory') {
            steps {
                echo "Creating backup directory..."
                sh 'mkdir -p $BACKUP_DIR'
            }
        }

        stage('Backup Jenkins Home') {
            steps {
                echo "Backing up Jenkins home..."
                sh 'tar -czf $BACKUP_DIR/jenkins_backup.tar.gz $JENKINS_HOME'
            }
        }

        stage('Verify Backup') {
            steps {
                echo "Verifying backup..."
                sh 'ls -lh $BACKUP_DIR'
            }
        }
    }

    post {
        success {
            echo "Jenkins backup completed successfully."
        }
        failure {
            echo "Backup failed."
        }
    }
}
