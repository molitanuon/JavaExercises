/*
 * Molita Nuon 
 * CS A170 
 * February 27, 2017
 * 
 * Exercise #10
 */
import java.util.Scanner;
public class ForLoops
{
    public static void main(String[] args)
    {
        int sum_1 = 0,
            sum_2 = 0;

           
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num_1 = input.nextInt(); 
        System.out.println("Enter another integer larger than the first one:");
        int num_2  = input.nextInt();
        System.out.print("Even numbers: ");
        
        for (int a = num_1; a <= num_2; a++)
        {  
            if (a % 2 == 0)

            {
                System.out.print(a + " ");
                sum_1 += a;

            }
            
        }

        System.out.println();
        System.out.println("Sum of even numbers = " + sum_1);
       
        System.out.print("Odd numbers: ");
        for  (int a = num_1; a <= num_2; a++)
        {
            if (a % 2 == 1)
            {   
                System.out.print(a + " " );
                sum_2 += a;

            }
          
        }

        System.out.println();
        System.out.println("Sum of odd numbers = " + sum_2);

    }

}

