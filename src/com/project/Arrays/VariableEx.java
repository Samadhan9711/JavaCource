package com.project.Arrays;

public class VariableEx {
    int i ; // Instance variable ---
    static int j=20; // Static variable --- First 20 is the fixed value for all object

    public static void main(String[] args)
    {
        int x, y = 100 ; // Local variable
        VariableEx e1 = new VariableEx(); // e1 is the Object of a class
        e1.i = 10;
        System.out.println("Static variable before changing it's value : "+e1.j); // here j = 20
        e1.j = 50; // After modifying the value of static variable, now 50 is the fixed value for all object ie j=50
        VariableEx e2 = new VariableEx(); // e2 is the Object of a class
        System.out.println("Instance variable : "+e1.i); // We can only access the instance variable with the object of class
        System.out.println("Instance variable ofsecond obj which has not assigned value : "+e2.i); // If we not assign any value to instance variable, then JVM will always provide default value is 0
        System.out.println("Static variable with class name after changing it's value : "+VariableEx.j); // we can access that variable with the help of class name or object of a class
        // System.out.println(x); --- It is a local variable & we have to not assign any value to that variable, so it will gives us compile time error
        //                        --- It is compulsory that assign the value to the local variable.

        System.out.println("Local variable : "+y);
    }
}
