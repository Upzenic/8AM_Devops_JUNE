pipeline{

agent { label 'Jenkins_Child'}

environment {SCRIPT_PATH='python/user_input.py'}

parameters {string(name:'USER_NAME',defaultvalue:'Guest', description: 'Enter your name:')}

stages{

stage('Run Python Script'){

steps{

  sh 'python3 ${SCRIPT_PATH} ${params.USER_NAME}'
}
}
}
}
