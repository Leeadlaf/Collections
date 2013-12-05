Collection$
===========

**Android Side**

*UAB EE433 - Team 2 - Android Phone App - Collection$*

### 11/15/2013  ~  LWA  ~  Notes:

*	Android Studio?  _unfinished product for creating applications.  Looks promising_
*	When creating a new package, the package name must **not** contain any CAPS.
*	Created small .jpg file to test Icon creation (collections icon1.jpg)
*	New Folder for testing android side - suggest we create multiple as we get into the process (Test Version 01)
*	Good Demo for creating a new Android App: <http://www.vogella.com/articles/Android/article.html>
*   **I suggest Everyone keep a running list, _in multimarkdown format_, of what they do each day they work on a part of development.  Either in the README document of the appropriate folder or another one added to the folder.**

### 11/19/2013  ~  KJS  ~  Notes:

*	Created Item.java
*	Created Collection.java
*	**Kuni (and everyone), please update this file about what you did / accomplished when committing to the _android side_.  Keeping these log files up-to-date will help us.**

### 11/20/2013  ~  LWA  ~  Notes:

*	For fun, I used 'Android Studio' to create a new application: _Collection$_ (Test Version 01)
	*	Ignored GIT errors within 'Android Studio' (since we're using GitHub for Windows)
	*	Annoying Problems / Errors - Too buggy to use?
*	After giving up on 'Android Studio' I used 'ADT' to create a new application: _Collection$_ (Test Version 02)
	*	Auto-generated package / files - main java/class file is: MainActivity.java - can be refactored
	*	'Hello World' working correctly (Using **Nexus S** as my virtual android device)
	*	Starting to work strictly on the interface (GUI) - based on our Mindmap / Lucid Chart Presentation - not messing with class files at all.  Creating global variables for inputs / buttons / etc...   In progress...

### 11/21/2013  ~  LWA  ~  Notes:

*	General screen Layout is created through .xml code.  When a new Activity (screen, basically) is created, a Java class file and corresponding .xml file are made.
*	Good tutorial for switching screens in android development: <http://www.androidhive.info/2011/08/how-to-switch-between-activities-in-android/>
*	Still working on making basic screens (but a couple are started - and working on an emulator - if anyone wants to take a look) - assigning ids to buttons / text fields.  the .xml editor inside eclipse allows for id refactoring and reference (it's very useful)

### 11/21/2013  ~  RDF  ~  Notes:

*	Finally able to load windows app for GITHUB on computer after assistance from team members.
*	Still experiencing problems running Eclipse for the android application on my computer.
*	While trying to solve Eclipse problem, I found firebase application to launch an android app.
*	Plan to watch youtube video on hello world android app and work on getting Eclipse to run, but on Tomcat software for server.

### 11/28/2013 ~ KJS ~ Notes:

*	Researching information on interfacing MySQL database with Android.
	*	Will need to use ORM
	* 	Until rest of details are clear, work on Android classes will be put on hold. (Need to know how to store object information, call it, etc.)
*	Installed Apache Tomcat 7.0.47 and currently working on setup.
*	Expect progress to be made over the course of the next few days.

### 12/01/2013  ~  LWA  ~  Notes:

*	Changing background color to black.  Add: android:background="@android:color/black" to the .xml layout file.  There must be a way to change all layouts at once.  New Theme?
	*	Themes are controlled in different places for different versions of Android.  _All_ versions must be in agreement for the proper one to show. see <http://stackoverflow.com/questions/18047560/android-eclipse-trouble-with-applying-themes>
	*	Finally got the **Holo** theme to work (dark background, light buttons)
*	Using my **HTC One** to test screens - _not_ the emulator (it is MUCH faster to debug using a real device vs the software emulator)
*	Still working on connectivity and more screens - starting to keep a running list of all variables (should help tie things together)

### 12/03/2013  ~  LWA  ~  Notes:

*	Each screen has its own .java file, .xml file, and must be entered into the AndroidManifest as an activity
*	Removed Default Menus from screens - Explore using menus to change setting? (instead of separate screens)
*	Figured out multiple  buttons on the same screen (I think - see _LoginActivity.java_ in 'Test Version 02')
	*	Using One _OnClickHandler_. See <http://stackoverflow.com/questions/3795439/one-onclickhandler-for-multiple-buttons>
*	Changing Button IDs to make more sense:  ie. *logOutButton* instead of *logOut*
*	Screens (ie. Home, New User, Collections, as well as the entire app) can be titled via the values/styles.xml file
*	Starting to add _TBD_ to top of files (technical debt).  Also adding code titles (version information, author, etc)
*	Slowly adding and linking more screens - I have no idea how to display or populate data (collections, items, etc...)
*	Created a list of suggested Technical Debt (in documentation folder)

### 12/03/2013  ~  KJS  ~  Notes:

*	Interacting with other apps: <http://developer.android.com/training/basics/intents/index.html>
*	Location, in case we get this far: <http://developer.android.com/training/building-userinfo.html>

### 12/04/2013  ~  LWA  ~  Notes:

*	Starting to keep a list of TBD in the base folder (collections) **Readme.md** file.  This is stuff already marked as _TBD_ in the code, not a full list of everything needed to be done.  Please add / delete as you see fit
*	Possibly useful Links:
	*	_Connect android device to PHP Script_: <http://m-zeeshanarif.blogspot.com/2013/05/android-connecting-to-server-mysql.html>
	*	_Building a Dynamic UI with Fragments_: <http://developer.android.com/training/basics/fragments/index.html>
*	Testing dynamically populated List View (via _Add Item_ button).  Code from: <http://androidexample.com/Dynamically_Create_View_Elements__-_Android_Example/index.php?view=article_discription&aid=115&aaid=137>

### Next Date...  ~  initials  ~  Notes:

*	Keep Calm and Carry On