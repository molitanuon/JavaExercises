/*
 * Molita Nuon
 * CS A170
 * February 16, 2017
 * 
 * Exercise #5
 */
import java.util.Scanner;
public class Months
{
    public static void main(String[] args)
    {
        int num1 = 0,
            days = 0;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a month as an iteger (1-12) : ");
       num1 = input.nextInt();
       
      
       if (num1 == 1)
            days = 31;
       if (num1 == 2)
            days = 28;
       if (num1 == 3)
            days = 31;
       if (num1 == 4)
            days = 30;
       if (num1 == 5)
            days = 31;
       if (num1 == 6)
            days = 30;
       if (num1 == 7)
            days = 31;
       if (num1 == 8)
            days = 31;
       if (num1 == 9)
            days = 30;
       if (num1 == 10)
            days = 31;
       if (num1 == 11)
            days = 30;
       if (num1 == 12) 
            days = 31;
        
       System.out.println( days + " days ");
        
        
        
    }
}