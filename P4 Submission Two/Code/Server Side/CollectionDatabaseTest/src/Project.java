/*
 * File: Project.java
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
 * @author Kuni Scissum <kuni91@uab.edu>
 */
@DatabaseTable(tableName = "projects")
public class Project {
    
    public final static String TASK_ID_FIELD_NAME = "task_id";
    
    @DatabaseField(generatedId=true)
    private int id;
    
    @DatabaseField(canBeNull = false)
    private String name;
    
    @DatabaseField
    private String description;
    
    @ForeignCollectionField(eager = false)
    ForeignCollection<Task> tasks;
    
    
    Project(){
        //
    }
    
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public ForeignCollection<Task> getTasks(){
        return tasks;
    }
    
    public String getName(){
        return name;
    }
}
