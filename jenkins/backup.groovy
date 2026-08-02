pipeline{

agent any

stages{

stage('Run Command'){

steps{  
    sh '''
    
    tar -czvf backup_$(date +%d-%m-%Y).tar.gz /var/lib/jenkins
    
    echo "The backup is successful"
    '''
}
}
}
}
