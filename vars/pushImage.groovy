def call(String imageName, String imageTag) {
  withCredentials([string(credentialsId: 'dockerhub-token', variable: 'TOKEN')]) {
    sh "docker login -u yasminsalah1 -p \$TOKEN"
    sh "docker push ${imageName}:${imageTag}"
  }
}

