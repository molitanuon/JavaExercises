
/**
 * Molita Nuon 
 * CS A170
 * March 15, 2017
 * 
 * Exercise #15
 */
import java.util.Scanner;
public class Passwords
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner (System.in);
        String [] usernames = {"emma","jacky","nick","mick","kitty"};
        String [] passwords = {"1234","2343","7689","0000","9898"};

        System.out.println("Enter a name.");
        String name = input.next();
        System.out.println("Enter a password.");
        String pass = input.next();

        boolean found = false;
        int u = 0;
        int sum = 0;
        while (!found && u < usernames.length)
            if(name.equals(usernames[u]))
            {
                found = true;
            }
            else 
            {
                u++;
            }

        if (found && pass.equals(passwords[u]))
        { 
            System.out.println("Access granted!");

        }
        else 
        {
            System.out.println("Enter a name.");
            name = input.next();
            System.out.println("Enter a password.");
            pass = input.next();
           
            sum++;
        } 
        
        if (sum == 1)

        {   int x = 0;
            while (!found && x < usernames.length)
                if(name.equals(usernames[x]))
                {
                    found = true;
                }
                else 
                {
                    x++;
                }

            if (found && passwords[x].equals(pass))   
            { 
                System.out.println("Access granted!");

            }
            else
            {
                System.out.println("Sorry, your username/password does not match our database.");
                System.out.println("Contact the administrator.");
            }
        }
    }
}