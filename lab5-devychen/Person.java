/** 
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 05
 * Author:      Yifei Chen
 * Description: Class Person add methods.
 *
 * Honour Code:  I pledge that this program represents my own work.
 *  I received help from no one in designing and debugging my program.
 */

/**
 * 
 File name: Person.java
 
 Class for a Person.
 
 Preconditions:
 For set methods: the person has been created.
 For test methods: the persons have been created and have
 values for name and age.
 
 Postconditions:
 Set methods: one or both attributes is assigned a value.
 Test methods: true or false is returned.
 
 Based on: Self-Test Question #13 in Chapter 4 (pp. 289-90).
 */

import java.util.*;

public class Person
{
    private String name;
    private int age;
    
    /**
     * Initializes a Person. Reads name and age of a person 
     * from System.in. 
     */
    public void readInput()
    {
        // Create a scanner to ...
        Scanner keyboard = new Scanner(System.in);
        
        // read name...
        System.out.println("What is the person's name?");
        name = keyboard.nextLine();
        
        // and age from System.in
        System.out.println("What is the person's age?");
        age = keyboard.nextInt();
        while (age < 0)
        {
            // Make sure that age is not negative!!!
            System.out.println("Age cannot be negative.");
            System.out.println("Reenter age:");
            age = keyboard.nextInt();
        }
        keyboard.close();
    }
    
    /**
     * Print a description of this Person to System.out
     */
    public void writeOutput()
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
    
    /**
     * Initializes this Person with name <i>newName</i> and age
     * <i>newAge</i>
     * @param newName - new name of this Person
     * @param newAge  - new age of this Person
     */
    public void set(String newName, int newAge)
    {
        setName(newName);  //Set name..
        setAge(newAge);    // and age         
    }
    
    /**
     * Sets the name of this Person to <i>newName</i>
     * @param newName - new name of this Person
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * Sets the new age of this Person
     * @param newAge  - new age of this Person
     */
    public void setAge(int newAge)
    {
        if (newAge >= 0)
            age = newAge;
        else
        {
            System.out.println("ERROR: Used a negative age.");
            System.exit(0);
        }
    }
    
    /**
     * Returns the name of this Person
     * @return The name of this Person
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the age of this Person
     * @return The age of this Person
     */
    public int getAge()
    {
        return age;
    }

    /** 
     * Test whether two persons have the same name and age.
     * @param anotherPerson - the person to compare with
     * @return true if the persons have the same name and age, false otherwise
    */
    public boolean equals (Person anotherPerson){
        return this.name.equals(anotherPerson.getName()) && this.age == anotherPerson.getAge();
    }

    /**
     * Test, two persons have the same name. Case insensitive.
     * @param anotherPerson - the person to compare with
     * @return true if the persons have the same name, false otherwise
     */
    public boolean isSameName (Person anotherPerson){
        return this.name.equalsIgnoreCase(anotherPerson.getName());
    }

    /**
     * Test whether two persons are of the same age
     * @param anotherPerson - the person to compare with
     * @return true if the persons have the same age, false otherwise
     */
    public boolean isSameAge (Person anotherPersion){
        return this.age == anotherPersion.getAge();
    }

    /**
     * Test whether the instance is older than anotherPerson
     * @param anotherPerson - the person to compare with
     * @return true if the persons is older, false otherwise
     */
    public boolean isOlderThan (Person anotherPerson){
        return this.age > anotherPerson.getAge();
    }

    /**
     * Test whether the instance is younger than anotherPerson
     * @param anotherPerson - the person to compare with
     * @return true if the person is younger, false otherwise
     */
    public boolean isYoungerThan (Person anotherPerson){
        return this.age < anotherPerson.getAge();
    }

}

