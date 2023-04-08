
package Normal_Question;
/*
don't place package name

import java.util.*;
import java.lang.*;

 Name of the class has to be "Main" only if the class is public.
class Codechef
{    public static void frequency(char []op , HashMap<Character,Integer> hm, int st)
{
    if(st==op.length)
    {
        return ;
    }

    if(op[st]=='c'||op[st]=='o'||op[st]=='d'||op[st]=='e'||op[st]=='h'|| op[st]=='f')
    {
        hm.put(op[st],hm.getOrDefault(op[st],0)+1);
    }
    frequency(op,hm,++st);

}
    public static void main (String[] args) throws Exception
    {
        Scanner sc =  new Scanner (System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            String str[] = new String[n];
            for(int i=0; i<n; i++)
            {
                str[i]=sc.next();
            }

            HashMap<Character,Integer> hm = new HashMap();

            for(int i =0; i<str.length; i++)
            {   String l = str[i];
                char [] op= l.toCharArray();
                frequency(op,hm,0);
            }

            ArrayList<Integer> a = new ArrayList();
            Set keys = hm.keySet();
            for(Object key: keys)
            {
                a.add(hm.get(key));

            }    int ans = hm.get('c')/2;
            int ans1 = hm.get('e')/2;
            int ans2 = hm.get('d');
            int ans3 = hm.get('o');
            int ans4 = hm.get('h');
            int ans5 = hm.get('f');
            int ans0 = Math.min(ans ,Math.min(ans1,Math.min(ans2,Math.min(ans3,Math.min(ans4,ans5)
                   ))));
            System.out.println(ans0);
        }

    }
}*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc .nextInt();

        while(t-->0)
        {  ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            int N = sc.nextInt();
            int B = sc.nextInt();
            int w , h , p;
            for(int i=1; i<=N; i++)
            {
                w= sc.nextInt();
                h= sc.nextInt();
                p= sc.nextInt();

                int ans =w*h;
                a.add(ans);
                b.add(p);
            }
            int max =0 , answer=0;

            for(int i=0; i<a.size(); i++)
            {
                if(B>=b.get(i) && max<=a.get(i))
                {
                    max=a.get(i);
                    answer = max ;
                }
            }

            if(answer!=0)
            {
                System.out.println("no tablet");
            }
            else
                System.out.println(answer);
        }
    }
}




