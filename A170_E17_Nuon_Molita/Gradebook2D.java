
/*
 * Molita Nuon
 * March 22, 2017
 * CS A170
 * 
 * Exercise #17
 */
import java.util.Scanner;
public class Gradebook2D
{
    public static final int QUIZZES = 3;
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many students in the class? ");
        int students = input.nextInt();
        int [] ids = new int [students];
        double [][] grades = new double [students][QUIZZES];

        for (int i = 0; i < ids.length; i++)
        {
            System.out.print("Enter student ID: ");
            ids[i] = input.nextInt();
            int a = 1;

            for (int j = 0; j < QUIZZES; j++)
            {
                System.out.print("Enter score for Quiz " + a + ": ");
                grades[i][j]= input.nextInt();
                a++;
            }

        }
        System.out.println();
        double grade = 0;
        double average = 0;
        for (int i = 0; i < ids.length; i++)
        {   
            for (int j = 0; j < QUIZZES; j++)
            {
                grade += (grades[i][j]); 
                
            }
            grade /= QUIZZES;
            average += grade;
            
            System.out.printf("ID "+ ids[i] + " - Final grade: %.2f", grade);
            grade = 0;
            System.out.println();
        }
        
        average /= students;
        System.out.printf("Class average: %.2f ", average);
        System.out.println();
    }
}

