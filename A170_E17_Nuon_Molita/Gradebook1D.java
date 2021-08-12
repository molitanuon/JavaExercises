
/*
 * Molita Nuon
 * March 22, 2017
 * CS A170
 * 
 * Exercise #17
 */
import java.util.Scanner;
public class Gradebook1D
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many students in the class? ");
        int students = input.nextInt();
        int [] ids = new int [students];
        double [] quiz_1 = new double [students];
        double [] quiz_2 = new double [students];
        double [] quiz_3 = new double [students];
        
        for (int i = 0; i < ids.length; i++)
        {
            System.out.print("Enter student ID: ");
            ids[i] = input.nextInt();
            
            System.out.print("Enter score for Quiz 1: ");
            quiz_1[i] = input.nextInt();
            
            System.out.print("Enter score for Quiz 2: ");
            quiz_2[i] = input.nextInt();
           
            System.out.print("Enter score for Quiz 3: ");
            quiz_3[i] = input.nextInt();
            
            
            
        }
        System.out.println();
        double grade = 0;
        double average = 0;
        for (int i = 0; i < ids.length; i++)
        { 
            grade = (quiz_1[i] + quiz_2[i] + quiz_3[i])/3; 
            average += grade;
            System.out.printf("ID " + ids[i] + " - Final grade: %.2f",grade);
            System.out.println();
        }
        average /= students;
        System.out.printf("Class average: %.2f ", average);
        System.out.println();
    }
}
