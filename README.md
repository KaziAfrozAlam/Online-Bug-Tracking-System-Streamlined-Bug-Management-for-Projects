# Bug-Tracker
A bug tracking software which organizes the project between project managers and developers by tracking each bug within each project with a professional GUI and database.

## Table of Content
- [Bug-Tracker](#bug-tracker)
  * [Project Functionalities](#project-functionalities)
  * [Dependencies](#dependencies)
  * [Tools](#tools)
  * [Deployment](#deployment)
  * [Design Pattern](#design-pattern)
  * [S.O.L.I.D Principles](#solid-principles)
  * [Database Models](#database-models)
  * [Author](#author)
  * [Common Errors](#common-errors)
  * [Screenshots](#screenshots)
    + [Login Page](#login-page)
    + [Sign up Page](#sign-up-page)
    + [Admin Dashboard(1)](#admin-dashboard-1)
    + [Admin Dashboard(2)](#admin-dashboard-2)
    + [Admin Dashboard(3)](#admin-dashboard-3)
    + [Project Manager Dashboard](#project-manager-dashboard)
    + [Add Project Page](#add-project-page)
    + [Add Bug Page](#add-bug-page)
    + [Bug Details Page](#bug-details-page)
    + [Project Details Page](#project-details-page)

## Project Functionalities
1. Supports users with different roles (Admin, Project Manager, Developer).
2. Authentication and Authorization.
3. Database connection.
4. Different dashboard for each user (Admin, Project Manager, Developer).
5. Adding projects and assigning them to developers.
6. Adding bugs tickets withing each project and assigning them to certain developer.
7. Adding comments to each bug ticket.

## Dependencies
**1. mysql-connector-java-8.0.35**

Configuration for mysql connector is added in the pom.xml file

**2. javafx-sdk-21.0.2**

This library is already downloaded in the repo, you won't have to download it.

## Tools
1. VSCode IDE has been used in this Project development
2. Java
3. JavaFX
4. MYSQL to manage database
5. MYSQL J Connector to connect to the database
6. mySQL is configured and installed locally in this machine host the database


## Deployment
**1. Setting your Database**

Inside "dbUtil" folder, you will find "DBConnection" class. You can change the value of the following variables and assign them to your database.

1. url
   Change this variable to the url of your database
2. USERNAME
   Change this variable to the username of your database
3. PASSWORD
   Change this variable to the password of your database

**2. Running your main class**

Run the "GUIStart" class inside View folder as your main class


## Design Pattern
<p align="center">
 <strong> Model-View-Controller Design Pattern</strong>
</p>


In "src" folder, you will find 3 sub folders name "Model", "View" and "Controller". These folders contain the classes where MVC pattern is applied

**1. Model**

contains only the pure application data, it contains no logic describing how to present the data to a user.

**2. View**

presents the model’s data to the user. The view knows how to access the model’s data, but it does not know what this data means or what the user can do to manipulate it.

**3. Controller**

Exists between the view and the model. It listens to events triggered by the view and executes the appropriate reaction to these events. The reaction is to call a method on the controller classes. Since the view and the model are connected through a notification mechanism, the result of this action is then automatically reflected in the view.

## S.O.L.I.D Principles
**1. Single-Responsibility Principle**

A class should have one and only one reason to change, meaning that a class should have only one job. That is why controller classes such as "AddBugController". such classes are only responsible for one thing as shown from classes' name.

**2.  Open-Closed Principle**

If you want to contribute to this project by adding whatever you want, all you need is no less than 3 classes in 3 different folders which are Model, View and controller folders.

You write the pure data or your template in your new Model class. Develop a GUI for your added feature in your new View class. Define how you want it to react for whatever the user does in your new Controller class.


## Database Models
[Database Models](Database%20Models)

## Author
[Ramiz]

## Common Errors
> You may get into some issue during the run related to the JavaFx modeules, please follow the following steps to configure JavaFx runtime path

> Run >> Open Configurations

Add the following setting in the launch.json file

> configurations": [ \
>        { \
>           "type": "java", \
>           "name": "DBConnection", \
>           "request": "launch", \
>           "mainClass": "DBConnection", \
>           "projectName": "BugTracker" \
>        }, \
>        { \
>          "type": "java", \
>          "name": "LaunchGUI", \
>            "request": "launch", \
>            "mainClass": "GUIStart", \
>            "vmArgs": "--module-path \"/home/asif/workArea/java_work/javafx-sdk-21.0.2/lib\"   --add-modules=javafx.controls,javafx.fxml" \
>       } \
>    ] 

## Screenshots
### Login Page
<p align="center">
  <img src="capture_image/Login Page.png"/>
</p>

### Sign up Page
<p align="center">
  <img src="capture_image/Sign Up.png"/>
</p>

### Admin Dashboard 1
<p align="center">
  <img src="capture_image/Admin_Dashbiard 1.png"/>
</p>

### Admin Dashboard 2
<p align="center">
  <img src="capture_image/Admin_dashboard 2.png"/>
</p>

### Admin Dashboard 3
<p align="center">
  <img src="capture_image/Admin_dashboard 3.png"/>
</p>

### Project Manager Dashboard
<p align="center">
  <img src="capture_image/Project_manager_dashboard.png"/>
</p>

### Add Project Page
<p align="center">
  <img src="capture_image/Add_project_page.png"/>
</p>

### Add Bug Page
<p align="center">
  <img src="capture_image/Add_Bug_Page.png"/>
</p>

### Bug Details Page
<p align="center">
  <img src="capture_image/Bug_Details_Page.png.png"/>
</p>

### Project Details Page
<p align="center">
  <img src="capture_image/Project_details_page.png"/>
</p>



