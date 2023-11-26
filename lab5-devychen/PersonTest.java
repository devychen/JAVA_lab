/** 
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 04
 * Author:      Yifei Chen
 * Description: JUnit test for Class Person.
 *
 * Honour Code:  I pledge that this program represents my own work.
 *  I received help from no one in designing and debugging my program.
 */


import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A JUnit test case class. Every method starting with the word "test" will be
 * called when running the test with JUnit.
 */
public class PersonTest {

    /**
     * Tests for for the same age (Expect true)
     */
    @Test
    public void testSameAge1() {
        Person testPerson = new Person();
        testPerson.set("Jim Knopf", 12);
        Person testPerson2 = new Person();
        testPerson2.set("Jim Knopf", 12);
        assertTrue(testPerson.isSameAge(testPerson2));
    }

    /**
     * Tests for for the same age (Expect false)
     */
    @Test
    public void testSameAge2() {
        Person testPerson = new Person();
        testPerson.set("Jim Knopf", 12);
        Person testPerson2 = new Person();
        testPerson2.set("Lukas Lokomotivfuehrer", 38);
        assertFalse(testPerson.isSameAge(testPerson2));
    }

    /**
     * Tests for the same name (Expect true)
     */
    @Test
    public void testSameName1() {
        Person testPerson = new Person();
        testPerson.set("Jim Knopf", 12);
        Person testPerson2 = new Person();
        testPerson2.set("Jim Knopf", 38);
        assertTrue(testPerson.isSameName(testPerson2));
    }

   /**
     * Tests for the same name (Expect false)
     */
    @Test
    public void testSameName2() {
        Person testPerson = new Person();
        testPerson.set("Jim Knopf", 12);
        Person testPerson2 = new Person();
        testPerson2.set("Lukas Lokomotivfuehrer", 12);
        assertFalse(testPerson.isSameName(testPerson2));
    }

    /**
     * Tests for older age (Expect true)
     */
    @Test
    public void testIsOlderThan1() {
        Person testPerson = new Person();
        testPerson.set("Lukas Lokomotivfuehrer", 38);
        Person testPerson2 = new Person();
        testPerson2.set("Jim Knopf", 12);
        assertTrue(testPerson.isOlderThan(testPerson2));
    }

    /**
     * Tests for older age (Expect false)
     */
    @Test
    public void testIsOlderThan2() {
        Person testPerson = new Person();
        testPerson.set("Jim Knopf", 12);
        Person testPerson2 = new Person();
        testPerson2.set("Lukas Lokomotivfuehrer", 38);
        assertFalse(testPerson.isOlderThan(testPerson2));
    }

    /**
     * Tests for younger age (Expect true)
     */
    @Test
    public void testIsYoungerThan1() {
        Person testPerson = new Person();
        testPerson.set("Jim Knopf", 12);
        Person testPerson2 = new Person();
        testPerson2.set("Lukas Lokomotivfuehrer", 38);
        assertTrue(testPerson.isYoungerThan(testPerson2));
    }

    /**
     * Tests for younger age (Expect false)
     */
    @Test
    public void testIsYoungerThan2() {
        Person testPerson = new Person();
        testPerson.set("Lukas Lokomotivfuehrer", 38);
        Person testPerson2 = new Person();
        testPerson2.set("Jim Knopf", 12);
        assertFalse(testPerson.isYoungerThan(testPerson2));
    }

}
