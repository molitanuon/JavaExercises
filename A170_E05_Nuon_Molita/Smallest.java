/*
 * Molita Nuon
 * CS A170
 * February 16, 2017
 * 
 * Exercise #5
 */
import java.util.Scanner;
public class Smallest 
{
    public static void main(String[] args)
    {
        int num1 = 0,
            num2 = 0,
            num3 = 0,
            d = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers, I'll find the smalllest:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        
        if (num1 <= num2)
            if (num1 <= num3)
                d = num1;
        if (num2 <= num1)
            if (num2 <= num3)
                d = num2;
        if (num3 <= num1)
            if (num3 <= num1)
            d = num3;
        
        System.out.println("The smallest is: " + d);
        
        
        
        
        
        
        
        
        
        
    }
}