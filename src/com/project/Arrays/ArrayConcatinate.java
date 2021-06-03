package com.project.Arrays;

import java.util.Arrays;

public class ArrayConcatinate {

        public static void concatinate(int[] array1, int[] array2)
        {
            int len1 = array1.length;
            int len2 = array2.length;
            int n = len1+len2;
            int[] new_array = new int[n];
            for(int i = 0; i<n; i++)
            {
                if(i<len1)
                {
                    new_array[i] = array1[i];
                }
                else
                {
                    new_array[i] = array2[i-len1];
                }
            }
            System.out.println("Concatinated array is : "+ Arrays.toString(new_array));
        }

        public static void main(String[] args)
        {
            int[] array1 = {1,2,3,4,5,6};
            int[] array2 = {7,8,9};
            concatinate(array1,array2);
        }


}
