#!groovy
pipeline {
    agent  {
    	kubernetes{
      label 'jenkins-slave'
      defaultContainer 'jnlp'
      yaml """
apiVersion: v1
kind: Pod
metadata:
  labels:
    name: init
spec:
  containers:
  - name: base
    image: jenkins/slave:alpine 
    command:
    - cat
    tty: true
    resources:
      limits:
      memory: 200Mi

"""
	}
    }
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
 
