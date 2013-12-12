package ee433;

/*
 * File: Item.java
 * Author: Kuni Scissum <kuni91@uab.edu
 * Assignment: P4 - EE433 Fall 2013
 * Vers: 1.0.0 12/11/2013 kjs - initial coding
 */


import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

/**
 *
 * @author Kuni Scissum <kuni91@uab.edu
 */
@DatabaseTable(tableName = "items")
public class Item {
    
    public final static String COLLECTION_ID_FIELD_NAME = "collection_id";
    
    @DatabaseField(generatedId=true)
    private int id;
    
    @DatabaseField(canBeNull = false)
    private String name;
    
    @DatabaseField(canBeNull = false, foreign=true, columnName = COLLECTION_ID_FIELD_NAME )
    private Collection collection;
    
    @DatabaseField(canBeNull = false)
    private String date;
    
    @DatabaseField(canBeNull=false)
    private String condition;
    
    @DatabaseField(canBeNull=false)
    private Boolean forSale;
    
    
    @DatabaseField(canBeNull = false)
    private String itemDesc;
    
    
    Item() {
        //
    }
    
    public Item(String itemDesc, Collection collection) {
        this.itemDesc = itemDesc;
        this.collection = collection;
    }
    public int getID(){
      return id;  
    }
    
    @Override
    public String toString() {
        return itemDesc;
    }   
}
