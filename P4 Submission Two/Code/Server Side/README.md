Collection$
===========

**Server Side**

*UAB EE433 - Team 2 - Android Phone App - Collection$*

### 12/07/2013 ~  KJS ~ Notes:

*	Ran into trouble trying to setup a server. 11:00 PM
	* I installed Apache Tomcat 7.0, MySQL, Eclipse ADT and Java EE on both my laptop and PC at home. 
	* It is simple enough to connect locally, but I tried connecting using web browser on phone and was unsuccessful.
	* Focusing on MySQL and Java Servlet for the remainder of the day.
	* Useful link for test cases: http://dev.mysql.com/doc/mysqltest/2.0/en/index.html

### 12/08/2013 ~ KJS ~ Notes:

* 	List of possible helpful URLs to look through:
	* http://wiki.apache.org/tomcat/FrontPage
	* http://www.tutorialspoint.com/servlets/servlets-database-access.htm
	* http://www.tutorialspoint.com/mysql/mysql-useful-functions.htm
	* http://www.tutorialspoint.com/mysql/mysql-count-function.htm
	* http://www.coreservlets.com/Apache-Tomcat-Tutorial/tomcat-7-with-eclipse.html#More-Info
	* http://dev.mysql.com/doc/refman/4.1/en/entering-queries.html
	* http://www.analysisandsolutions.com/code/mysql-tutorial.htm#tighten
	* http://www.mysql.com/products/
	* http://ormlite.com/data_types.shtml
	* http://stackoverflow.com/questions/17715449/how-to-get-data-from-web-service-in-android
*	Considering using ORMLite to link Collection and Items, similar to HW3. If it does not work, highly consider using a "Collections" and "UserID" property for items.
* Uploaded CollectionDatabaseTest project. Created to demonstrate Java connectivity to MySQL database. Only works when MySQL is installed locally; currently working on remote connection issue.

### 12/14/2013 ~ KJS ~ Notes:

*	Previously, connectivity from Tomcat Servlet to MySQL database could not be established. However, the DatabaseAccess servlet found in the DatabaseConnect project has established connectivity. 
	* When setting up for connectivity, the JDBC Driver must be installed inside in TOMCAT_HOME/lib directory. The Tomcat opens up the connection source for all servlets and connections, so the .jar file must be included in the Tomcat folder, not for the Project.
	* The DB_URL variable in the DatabaseAccess.java file must be changed if running on a different machine not local to the MySQL database. The following must be changed:
		* DB_URL: //71.45.66.15:3306/ee433
		* User:	Collector
		* Password: Collectors
	* The above only applies if you are trying access the database used in this example; a personal database can be created, but be sure to account for database name, tables, properties, username, and password.
*	Another servlet will be created for use in the Collections application. Need to establish "delimiters" and format of response of HTTP request. 