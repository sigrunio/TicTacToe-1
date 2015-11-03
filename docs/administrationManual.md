# Administrator Manual

### How to set the it up and get it to run on a fresh maschine

If you haven´t checked out the development manual, make sure to do that prior to making the following commands: 

**Create a new branch**  

* git checkout -b "your-branch-name"

**Check your new changes**  

* git status

**Commit your changes**

* git add "your-changes"  
* git commit -m "your-comment"

**Push your branch to Github**  

* git push -u "your-branch"

**Merge your branch to master**

* git checkout master
* git merge "your-branch"

**Push your changes to Github**  

* git push origin master

As soon as you push your changes to Github, that is if all your tests have passed, it will be automatically deployed to Travis and Heroku.  
