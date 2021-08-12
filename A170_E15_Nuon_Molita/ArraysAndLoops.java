/**
 * Molita Nuon
 * CS A170
 * March 15, 2017
 * 
 * Exercise #15
 */

public class ArraysAndLoops
{
    public static void main(String[] args)
    {
        //1. Declare an array arr1 and initialize it to 1, 2, 3, 4, 5, 6, 7, 8, and 9
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        
        //2. Declare another array arr2, the same length as arr1, without giving it any initial values.
        int[] arr2 = new int [arr1.length];
        
        //3. Using a for loop print arr1 displaying all elements on one line, separated by a comma.
        System.out.print("Array 1: ");
        for (int x = 0; x < arr1.length-1; x++) 
        {
            System.out.print(arr1[x] + ",");       
           
        }
        System.out.println(arr1[arr1.length-1]);
        //4. Using a while loop print arr2 displaying all elements on one line, separated by a dash.
        int i = 0;
        System.out.print("Array 2: ");
        while (i < arr2.length -1)
        {
            System.out.print(arr2[i]+ "-");
            i++;
            
        }
        System.out.println(arr2[arr2.length-1]);
        //5. Using a for loop, copy all the values of arr1 into arr2 in reverse order. 
        int a = 0;
        for (int x = arr1.length - 1; x >= 0; x--)
        {
            arr2[a] = arr1[x];
            a++;
        }
        
        //6. Using a do/while loop, print arr1 displaying all elements on one line, separated by a comma.
        int y = 0;
        System.out.print("Array 1: ");
        do 
        {
            System.out.print(arr1[y] + ",");
            y++;
        } while (y < arr1.length -1);
        System.out.println(arr1[arr1.length-1]);
        //7. Using a for loop, print arr2 displaying all elements on one line, separated by a dash.
        System.out.print("Array 2: ");
        for (int x = 0; x < arr2.length -1; x++)
        {
            System.out.print(arr2[x]+ "-");
         
        }
        System.out.println(arr2[arr2.length-1]);
    }
}
