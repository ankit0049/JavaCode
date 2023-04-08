package Normal_Question;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef_1090
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int count=0;
            int max = Math.max(a,b);
            int min = Math.min(a,b);

            while(a!=b && max>0)
            {
                max--;
                count++;
                if(max==min)
                {
                    break;
                }

                min++;


            }
            System.out.println(count);
        }
    }
}

