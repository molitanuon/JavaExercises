/*
 * Molita Nuon
 * CS A170
 * February 16, 2017
 * 
 * Exercise #5
 */
import java.util.Scanner;
public class InOrder 
{
    public static void main(String[] args)
    {
        int num1 = 0,
            num2 = 0,
            num3 = 0;
            
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers, I'll sort them: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.print("The integers in sorted order are: ");
        
        if (num1 < num2)
            if(num2 < num3)
        System.out.println(num1 + " " + num2 + " " + num3);
        
        if (num1 < num2)
            if(num2 > num3)
                if (num3 > num1)
        System.out.println(num1 + " " + num3 + " " + num2);
       
       if (num1 > num2)
            if (num2 < num3)
                if (num3 > num1)
       System.out.println(num2 + " " + num1 + " " + num3);
        
       if (num1 < num2)
            if (num2 > num3)
                if (num3 < num1)
       System.out.println(num3 + " " + num1 + " "+ num2);
       
      if (num1 > num2)
        if (num2 < num3)
            if(num3 < num1)
      System.out.println(num2 + " " + num3 + " " + num1);
      
      if (num1 > num2)
        if (num2 > num3)
            if(num3 < num1)
      System.out.println( num3 + " " + num2 + " " + num1);
      
      if (num1 == num2)
            if (num2 == num3)
        System.out.println(num1 + " " + num2 + " " + num3);

     if (num1 == num2) 
        if (num2 < num3)
     System.out.println (num1 + " " + num2 + " " + num3);
     
     if(num1 == num3)
        if (num1 < num2)
     System.out.println(num1 + " " + num3 + " " + num2);
     
     if(num2 == num3)
        if(num1 > num2)
     System.out.println(num2 + " " + num3 + " " + num1);
     
     if (num1 == num2)
        if(num2 > num3)
     System.out.println(num3 + " " + num2 + " " + num1);
     
     if(num1 == num3)
        if(num1 > num2)
     System.out.println(num2 + " " + num1 + " " + num3);
     
     if (num2 == num3)
        if (num1 < num2)
     System.out.println(num1 + " " + num2 + " " + num3);
       
      
    }
}