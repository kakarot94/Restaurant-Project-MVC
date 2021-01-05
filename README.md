Restaurant Project using MVC
==============

Implementing Model-View-Controller
----------------
Application for restaurants. Application tracks the status of availability of tables quickly and efficiently issue invoices and store receipts. Easy selection of items from the menu.

Usage
-----

Compile files

    cd src
    javac *.java

App class in AppPackage contains the main method. 

Input
-----
When app is turned on, first window is Log In Window.  
1.User need to create new user by clicking on button -New employee-.

2.User need to input name, user name, password and to repeat password for validation.
Clicking on button -new-, window Create new employee is disposed after new user is
successfully added.

3.User need to input new users -user name- and -password- and if both are true, 
Log In window is disposed and Main Window is opened.

Output
------
Error mesages :
  1. If password parameter and validation password parameter are not equal, error occur:
    -Incorrect password check, try again-
    
  2. If user name is alredy taken, error occur:
    --User name alredy taken!-
    
  3. If user name or password or both parameters are empty next errors can occur:
     -Please enter user name and password.-
     -Please enter user name.-
     -Please enter password.-
     
  4. If user name is wrong, error can occur:
     -User does not exist.-
     
  5. If password is wrong, error can occur: 
     -Wrong password -


