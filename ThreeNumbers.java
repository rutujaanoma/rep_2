//package com.cdac.acts;

import java.util.Scanner;

public class ThreeNumbers
{
    public static void main(String [] args)
    {
        Scanner  sc = new Scanner(System.in);

        int a, b, c, min, max, sum=0;

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if (a>b)
        {
            if (a>c)
            {
                max = a;
                //System.out.print("Maximum: " +max);
            }
            else
            {
            max = c ;
            //System.out.print("Maximum: " +max);
            }
        }
        else
        {
            if (b>c)
            {
                max = b;
               // System.out.print("Maximum: " +max);
            }
            else
            {
                max = c;
               // System.out.print("Maximum: " +max);
            }
        }
        System.out.println("Maximum: " +max);


        if (a<b)
        {
            if (a<c)
            {
                min = a;
           
            }
            else
            {
            min = c ;
            //System.out.print("Maximum: " +max);
            }
        }
        else
        {
            if (b<c)
            {
                min = b;
               // System.out.print("Maximum: " +max);
            }
            else
            {
                min = c;
               // System.out.print("Maximum: " +max);
            }
        }
        System.out.println("Minimum: " +min);

        sum = max + min;
        System.out.println("Sum of maximum and mininum: " +sum);
    }
    
}