## Food Truck Rating Project

### Week 2 Homework Project

Created by Shaun Roach, student at Skill Distillery in Denver, Colorado. 

### Overview
This program allows a user to enter up to five "food trucks" (though it may be altered to allow more or less). The selection menu allows the user to continue adding trucks, to view an average rating of all trucks entered, to view the highest rated truck(s), or just view a list of all the trucks registered. Each truck is registered with a unique ID#, its name, its food type, and the user's rating.


### Technologies/Topics Used
The user application includes one main static method, and numerous non-static, "helper methods" to display menus, collect user input, and display the information respective to the menu selection. The application makes use of a separate Java "FoodTruck" Class, which includes multiple constructors for taking the food truck information inputted by the user and creating each truck object. After being constructed, each truck object holds private attributes that can only be accessed and modified through the use of public, non-static methods contained in the FoodTruck class, called getters and setters. The class also provides a toString method, which the user application utilizes to display information on each truck.  


### Lessons Learned

A major lesson I learned with this project is the difficulty with using multiple different Scanner methods within the same class. Using Scanner.nextInt() in conjunction with Scanner.next() and Scanner.nextLine(). It causes output to be displayed and lines to be executed in ways not intended. I mitigated this by using String data types in lieu of Integers where possible, so nextInt could be avoided.
