pipeline {
    agent {
        node {
            label 'win_box'
        }



    }
    stages {
        stage ('Check out code from SCM'){
            steps {
                
                        git credentialsId: 'b13df8fe-3ba1-42aa-b716-2f0343c79364', url: 'https://github.com/Balaji0804/Balaji-11thJuly.git'
               
            }
        }
        stage ('run simple cmd'){
            steps {
                bat """ 
                echo "this is step after checkout"
                """
            }
        }  
    }
}