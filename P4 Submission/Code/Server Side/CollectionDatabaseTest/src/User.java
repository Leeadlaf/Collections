/*
 * File: User.java
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
 * @author Kuni Scissum
 */
@DatabaseTable(tableName = "users")
public class User {
    
    @DatabaseField(generatedId=true)
    private int id;
    
    @DatabaseField(canBeNull = false)
    private String lastName;
    
    @DatabaseField(canBeNull = false)
    private String firstName;
    
    @ForeignCollectionField(eager = false)
    ForeignCollection<Task> tasks;
    
    
    User() {
        //
    }
    
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //this.blazerID = blazerID;
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
    public String getName() {
        return firstName + " " + lastName;
    }
    
}
