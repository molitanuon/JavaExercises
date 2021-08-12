/*
 * (name header)
 */

import java.util.Scanner;

public class YourCode
{
    public static Scanner input = new Scanner(System.in);

    public YourCode(){}

    public static void sectionA(String str)
    {
        // Your code here...
        System.out.println(str.substring(0, str.length() / 2));

    }

    public static void sectionB(String str)
    {
        // Your code here... 
        System.out.println(str.substring(1, str.length () -1 ));

    }

    public static void sectionC(String str1, String str2)
    {
        // Your code here...
        if (str1.length() <= str2.length())
        {
            String words;
            words = str1.concat(str2);
            System.out.print(words);
            System.out.println(str1);
        }
        else
        { 
            String words;
            words = str2.concat(str1);
            System.out.print(words);
            System.out.println(str2);
        }

    }

    public static void sectionD(String str1, String str2)
    {
        // Your code here...
        System.out.print(str1.substring(1, str1.length()));
        System.out.println(str2.substring(1, str2.length()));
    }

    public static void sectionE(String str)
    {
        // Your code here...
        System.out.print(str.substring(2, str.length()));
        System.out.println(str.substring(0,2));
    }

    public static void sectionF(String str)
    {
        // Your code here...
        int half = str.length() / 2;
        System.out.println(str.substring(half -1, half + 1));
    }

    public static void sectionG(String str)
    {
        // Your code here...
       int count = 0;
       if (str.length() == 1 && str.charAt(0) == 'h')
            count = 0;
       else
       for (int i = 0; i < str.length(); i++)
       {
           if ((str.charAt(i) == 'h') && (str.charAt (i + 1) == 'i'))
           count +=1;
        }
        System.out.println(count);
    }
}
