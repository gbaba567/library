## This is Spring MVC(4.1.6 RELEASE) project
The project provides simple view library pages. The database layer contains H2 as a database and Hibernate as an ORM to Spring.
### How to run
Clone this project and go to the project folder in command prompt.
(Note : You must have setup Maven in your comouter to be able to run this command)
First you have to build the project.Execute command ``mvn clean install`` to build.
Run below command to run and deploy build on jetty server.
`` mvn jetty:run``

The command will compile the code and start jetty server within 1 or 2 minutes.
If you see below lines in the command prompt you are good to go.
``[INFO] Started Jetty Server
[INFO] Starting scanner at interval of 1 seconds.``

goto 'http://localhost:8080/'

You should be able to see the home page.


