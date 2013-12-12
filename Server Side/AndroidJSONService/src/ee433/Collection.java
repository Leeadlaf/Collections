package ee433;

/*
 * File: Collection.java
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
 * @author Kuni Scissum <kuni91@uab.edu>
 */
@DatabaseTable(tableName = "collections")
public class Collection {
    
    public final static String COLLECTION_ID_FIELD_NAME = "item_id";
    
    @DatabaseField(generatedId=true)
    private int id;
    
    @DatabaseField(canBeNull = false)
    private String userName;
    
    @DatabaseField
    private int numOfItems;
    
    @ForeignCollectionField(eager = false)
    ForeignCollection<Item> items;
    
    
    Collection(){
        //
    }
    
    public Collection(String userName, int numOfItems){
        this.userName = userName;
        this.numOfItems = numOfItems;
    }
    
    public ForeignCollection<Item> getItems(){
        return items;
    }
    
    public String getName(){
        return userName;
    }
}
