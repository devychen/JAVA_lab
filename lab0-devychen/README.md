[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/zu81dXTe)
# Preparation for GitHub Classroom

Git is a version control system that makes it easy to back up your code and collaborate with others by using repositories, basically a folder, that contains your code. GitHub is a popular platform that hosts these repositories.

We will be posting your labs on GitHub, which you can access via an invitation link. A personalized repository will be generated for you which you will need to clone, or copy, to your local machine. From there, you can edit the code to complete the assignment.

When you are finished, you must commit your changes. Committing just means recording the changes. Git "tracks" files in the repository and needs to know which ones are ready to be shared with the remote (online) repository. Not committing a file just means Git will ignore them while you keep working on it on your computer. You should commit your code every time a meaningful change is made, for example when you complete one part of an assignment.

Finally, you need to push your changes to the remote repository, otherwise your changes will just stay on your local device. Below you will find some instructions on how to get started.

## Installing Git

Before you begin, you will need to install Git on your computer. Instructions on how to do this are available here: https://git-scm.com/downloads

## Set account identiy

Before you can upload or push your changes to the remote repository, you must first configure your name and e-mail with Git on your machine. You only need to do this once.
The email needs to be the the same email you used to signup for Github.

~~~
git config --global user.name "FIRSTNAME LASTNAME" 
git config --global user.email "YOUR@MAIL.HERE"
~~~

## Set up an SSH key

Unless you’ve already associated an SSH key with your GitHub account, you won’t be able to upload anything via the
terminal/bash. In order to set an SSH key, follow the instructions below:

1. You first want to generate the key. Open the terminal and type in the following command: 

~~~
ssh-keygen -t rsa -b 4096 -C "YourGitHubEmailAddress"
~~~

You will be prompted to enter the path to the file in which you want to save the key — here you can just
hit Enter and let it get saved to the default location (which is shown). Now enter and confirm the password you want to use and
write it down somewhere because things get trickier if you forget it at some point.

2. Now that the key has been generated, you have to somehow let the computer know that you want to use it. First of all, we need to
start the ssh-agent:

~~~
eval $(ssh-agent -s)
~~~

3. Now we can add the key:
 
~~~
ssh-add ˜/.ssh/id_rsa
~~~

Now enter the passphrase and the identity should now be added. (Note that
˜/.ssh/id_rsa is the default location. In case you saved it somewhere else in step 1, you should use the path to that location.)

4. Now copy the public key so that you can paste it to GitHub. You can either do this manually by going to the location of your key (in
my case /c/Users/milet/.ssh/id_rsa.pub).

5. You can now go to GitHub, click on your profile picture and then hit Settings. In the navigation menu (left-hand side) go to SSH
and GPG keys. There is now a green button in the top-right corner New SSH key. Go ahead and click on it. Give a Title to the key
(whatever you want to call it) and then paste the key we just copied in the Key field and hit the Add SSH key button.

## Cloning a repository

In the lab repository click the green "Code" button in the righ upper corner, choose SSH and copy the link. We will need it.

In your terminal, navigate to the folder where you want to store your work using `cd` if you'd like. Then clone this project to your local machine using Git like that: git clone the-link-you-copied

~~~
git clone git@github.com:ISCL-Java1-WS2023/lab0-USERNAME.git
~~~

After you have done this, open the text file on your local machine with any text editor such as Notepad or TextEdit, and overwrite the lines with the information we need to associate your GitHub account with your name and Student ID number, save your changes, and close the file.

For example:

Max Mustermann
1234567

## Add a file

For most assignments, you are provided with all the starter code you need and will simply need to clone, commit, and push them. But sometimes, you will need to create a new file from scratch. When a file is not already added to the Git repository, you must first add it yourself.

~~~
git add filename.idk
~~~

Please open VSCode and create an (extremely simple!) java file that simply has one main method that prints "Hello world!" to System.out. Make sure you save the file in the same folder, since that is the only one being tracked by Git. When you're ready, add the file to Git, commit your changes, and push it to GitHub.

## Commit a file

After saving the file, return to the terminal and make sure you're in the same directory that contains the file. You can now commit your changes to Git.

~~~
git commit info.txt -m "update personal information"
~~~

The -m flag means message, which you must always include with every commit. Enter a concise, but meaningful description of the changes you made. There are style conventions for commit messages such as beginning with an action verb in the imperative mood. Other examples: "populate required fields" or "add name and student ID".

## Push changes

You are now ready to push any staged commits, which will update the remote repository. Simply execute:

~~~
git push
~~~

## Other useful commands

For now, those are the main commands you will be working with, but it might be useful to know about these other ones:

`git status` shows modified files in your working directory that are staged for your next commit.

`git rm filename.idk` deletes the file from the project and stages the removal for commit. Simply deleting a file in your local directory is not enough to remove it from the remote repository.

Execute `git help` to get more information.

This tutorial was provided for previous classes by Eric DeMattos.
It was modified by Miriam Segiet and Klara Lennermann.
