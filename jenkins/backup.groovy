pipeline{

agent any

stages{

stage('Run Command'){

steps{  
    sh '''
    
    tar -czvf backup_$(date +%d-%m-%Y).tar.gz /etc /var/www /home
    
    echo "The backup is successful"
    '''
}
}
}
}
