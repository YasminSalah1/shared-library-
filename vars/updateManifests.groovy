def call() {
    sh "sed -i 's|image: .*|image: yasminsalah1/myapp:latest|' k8s/deployment.yaml"
}

