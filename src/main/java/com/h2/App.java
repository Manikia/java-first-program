package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return number * 2;
    }

    private static int add(int[] numbers)
    {
        int sum;
        //add all of numbers array to total named sum
        for(sum = 0; sum < numbers.length; sum++)
        {
            sum = sum + numbers[sum];
        }
        return sum;
    }
}
