Collection$
===========

UAB EE433 - Team 2 - Android Phone App - Collection$

### Technical Debt: _(ie. stuff we will not have in Version 1)_

_This is a list of technical debt from code already written within **Test Version 02**_

*	Not Using Tabs
*	No thumbnails on collection list
*	No thumbnails on item list
*	static collection information
	*	{~~No connection to database thru android app~>.~~} **connection solved - _12/14/13_**
*	no adding new items
*	no editing new items

### TBD: _(ie. stuff we need to address)_

_This is a list of **specific TBD** from code already written within **Test Version 02**_

##### HomeScreen.java

*	Fix Add Item Link (build add item)
*	Fix Networking Link (build networking)
*	Add code to 'really' log off the user

##### Login.java

*	Check to see if the user / password is in the database
*	check validity of user input

##### CreateNewUser.java

*	Check database for existing user
*	Check validity of inputs
*	Email client

##### viewCollections.java

*	populate with 'real' database information

##### ViewYourCollectionList.java

*	should poll / pull users collection information from the database
*	number of Items in a collection?

##### ViewOtherCollectionList.java

*	should poll / pull users collection information from the database
*	add other collections?
*	create arraylist of collections shared with current user

##### Item.java

*	test the editable variable by testing the set methods with editable==True and editable == False

##### Collection.java 

*	edit code to match current UML Class diagram

##### ViewItem.java

*	Add Research Button
*	Add Remove Functionality
*	Add Thumbnails
*	Add Edit Functionality

##### AddItem.java

*	write code / design screen to do add item