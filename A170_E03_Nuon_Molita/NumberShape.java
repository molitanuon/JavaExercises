/*
 * Molita Nuon 
 * CS A170
 * February 07, 2017
 * 
 * Exercise #3
 */
import java.util.Scanner;
public class NumberShape 
{
    public static void main(String[] args)
    {
        int number = 0; 
        int totalNum = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a single-digit number:"); 
        number = input.nextInt();
       
        totalNum = number * 11;
        
        System.out.println(totalNum + " " + number + " " + totalNum);
        System.out.println(" " + totalNum + " " + totalNum);
        System.out.println("  " + number + " " + number);
        System.out.println("   " + number);
        
        
        
        
        
        
        
    }
}
        