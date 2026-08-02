def failoverPipeline(primaryNode, secondaryNode, command){
  try{
  
     timeout(time: 5, unit:'MINUTES'){
      echo "Attempting to run the script from ${primaryNode}"
      node(primaryNode) {
       sh command      
      }         
     }
  }catch(Exception e){
  
  echo "Script has failed from ${primaryNode}, executing in ${secondaryNode}"
  node(secondaryNode){
  echo "Script Executed Successfully"
  }
  }
}


pipeline{
agent none
environment {SCRIPT_PATH='python/failoverSample.py'}
stages{
stage('Call Method'){
steps{
script{
failoverPipeline('Jenkins_Child', 'Jenkins_ChildNode_One', "python3 ${SCRIPT_PATH}")
}
}
}
}
}
post {
always{
  echo "The script has executed successfully"
}
failure{
 echo "Both the nodes are failed"
}
success{
echo "The pipeline has succeeded"
}
}
