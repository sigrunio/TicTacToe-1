# Administrator Manual

### How to set up and get it running.

**MARK:** Please do the steps in Development manual before continuing.

##### Run the Application Locally:
- **To** **Run:** terminal: $ cd ~/TicTacToe and $ ./gradlew run
- **Open** **URL:** open your favorite browser and type: http://0.0.0.0:4567 or just 0.0.0.0:4567. The site should run locally if "./gradlew run" has not been terminated.
- **Close** **Game**: close the browser and type "CTRL-C" in terminal.

##### Deploy the application:
- **To** **Deploy:** terminal: $ cd ~/TicTacToe and $ ./bin/deploy
- jar/application is supposed to be generated outside the root (~/TicTacToce folder which was generated with git clone..) of the application.

##### Run tests:
- **To** **Run:** terminal: $ cd ~/TicTacToe and $ ./gradlew test

---

#### How to maintain the application 

##### Set up Travis 
- Sign up with Github on (Travis)[https://travis-ci.org]
- Go to https://travis-ci.org/profile/USERNAME and click your Github Organization
- Flick the switch of the TicTacToe repository
- Start making changes, commit on github.
- As soon as you commit Travis will start automatic build on your repository.

##### Set up Heroku
- Sign up on (Heroku)[https://www.heroku.com]
- Set up (Heroku toolbelt)[https://toolbelt.heroku.com] 
- To login to master in terminal: $ heroku login 
- After changes have been made type in terminal: $ heroku push master
- The master branch on git is stored at <app name>.herokuapp.com  
