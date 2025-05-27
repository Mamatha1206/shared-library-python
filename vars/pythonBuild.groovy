def call() {
    stage('Install Dependencies') {
        sh 'pip install -r requirements.txt'
    }

    stage('Run Tests') {
        sh 'PYTHONPATH=.:$PYTHONPATH pytest tests/'
    }

    stage('Build Package') {
        sh 'python setup.py sdist bdist_wheel'
    }
}

