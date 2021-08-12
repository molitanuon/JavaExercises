/*
 * Molita Nuon 
 * CS A170
 * February 07, 2017
 * 
 * Exercise #3
 */
import java.util.Scanner;
public class MathSkills
{
    public static void main(String[] args)
    {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int totalNum1 = 0;
        int totalNum2 = 0;
        int totalNum3 = 0;
        int totalNum4 = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter THREE numbers and I will show you my math skill:"); 
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        
       totalNum1 = num1 + num2 - num3;
       totalNum2 = num1 - num2 * num3;
       totalNum3 = (num1 - num2) * num3;
       totalNum4 = num1 * num1;
       
        System.out.println("Check this out:");
        System.out.print( num1 + " + ");
        System.out.print( num2 + " - " +  num3 + " = "); 
        System.out.println(totalNum1);
        
        System.out.print( num1 + " - ");
        System.out.print( num2 + " * " +  num3 + " = "); 
        System.out.println(totalNum2);
       
        System.out.print("(" + num1 + " - ");
        System.out.print( num2 + " )" + " * " +  num3 + " = "); 
        System.out.println(totalNum3);
        
        System.out.println( num1 + " squared is " + totalNum4);
        
        

    }
}
        