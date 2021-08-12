
/*
 * Molita Nuon
 * CS A170
 * March 13, 2017
 * 
 * Exercise #13
 */

public class MyArray_DE
{
    public static void main(String[] args)
    {
        //int [] a = {10,20,30,40,50};
        //int [] a = {300, 38, 27, 46, 81, 72, 56, 61, 20, 48, 76, 91, 57, 35, 78};
        // int [] a = {45, 38, 27, 46, 81, 72, 56, 61, 20, 48, 76, 91, 57, 35, 800};
        // int [] a = {100};
        int [] a = {78, 35, 57, 91, 76, 48, 20, 61, 56, 72, 81, 46, 27, 38,45};
        int maxValue = a[0]; 
        int maxIndex = 0;
        int sum = 0;
        for (int idx = 0; idx < a.length; idx++)
        {
            if (a[idx] > maxValue)
            {
                maxValue = a[idx];
                maxIndex = idx;

            }
            if (a[idx] % 2 == 0)
            {
                sum += a[idx];
            }
        }
        System.out.println("The largest element is " + maxValue + ".");
        System.out.println("The largest element is at index " + maxIndex + ".");
        System.out.println("The largest element is at index " + sum + ".");
        
        for ( int idx = a.length - 1; idx >= 0; idx--)
        {
            System.out.print(a[idx] + " ");
        }
        System.out.println();
    }

}