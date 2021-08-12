/*
 * Molita Nuon 
 * CS A170 
 * February 27, 2017
 * 
 * Exercise #10
 */
import java.util.Scanner;
public class WhileLoops
{
    public static void main(String[] args)
    {
        int num_1 = 0,
            num_2 = 0,
            sum_1 = 0,
            sum_2 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        num_1 = input.nextInt(); 
        System.out.println("Enter another integer larger than the first one:");
        num_2  = input.nextInt();
        int y = num_1;
        System.out.print("Even numbers: ");

        while (num_1 <= num_2)
        {  
            if (num_1 % 2 == 0)

            {
                System.out.print(num_1 + " ");
                sum_1 += num_1;

            }
            num_1++;
        }

        System.out.println();
        System.out.println("Sum of even numbers = " + sum_1);
       
        System.out.print("Odd numbers: ");
        while (y <= num_2)
        {
            if (y % 2 == 1)
            {   
                System.out.print(y + " " );
                sum_2 += y;

            }
            y++;
        }

        System.out.println();
        System.out.println("Sum of odd numbers = " + sum_2);

    }

}

