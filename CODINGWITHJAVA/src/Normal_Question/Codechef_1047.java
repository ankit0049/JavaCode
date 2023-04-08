package Normal_Question;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef_1047
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            Set<Integer> a = new HashSet<>();
            int n = sc.nextInt();
            for(int i=0; i<n; i++)
            {
                int day = sc.nextInt();
                a.add(day);

            }
            System.out.println(a.size());

        }
    }
}

