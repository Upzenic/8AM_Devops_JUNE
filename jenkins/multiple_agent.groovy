pipeline{

agent none  //No global agent

stages{

stage('Agent Jenkins_Child'){

agent {label 'Jenkins_Child'}

steps{
   
  sh 'echo "This step is being executed from Any - Jenkins_Child"'

}
}

stage('Agent Jenkins_ChildNode_One'){

agent {label 'Jenkins_ChildNode_One'}

steps{

sh 'echo "This step is being executed from Agent - Jenkins_ChildNode_One "'


}
}
}
}
