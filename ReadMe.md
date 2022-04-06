# StudentManagement

To run:

1. In Wildfly => standalone => configuration => Open the "standalone.xml" file.
2. Add this to <datasources> section:

    <datasource jndi-name="java:/StudentDb" pool-name="StudentDb"
                             enabled="true" use-java-context="true">
     <connection-url>jdbc:derby://localhost:50000/StudentDb </connection-url>
      <driver>derbyclient.jar</driver>
      <security>
           <user-name>APP</user-name>
           <password>APP</password>
       </security>
   </datasource>
   
3. In the "build.xml" change the path to where you have your wildfly-23.0.0.Final\standalone\deployments
4. Start Wildfly in a terminal.
5. Deploy the database driver. Go to localhost:9990 and login. Under Deployments choose "Upload Deployment". 
   There we add the derbyclient.jar which is in the db-derby/lib folder.
6. Start DBMS Derby, create a database with the name "StudentDb".
7. By running build.xml as an Ant build you will deploy a war file to Wildfly.
8. Get the client code from <<här sätter vi en annan github repo>>
9. Start retrieving and posting data to database.
