pipeline{

agent { lable 'Jenkins_Child'}

stages{

stage('Run Python Script'){

steps{

  sh 'python3 user_input.py'
}
}
}
}
