/*
 * Molita Nuon
 * CS A170
 * February 09, 2017
 * 
 * Exercise #3
 */
import java.util.Scanner;
public class DayConverter
{
    public static void main(String[] args)
    {
        int num = 0;
        int hours = 0;
        int mins = 0;
        int sec = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number of days:");
        num = input.nextInt();
        
        hours = num * 24;
        mins = hours * 60;
        sec = mins * 60;
        
        System.out.print(num + " days is " + hours + " hours ");
        System.out.print("or " + mins + " minutes " );
        System.out.println("or " + sec + " seconds");
        
        
        
        
        
        
        
        
        
        
        
    }
}