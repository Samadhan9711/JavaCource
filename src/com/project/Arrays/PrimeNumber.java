package com.project.Arrays;

import java.util.Scanner;

public class PrimeNumber {
    public static void Prime(int number)
    {
        if(number > 0 || number != 1)
        {
            int i;
            for(i=2; i <= number; i++)
            {
                if(number % i == 0)
                {
                    break;
                }
            }
            if(i != number)
            {
                System.out.println("Entered number is not prime number");
            }
            else
            {
                System.out.println("Entered number is prime number");
            }
        }
        else
        {
            System.out.println("Entered number is not prime number");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is prime or not : ");
        int number = input.nextInt();

        Prime(number);
    }
}
