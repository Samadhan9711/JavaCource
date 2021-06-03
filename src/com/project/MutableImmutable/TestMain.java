package com.project.MutableImmutable;

public class TestMain {
    public static void main(String[] args)
    {
        Address obj = new Address("Kolhapur","India",416212) ;
        //System.out.println(obj);

        ImmutableStudent s1 = new ImmutableStudent("Sam",1,obj);
        System.out.println("Before Modification: "+s1);

        obj.Country = "Rasia";
        obj.City = "Mumbai";
        //System.out.println(obj);

        s1.getName().concat("abs");
        s1.getAddress().Country = "Rasia";
        s1.getAddress().City = "Satara";
        s1.getAddress().Pin = 1234;

        System.out.println("----------------------------");

        System.out.println("After modification: "+s1);
    }
}
