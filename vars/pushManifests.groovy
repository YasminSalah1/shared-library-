def call() {
    sh '''
        git config --global user.email "jenkins@example.com"
        git config --global user.name "Jenkins CI"
        git add k8s/deployment.yaml
        git commit -m "Update image tag to latest"
        git push origin main
    '''
}

