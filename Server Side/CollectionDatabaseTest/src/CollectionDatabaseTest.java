/*
 * File: HW3.java
 * Author: Kuni Scissum <kuni91@uab.edu
 * Assignment: HW3 - EE433 Fall 2013
 * Vers: 1.0.0 10/3/2013 kjs - initial coding
 * Credits: LocalLog package included based on David Green's code 
 *          <dgreen@uab.edu>
 * 
 */

import java.util.List;
import java.util.Iterator;
import java.sql.*;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
//import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
//import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.logger.LocalLog;
import com.j256.ormlite.table.TableUtils;
import com.mysql.jdbc.*;

/**
 *
 * @author Kuni J Scissum, <kuni91@uab.edu>
 */
public class CollectionDatabaseTest {

    private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/ee433";
    private Dao<User, Integer> userDao;
    private Dao<Task, Integer> taskDao;
    private Dao<Project, Integer> projectDao;
    //private DriverManager drivers;

    public static void main(String[] args) throws Exception {
        (new CollectionDatabaseTest()).run(args);
    }

    private void run(String[] args) throws Exception {
        JdbcConnectionSource connectionSource = null;
        //drivers.getConnection(DATABASE_URL, "root", "Coll3ctor1");

        try {
            
            // create data source for the database
            connectionSource = new JdbcConnectionSource(DATABASE_URL,"root", "Coll3ctor1");

            //setup database and DAOs. To create a new table, must uncomment.
            setupDatabase(connectionSource);

            //read and write
            readWriteData();

            System.out.println("\nWorks");
        } finally {
            if (connectionSource != null) {
                connectionSource.close();
            }
        }
    }

    private void setupDatabase(JdbcConnectionSource connectionSource) throws Exception {

        System.setProperty(LocalLog.LOCAL_LOG_FILE_PROPERTY, "log.log");
        // Create DAOs
        userDao = DaoManager.createDao(connectionSource, User.class);
        taskDao = DaoManager.createDao(connectionSource, Task.class);
        projectDao = DaoManager.createDao(connectionSource, Project.class);

        //Create tables
        TableUtils.createTableIfNotExists(connectionSource, User.class);
        TableUtils.createTableIfNotExists(connectionSource, Task.class);
        TableUtils.createTableIfNotExists(connectionSource, Project.class);


    }

    private void readWriteData() throws Exception {

        /*
         * The following lines are commented out to prevent unnecessary increase
         * in table sizes. Creates a list of users, projects, and tasks.
         */
//        User firstUser = new User("Kuni", "Scissum");
//        userDao.create(firstUser);
//
//        User secondUser = new User("John", "Smith");
//        userDao.create(secondUser);
//
//        User thirdUser = new User("Jane", "Janeson");
//        userDao.create(thirdUser);
//
//        Project firstProject = new Project("SeniorDesign", "Team Design Project");
//        projectDao.create(firstProject);
//
//        Project secondProject = new Project("Collections", "EE 433 Group Project");
//        projectDao.create(secondProject);
//
//        Task task1One = new Task("Update Project Plan", firstUser, firstProject);
//        taskDao.create(task1One);
//        Task task1Two = new Task("Calculate vertical angle", secondUser, firstProject);
//        taskDao.create(task1Two);
//        Task task1Three = new Task("Shooting test", firstUser, firstProject);
//        taskDao.create(task1Three);
//        Task task2One = new Task("Write SRS document", firstUser, secondProject);
//        taskDao.create(task2One);
//        Task task2Two = new Task("Discuss version 9", thirdUser, secondProject);
//        taskDao.create(task2Two);
//        Task task2Three = new Task("Write pseudocode", secondUser, secondProject);
//        taskDao.create(task2Three);
        
        //Create list of objects from tables
        List<Project> projects = projectDao.queryForAll();
        List<User> users = userDao.queryForAll();
        List<Task> tasks = taskDao.queryForAll();
        
        // Print out the three tables
        System.out.println("List of projects: ");
        for (int i = 0; i < projects.size(); i++){ 
            System.out.println("\t" + projects.get(i).getName());
        }
        System.out.println("List of users: ");
        for (int i = 0; i < users.size(); i++){
            System.out.println("\t" + users.get(i).getName());
        }
        System.out.println("List of tasks: ");
        for (int i = 0; i < tasks.size(); i++){
            System.out.println("\tTask #" + tasks.get(i).getID() + " " + tasks.get(i).toString() + "\n");
        }

        //Print out users and associated tasks
        User aUser;
        for (int i=1; userDao.queryForId(i) != null; i++){
            aUser = userDao.queryForId(i);
            System.out.println(aUser.getName());
            Iterator<Task> userTasks = aUser.tasks.iterator();
           
            while (userTasks.hasNext()) {
                System.out.println("\t" + userTasks.next());
            }
            System.out.println("");
        }
        
        // Print out projects and associated tasks
        Project aProject;
        for (int i=1; projectDao.queryForId(i) != null; i++){
            aProject = projectDao.queryForId(i);
            System.out.println(aProject.getName());
            Iterator<Task> projTasks = aProject.tasks.iterator();
           
            while (projTasks.hasNext()) {
                System.out.println("\t" + projTasks.next());
            }
            System.out.println("");
        }
    }
}