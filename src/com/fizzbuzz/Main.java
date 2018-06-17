package com.fizzbuzz;

public class Main
{
    public static void main(String[] args)
    {
        fizzBuzz(100);
    }

    public static void fizzBuzz(int N)
    {
        for (int i = 1; i <= N; i++)
        {
            String output = "";
            if (i % 3 == 0)
            {
                output += "Fizz";
            }
            if (i % 5 == 0)
            {
                output += "Buzz";
            }
            if (i % 7 == 0)
            {
                output += "Woof";
            }
            if (output == "")
            {
                output = Integer.toString(i);
            }
            System.out.println(output);
        }
    }
}
