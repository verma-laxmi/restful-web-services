pipeline {
  agent any
  stages{
    stage('checkout'){
      steps{
        git branch: 'develop', credentialsId: 'c62bfeeb-5a9f-4ac8-88d7-68674edf37fc', url: 'https://github.com/verma-laxmi/restful-web-services'
      }
    }
  }
}
