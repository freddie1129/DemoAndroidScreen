pipeline {
    agent any
    triggers{ cron('H/1 * * * *') }
    stages {
        stage('Compile') {
            steps {
		sh 'echo "Hello World"'
                sh './gradlew build'
            }
        }
    }
    post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
        success {
            echo 'I succeeeded!'
        }
        unstable {
            echo 'I am unstable :/'
        }
        failure {
            echo 'I failed :('
        }
        changed {
            echo 'Things were different before...'
        }
    }
}
