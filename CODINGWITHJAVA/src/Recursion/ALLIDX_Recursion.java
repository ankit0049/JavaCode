import java.util.ArrayList;
import java.util.Scanner;

public class ALLIDX_Recursion {

        public static ArrayList Searching(int []arr , int st, int t,int idx,  ArrayList<Integer>a )
        {

            if ( st == arr.length)
                return null;
            if(arr[st]==t)
            {
              a.add(idx);
            }

            Searching(arr,++st,t,++idx,a);

        return a;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer>a = new ArrayList<>();
            int n = sc.nextInt();
            int []arr = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i]= sc.nextInt();
            }
            System.out.println(Searching(arr ,0,8,0,a));
        }
    }


