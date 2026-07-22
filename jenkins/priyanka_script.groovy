pipeline{

agent any

stages{

stage('Integration'){

steps{
       sh '''
       
       echo "This is an integration stage"
       
       '''
}
}
stage('Test'){

steps{
     sh '''
     echo "This is an Testing stage"
    '''
}
}
stage('Deployment'){

steps{

sh '''

echo "This is a deployment phase"

'''
}
}
}
}
