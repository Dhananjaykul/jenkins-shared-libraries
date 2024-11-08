def call(String projectName, String imageTag, String dockerHubUser) {
    withCredentials([usernamePassword(credentialsId: 'DockerHubCredentials', 
                                      usernameVariable: 'dockerHubUser', 
                                      passwordVariable: 'dockerHubPass')]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${projectName}:${imageTag}"
    }
}
