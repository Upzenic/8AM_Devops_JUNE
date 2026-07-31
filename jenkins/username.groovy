pipeline{

agent { label 'Jenkins_Child'}

environment {SCRIPT_PATH='python/user_input.py'}

stages{

stage('Run Python Script'){

steps{

  sh 'python3 ${SCRIPT_PATH}'
}
}
}
}
