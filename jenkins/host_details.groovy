pipeline{
    agent any
    
    stages{
        stage('Get Jenkins Master Server Details'){
            steps{
                sh '''
                echo "Master Host Name is: $(hostname)"
                echo "Host IP Address is: $(hostname -I)"
                echo "Host File Utilization is: $(df -h)"
                echo "Host OS Information is: $(uname -a)"
                echo "Host Up Time is: $(uptime)"
                '''
            }
        }
       
    }

}
