def call() {
    stage('Install Dependencies') {
        sh 'pip3 install -r requirements.txt'
    }

    stage('Run Tests') {
        sh 'PYTHONPATH=. pytest tests/'
    }

    stage('Build Package') {
        sh 'python3 setup.py sdist bdist_wheel'
    }
}


