package ee433;

/*
 * File: User.java
 * Author: Kuni Scissum <kuni91@uab.edu
 * Assignment: HW3 - EE433 Fall 2013
 * Vers: 1.0.0 12/11/2013 kjs - initial coding
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
    private String userName;
    
    @DatabaseField(canBeNull = false)
    private String password;
    
    
    
    
    User() {
        //
    }
    
    public User(String userName, String password){
        this.password = password;
        this.userName = userName;
        //this.blazerID = blazerID;
    }
    
    @Override
    public String toString() {
        return password + " " + userName;
    }
    
    public String getName() {
        return password + " " + userName;
    }
    
}
