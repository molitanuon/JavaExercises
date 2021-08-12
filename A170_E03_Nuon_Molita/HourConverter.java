/*
 * Molita Nuon
 * CS A170
 * February 09, 2017
 * 
 * Exercise #3
 */
import java.util.Scanner;
public class HourConverter
{
    public static void main(String[] args)
    {
        int hours = 0;
        int w1 = 0;
        int days = 0;
        int hrs =0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number of hours");
        hours = input.nextInt();
        
        w1 = hours/168;
        days = hours - (168 * w1);
        days = days/24;
        hrs = hours%24;
        
        System.out.print(hours + " hours is " + w1 + " weeks, ");
        System.out.print(+ days + " days, " + " and ");
        System.out.println(+ hrs + " hours ");
        
        
       
    }
}