/*
 * File: Task.java
 * Author: Kuni Scissum <kuni91@uab.edu
 * Assignment: HW3 - EE433 Fall 2013
 * Vers: 1.0.0 10/3/2013 kjs - initial coding
 */


import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

/**
 *
 * @author Kuni Scissum <kuni91@uab.edu
 */
@DatabaseTable(tableName = "tasks")
public class Task {
    
    public final static String USER_ID_FIELD_NAME = "user_id";
    public final static String PROJECT_ID_FIELD_NAME = "project_id";
    
    @DatabaseField(generatedId=true)
    private int id;
    
    @DatabaseField(canBeNull = false, foreign=true, columnName = USER_ID_FIELD_NAME )
    private User user;
    
    @DatabaseField(canBeNull = false, foreign=true, columnName = PROJECT_ID_FIELD_NAME )
    private Project project;
    
    
    @DatabaseField(canBeNull = false)
    private String taskDesc;
    
    Task() {
        //
    }
    
    public Task(String taskDesc, User user, Project project) {
        this.taskDesc = taskDesc;
        this.user = user;
        this.project = project;
    }
    public int getID(){
      return id;  
    }
    
    @Override
    public String toString() {
        return taskDesc;
    }
    
    
}
