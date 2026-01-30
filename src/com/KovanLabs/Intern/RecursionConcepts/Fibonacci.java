package com.KovanLabs.Intern.RecursionConcepts;
import java.util.*;
public class Fibonacci {
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        memo = new int[num+1];
        Arrays.fill(memo,-1);
        int result = fibonacci(num);
        System.out.println("The Nth fibonacci number of "+num+" is : "+result);
    }
    static int[] memo;
    static int fibonacci(int num)
    {
        if(num <= 1)
        {
            return num;
        }
        if(memo[num] != -1)
        {
            return memo[num];
        }

      memo[num] = fibonacci(num-1)+fibonacci(num-2);
        return memo[num];
    }
}
