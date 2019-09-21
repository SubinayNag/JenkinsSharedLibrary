@Library('JenkinsLibrary') _
pipeline {
    agent any
    stages {
        stage('AnsibleRoleClone') {
            steps{
                script {
                    jenkinsInstall.gitClone("https://github.com/SubinayNag/JenkinsInstallAnsibleRole.git")
                    }
                }
        }
        stage('JenkinsInstall') {
            steps{
                script {
                    jenkinsInstall.playbook('JenkinsInstallAnsibleRole/inventory.txt', 'JenkinsInstallAnsibleRole/jenkinsInstallation.yml')
                }
            }
        }
    }
}
