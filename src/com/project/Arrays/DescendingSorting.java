package com.project.Arrays;

import java.util.Arrays;

public class DescendingSorting {
    public static void sort_descending(int[] a)
    {
        int n = a.length;
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(a[i]<a[j])
                {
                    int s = a[i];
                    a[i] = a[j];
                    a[j] = s;
                }
            }
        }
        System.out.println("Descending order sorted array is : "+ Arrays.toString(a));
    }

    public static void main(String[] args)
    {
        int[] array = {1,2,3,9,5,7,0};
        sort_descending(array);
    }
}
