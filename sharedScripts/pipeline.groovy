#!groovy
pipeline {
    agent linux 
        stages {
            stage('Stage 1') {
                steps {
                    echo 'logic'
                }
            }
            stage('Stage 2') {
                steps {
                    echo 'logic'
                }
            }
        }
    }
 
