package com.project.Arrays;

import java.util.Arrays;

public class AscendingSorting {
    public static void sort(int a[])
    {
        int n = a.length;
        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(a[j]<a[i])
                {
                    int s = a[j];
                    a[j] = a[i];
                    a[i] = s;
                }
            }
        }
        System.out.println("Sorted array is : "+ Arrays.toString(a));
    }

    public static void main(String[] args)
    {
        int[] array = {1,4,8,5,2,0,6,7,3};
        sort(array);
    }
}
