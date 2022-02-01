/*
Melody Duong
CS1400
Assignment 6
1 December 2021
*/
import java.util.Scanner;
/**
 * This class creates a program that calculates the sum of all integers
 * up to a specified integer.
 */
public class TaskB1 {
    public static void main(String[] args)
    {
        int number, total;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive number to sum: ");
        number = s.nextInt();
        s.close();

        total = sum(number);
        System.out.println(total);
    }
/**
 * The sum method takes in the number from the user and returns the sum using a 
 * simple recursive program.
 * @param input the integer argument passed from the main method
 * @return returns the sum of the integers
 */
    public static int sum(int input)
    {
        if (input == 1)
        {
            return 1;
        }
        else
        {
            return input + sum(input - 1);
        }
    }
}
