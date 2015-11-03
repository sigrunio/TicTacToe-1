#Development Manual

Linux/Mac??

#### To be able to make the project build on a fresh machine, you need to write the following command line: 

**Activate a SSH key**

* ssh-keygen -> Enter -> Enter (for default file name and no password)  
* pbcopy < ~/.ssh/id_rsa.pub  	   
* open Github profile  -> settings -> SSH keys -> add SSH key
					
**Download git**  

* sudo apt-get install git  
					
**Set your identification on git**  

* git config --global user.email "your@email.com"  
* git config --global user.name "Your Name"

					
**Clone the repository into a machine of your choice**  

* git clone https://github.com/HUGB-Task/TicTacToe.git

					
**Download java**

* Check if you already have java on your machine by writing: 
	* java -version  
* If nothing is returned you will have to install it by writing:
	* sudo apt-get install openjdk-8-jdk
					
**Build the project**  

* ./gradlew build

We use Heroku to deploy and host our application.
