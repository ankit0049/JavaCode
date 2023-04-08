
    /* package codechef; // don't place package name! */

    import java.util.*;
    import java.lang.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class Codechef1223
    {

        public static int solve(String st , HashMap<Character,Integer>hm,int ans,int i,int m)
        {
            if(i==st.length())
            {
                return ans;
            }
            int a = hm.get(st.charAt(i));
            ans = ans + (m*a);

            return  solve(st,hm,ans,++i,++m);
        }
        public static void main (String[] args) throws java.lang.Exception
        {



            Scanner sc = new Scanner(System.in);
          int t = sc.nextInt();

            String st[] = new String[t];
            for(int i=0; i<t; i++)
            {
                st[i]=sc.next();
            }

            char[]arr = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            int[]brr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
            HashMap< Character,Integer> hm = new HashMap<>();
            for(int i=0; i<arr.length; i++)
            {
                hm.put(arr[i], brr[i]);
            }
            for(int i =0; i<t; i++) {
                String gh = st[i];
                char a[] = gh.toCharArray();
                Arrays.sort(a);
                String op = new String(a);
                System.out.println(solve(op, hm, 0, 0, 1));

            }
            // your code goes here
        }
    }




