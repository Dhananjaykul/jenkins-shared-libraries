def call(String url, String branch) {
    echo "Cloning repository: ${url} (Branch: ${branch})"
    git url: "${url}", branch: "${branch}"
    echo "Code cloning successful"
}
