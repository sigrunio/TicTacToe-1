#Development Manual

#### To make the project build do the following steps on a UNIX based system (Linux/Mac):

##### Set up Git Source Control Client: 
- **To** **Install:** open terminal and type: $ sudo apt-get install git 
- **SSH** **Key:** 
    * terminal: $ ssh-keygen -> Enter -> Enter (for default file name and no password)
    * terminal: $ cat ~/.ssh/id_rsa.pub and copy the key
    * Sign up on GitHub 
    * Open profile -> settings -> SSH keys -> add SSH key
    * Verify SSH in terminal: $ ssh -T git@github.com" -> yes -> hi.. should appear
- **Clone Repository**: $ git clone with _SSH_: git@github.com:HUGB-Task/TicTacToe.git
or _HTTPS_: 
https://github.com/HUGB-Task/TicTacToe.git
		
##### Set up Java:
- **To** **Install:** terminal: $ sudo apt-get install openjdk-8-jdk

##### Set up Gradle which is a build automation tool:
- **To** **Install:** terminal: $ sudo apt-get install gradle

##### Build the Application locally :
- **To** **Build:** terminal: $ cd ~/TicTacToe and $ ./gradlew build 


