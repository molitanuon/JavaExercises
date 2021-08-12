/*
 * Molita Nuon 
 * CS A170
 * February 22, 2017
 * 
 * Exercise #08
 */
import java.util.Scanner;
public class FitnessPlanner_3
{ public static final int Calories_Nugget = 47;
   public static void main(String[] args)
   
   {

       int weight = 0,
           min_1 = 0,
           min_2 = 0,
           speedW = 0,
           speedR = 0;
           
       char Walk = 'W',
            Run = 'R';
       double minWalk = 0,
              minRun = 0, 
              chicken = 0,
              cbr_1 = 0,
              cbr_2 = 0,
              totalCal = 0;
       Scanner input = new Scanner(System.in);
       System.out.println("*** This Fitness Planner program will calculate how long ***");
       System.out.println("*** you need to exercise to burn off what you just ate. ***");
       System.out.println();
       System.out.println("What is your weight in pounds?");
       weight = input.nextInt();
       System.out.println("Do you prefer walking or running (W or R)?");
       String type = input.next();  
      
        if(type.equalsIgnoreCase("W"))
        {System.out.println("What is your average WALKING speed in mph (3 is typical,a 20-min/mi pace)?");
            speedW =input.nextInt(); 
         System.out.println("How many minutes will you walk?");
            min_1 = input.nextInt();
            minWalk = 2.68224 * speedW + 3.5;
            cbr_1 = (2.268e-3) * minWalk * weight;
            chicken = (min_1 * cbr_1)/47;
            totalCal = cbr_1 * min_1;
            System.out.println("Congratulations, you are allowed to eat " + (int) chicken + "chicken nuggets."); 
            System.out.println("You will burn off " + (int) totalCal + "calories later.");
    
        }
        if(type.equalsIgnoreCase("R"))
        {System.out.println("What is your average RUNNING speed in mph (6 is typical, a 10-min/mi)?");
            speedR = input.nextInt();
         System.out.println("How many minutes will you run?");
            min_2 = input.nextInt();
            minRun =5.36448 * speedR + 3.5;
            cbr_2 = (2.268e-3) * minRun * weight;
            chicken = (min_2 * cbr_2) / 47;
            totalCal = cbr_2 * min_2;
            System.out.println("Congratulations, you are allowed to eat " + (int) chicken + " chicken nuggets.");
            System.out.println("You will off " + (int) totalCal + " calories later.");
        }
      
     
        
    
       
       
       
       
       
    }
}