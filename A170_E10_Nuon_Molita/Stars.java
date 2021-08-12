/*
 * Molita Nuon 
 * CS A170 
 * February 27, 2017
 * 
 * Exercise #10
 */
import java.util.Scanner;
public class Stars
{
    public static void main(String[] args)
    {
        int num_1 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 3 to 10: ");
        num_1 = input.nextInt(); 
        System.out.println();
        for (int i = num_1; i >= 1; i--)
        {   
            for (int a = 1; a <=i; a++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

