node{
	stage('checkout'){
      git branch: 'develop', credentialsId: 'c62bfeeb-5a9f-4ac8-88d7-68674edf37fc', url: 'https://github.com/verma-laxmi/restful-web-services'
    }
    stage('compile'){
      def mavenHome = tool name: 'Maven3', type: 'maven'
      sh "${mavenHome}/bin/mvn clean install"
    }
	stage('verify on sonar'){
      def sonarHome = tool name: 'sonarqube', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
      withSonarQubeEnv('sonarqube'){
      	sh "${sonarHome}/bin/soar-scanner \
      		-D sonar.projectKey=restful-web-services \
		-D sonar.login=admin \
		-D sonar.password=password \
		-D sonar.sources=/var/jenkins_home/workspace/test \
		-D source.host.url=http://172.17.0.3:9000 \
		-D sonar.java.binaries=target"
      }
    }
}
