package com.project;

import java.util.Scanner;

public class FibonacciSeries {
    public static void Fibonacci(int term)
    {
        if(term > 0)
        {
            int s = 1;
            int a = 0;
            for(int i = 1; i<=term; i++)
            {
                int b = a + s;
                System.out.print(s+" ");
                a = s;
                s = b;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms you want's to display : ");
        int term = input.nextInt();
        Fibonacci(term);
    }
}
