package com.project.Arrays;

public class LargestElementInArray {
    static void Largest(int[] array)
    {
        int a = array[0];
        for(int i = 0; i < array.length; i++)
        {
            int j = i;
            if(array[j]>a)
            {
                a = array[j];
            }
        }
        System.out.println("Largest element in an array is "+a);
    }
    public static void main(String[] args)
    {
        int[] x = {2,5,3,8,5,6,1};
        Largest(x);
    }
}
