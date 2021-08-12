/*
 * Molita Nuon 
 * CS A170
 * February 22, 2017
 * 
 * Exercise #08
 */
import java.util.Scanner;
public class FitnessPlanner_1
{ public static final int Calories_Nugget = 47;
   public static void main(String[] args)
   
   {

       int weight = 0,
           chicken = 0,
           speedW = 0,
           speedR = 0,
           totalCal = 0;

       double minWalk = 0,
              minRun = 0,
              cbr_1 = 0,
              cbr_2 = 0,
              totalMin_1 = 0,
              totalMin_2 = 0;
           
       Scanner input = new Scanner(System.in);
       System.out.println("*** This Fitness Planner program will calculate how long ***");
       System.out.println("*** you need to exercise to burn off what you just ate. ***");
       System.out.println();
       System.out.println("What is your weight in pounds?");
       weight = input.nextInt();
       System.out.println("How many chicken nuggets did you eat?");
       chicken = input.nextInt();
       System.out.println("What is your average WALKING speed in mph (3 is typical, a 20-min/mi pace)?");
       speedW = input.nextInt();
       System.out.println("What is your average RUNNING speed in mph (6 is typical, a 10-min/mi pace)?");
       speedR = input.nextInt();
       
       totalCal = Calories_Nugget * chicken; 
       
       minWalk = 2.68224 * speedW + 3.5;
       cbr_1 = (2.268e-3) * minWalk * weight;
       totalMin_1 = totalCal/cbr_1;
       
       System.out.println("You need to walk for " + (int) totalMin_1 + " minutes to burn off the " + chicken + " chicken nuggets you ate."); 
       
       minRun = 5.36448 * speedR + 3.5;
       cbr_2 = (2.268e-3) * minRun * weight;
       totalMin_2 = totalCal/cbr_2;
       
       System.out.println("You need to run for " + (int) totalMin_2 + " minutes to burn off the " + chicken + " chicken nuggets you ate.");
       
       
       
       
       
    }
}
