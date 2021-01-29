------------------------------------------------------------------------
This is the project README file. 
A description of the Sugar Shop project.
------------------------------------------------------------------------

PROJECT TITLE: Sugar Shop

PURPOSE OF PROJECT: This project is just the beginning of an application made for a candy store that sells IceCream and Drinks.

DATE: May 17, 2020

AUTHOR: Amanda Barbieri


            DESCRIPTION OF EACH CLASS AND THEIR RELATIONSHIP:

* Drinks  - Drinks class holds information about drinks and each one has 3 characteristics:
 - name
 - size 
 - refill or not (when a drink is not selected as a refill, it is then selected as a bottle)

* IceCream - Ice cream class holds information about ice creams and each one has 3 characteristics:
 - name
 - size 
 - topping (when the topping is set true, it means that the ice cream will contain topping).

* Product - Product class is a parent class for IceCream and Drinks.
It's also an abstract class.
Child classes will use similar fields and methods that will be available in this class.
- The main method is available.

* Quality - This is a interface class that can be implemented into the product's child classes. 
  It contains a method which every connected class will have to apply.
 - Expiration date must to be set for each product

* ProductRecord - This class contains a collection of products of various types (drinks and ice creams).

* Client - This class will hold information about frequent shoppers from the Sugar Shop.
 - Frequent shoppers information are added into a HashMap
   Information includes the exclusive number for each client and the client full name
 - A file can be created
 - The client list can be added to the file

* ClientInformation - This class will provide information from an existent file
 - It reads the file info into an ArrayList
 - Sort and print the list alphabetically

* ShopPanel - This class create a Panel for the project Sugar Shop
  It contains:
 - label
 - Image Icon

* ShopFrame - This class create a basic Frame for the project Sugar Shop
 - An object of the ShopPanel is created.
 - It contains a JProgressBar
  

                        USER INSTRUCTIONS:
                        
1 - Run the main method in the ProductRecord class.
You will get a list of Drinks and Ice Creams available for purchase.

2 - In the Client class - Unit Test, select the Text Fixture to Object Bench
The following actions will happen:
- A file will be created and a message will be printed (if the file already exists, the print statement will let you know).
- The populated list with clients will be written to the file which was just created.
- The list of clients and their respective unique numbers will be printed.

3 - In the ClientInformation class - Unit Test, select the Text Fixture to Object Bench
The following actions will happen:
- A file reader will read the information previously added to the file.
- A list with this information will be printed
- A second list with the same information will be printed, however, this second list is sorted alphabetically

4 - Instantiate an object of the ShopFrame.
You will see a GUI where the user, in theory, would select which product they want to buy.
- A welcome label and a progress bar appear.


                LOCATION OF REQUIRED JAVA FEATURES:
                
A. Four classes with object class interaction - Drinks, Quality, IceCream, Product, ProductRecord
B. Inheritance - Product, IceCream, Drinks.
C. Abstract Class - Product
D. Interface - Quality
E. File input/output - Cliente, ClientInformation
F. HashMap or HashSet - Client
G. Selection Sort - ClientInformation
H. Test fixtures containing instantiated objects - Drinks, IceCream, Client, ClientInformation
I. Main method - ProductRecord
J. GUI component - ShopFrame, ShopPanel
    

                SOMETHING NEW:
                
JProgressBar is a part of Java Swing package. JProgressBar visually displays the progress of some specified task.
The progress bar fills up as the task reaches its completion. 

Import: import javax.swing.JProgressBar;

Declare: private JProgressBar pbar;

Instantiate: pbar = new JProgressBar();

add(pbar) - add the progress bar to the panel

                Methods used:
setValue (int) - set initial value of the bar
setStringPainted(boolean) - determine whether string should be displayed

        The Thread class and its method .sleep() are used inside the method that sets the progress bar:
Thread.sleep() method can be used to pause the execution of current thread for specified time in milliseconds.
(it belongs to the java.lang package so we do not need to import it)

References: 
https://www.geeksforgeeks.org/java-swing-jprogressbar/
https://docs.oracle.com/javase/tutorial/uiswing/components/progress.html
https://docs.oracle.com/javase/8/docs/api/javax/swing/JProgressBar.html
https://www.javatpoint.com/java-jprogressbar





