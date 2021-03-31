/*
 * Today in class you will be writing a program with your team on how to
 *  do input and output in Java.  That is the last part of the activity 
 * that you will do for CW4 and thus the Recorder will upload the notes 
 * by Friday midnight.
 *
 *
 * After class and for Monday, you will ask the user how many people they 
 * would like to enter into a database and prompt them to enter their first
 * name and last name and age for the number of persons that they want to 
 * enter into the database. 
 *
 * Using exceptions, ensure that the name is all letters and the age is 
 * an int using  methods from the String Character and Integer classes. 
 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html 
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html 
 *
 *
 * For this homework, be sure to use Exceptions, Inheritance, Overriding and
 * instance methods versus class methods.
 *
 * The data will be stored in the array.  The format of the name should 
 * be Lastname, Firstname and should be created using a StringBuffer 
 * https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html.
 *
 * Then you will ask the user if they would like to print the array and 
 * if so, the program should print each element of the array by calling 
 * a static method printList(Object []) that takes an array of type 
 * java.lang.Object and prints each Object using the overridden toString() 
 * method of the object's.
 *
 * The Recorder will turn in CW4 notes on Friday, March 12, 2021 in Moodle.
 *
 * The Spokesperson will turn in the Person.java and PersonTest.java agreed
 *  to on Friday, March 12, 2021 in Moodle from the class on Monday,
 *  March 8, 2021.  
 * Each individual will turn in HW2 on Wednesday, Monday, March 22, 2021
 * in Moodle.  
 * This means if you are a Recorder in CW4, you will turn in your Java 
 * files  plus your CW4 notes and if you are a Spokesperson in CW4, 
 * you will turn in your group's Person.java and PersonTest.java 
 * plus your own Java files. Everyone else will turn in their Java files. 
 */


package com.company;
import java.util.Scanner;

public class GetInputData {
    public static void main(String args[])
    {
        // This is for the string name
        String str = null;
        boolean debug = false;
        boolean x = true;
        Scanner in = new Scanner(System.in);
             

        try{
            System.out.println("\tWhats your name?: ");
            str = in.nextLine();
            NoInt(str);
            System.out.println("\n\n\tHello " + str + "whats your age?");
            int age = in.nextInt();
            System.out.println("Your age is"+str);
        }
        catch(NoIntInString ex){
             System.out.println(ex.getMessage());
            }
                

            }
         public static void NoInt(Stirng str) throws NoIntInString{
            for(int i=0; i < str.length(); i++) {
            Boolean flag = Character.isLetter(str.charAt(i));
            if(flag) {
                throw new NoIntInString("Name contains numbers, please try agiain");        
        }

    }
}
}
