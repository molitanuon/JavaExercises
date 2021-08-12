/*
 * Molita Nuon
 * CS A170
 * March 20, 2017
 * 
 * Exercise #15
 */
import java.util.Scanner;
public class ArrayRange
{
    public static void main(String[] args)
    {
           
       Scanner input = new Scanner(System.in);
       System.out.print("How many integers will you enter? ");
       int a = input.nextInt();
       int [] b = new int [a];
       System.out.print("Enter " + a + " integers: ");
       for (int i = 0; i < b.length; i++) 
			{
			    b[i] = input.nextInt();
			   
			 }   
	   
       System.out.print("You entered: ");
       for (int i = 0; i < b.length; i++) 
			{
			    
			    System.out.print(b[i] + " ");
			 } 
       System.out.println();
       int lowest = b[0];
       for (int i = 0; i < b.length; i++) 
			{
			    if (b[i] < lowest)
			         lowest = b[i];
			 } 
       System.out.println("Min: " + lowest);
       int highest = b[0];
       for (int i = 0; i < b.length; i++) 
			{
			    if (b[i] > highest)
			         highest = b[i];
			 } 
       System.out.println("Max: " + highest);
       System.out.println("Range: " + (highest - lowest));
    }
}
