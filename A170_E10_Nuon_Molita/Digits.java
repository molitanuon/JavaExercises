/*
 * Molita Nuon 
 * CS A170 
 * February 27, 2017
 * 
 * Exercise #10
 */
import java.util.Scanner;
public class Digits
{
    public static void main(String[] args)
    {
        int number = 0,
            sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        number = input.nextInt(); 
        System.out.println("Number reversed:");
        while (number > 0)
        {
            System.out.print(number % 10);
            sum += number % 10;
            number /= 10;
        }
        System.out.println();
        System.out.println("Sum of digits: " + sum);
    }

}

