package com.project.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageUsingArray {
    static void Average()
    {

        Scanner input1 = new Scanner(System.in);
        System.out.println("How many numbers of average you want's to calculate ");
        int number = input1.nextInt();
        int[] array = new int[number];

        System.out.println("Enter "+number+" numbers one after one ");
        for(int i=1; i<=number;i++)
        {
            Scanner input = new Scanner(System.in);
            int number2 = input.nextInt();
            array[i-1] = number2;
        }

        int sum = 0;
        for(int a=0;a<number;a++)
        {
            sum = sum + array[a];
        }
        float avg = sum/number;
        System.out.println("Your array is "+ Arrays.toString(array)); //
        System.out.println("Average of your array is : "+avg);
    }

    public static void main(String[] args)
    {
        Average();
    }
}
