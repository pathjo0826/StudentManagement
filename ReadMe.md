# StudentManagement

Client code: https://github.com/pathjo0826/StudentManagementClient/tree/master
Server code: https://github.com/pathjo0826/StudentManagementServer/tree/master

To run:

1. Download the server code from GitHub.
2. In Wildfly => standalone => configuration => Open the "standalone.xml" file.
3. Add this to <datasources> section:

    <datasource jndi-name="java:/StudentDb" pool-name="StudentDb"
                             enabled="true" use-java-context="true">
     <connection-url>jdbc:derby://localhost:50000/StudentDb </connection-url>
      <driver>derbyclient.jar</driver>
      <security>
           <user-name>APP</user-name>
           <password>APP</password>
       </security>
   </datasource>
   
4. In the "build.xml" change the path to where you have your wildfly-23.0.0.Final\standalone\deployments
5. Start Wildfly in a terminal.
6. Deploy the database driver. Go to localhost:9990 and login. Under Deployments choose "Upload Deployment". 
   There we add the derbyclient.jar which is in the db-derby/lib folder.
7. Start DBMS Derby, create a database with the name "StudentDb".
8. Create a table called "Student" with attributes 
	a) id int generated always as identity
	b) firstName varchar(50)
	c) lastName varchar(50)
	d) admissionYear varchar(10)
	e) school varchar(30)
9. By running build.xml as an Ant build you will deploy a war file to Wildfly.
10. Get the client code from GitHub.
11. Start retrieving and posting data to database.
