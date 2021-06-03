package com.project.Arrays;

import java.util.Arrays;

public class CopyArray {
    public static void copy(int[] array)
    {
        System.out.println("Main array : "+Arrays.toString(array));
        int n = array.length;
        int[] copy_array = new int[n];
        for(int i = 0; i < n; i++)
        {
            copy_array[i] = array[i];
        }
        System.out.println("Copied array is : "+ Arrays.toString(copy_array));
    }

    public static void main(String[] args)
    {
        int[] array = {1,2,9,8,4,5,7,6,0};
        copy(array);
    }
}
