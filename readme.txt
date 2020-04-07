Notown music app that reads from mysql database through JDBC. This contains five files that makes a java GUI that reads, 
write, modifiy and deletes from the database through the gui. 

--------------------------------------
db.java files first access the mysql database through JDBC. Here is where all the methods for dealing with the database
lies. There are methods to count the total size of the table, search the tables for one entry,modifiy an entry, deletes an entry,
adds new entries.
--------------------------------------
dialog_window.java deals with the popup joptiondailog boxes that take information for the search, modifiy, and delete methods in
the db.java file and execute them in the notown_gui.java
---------------------------------------
hinttextfieldui.java is used in the notown_gui.java to add hint text to the add method in the main class
------------------------------------------
notown_gui.java is the base of the program holding the add method with jframe, jtable, and countless other gui fields in
the making of this app. this is where all methods lead to from add, close, search, login and so on. Most of all the instances
are stored here. There is also some user error measures in here as well.
-------------------------------------------
databaseexe.java is just the execute class