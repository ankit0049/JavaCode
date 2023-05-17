package Normal_Question;
import java.util.*;
class LeetCode {
    public static int max( /*ArrayList<Integer>a*/ int arr[])
    {   int ans = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++)
        {
            if(ans<arr[i])
                ans=arr[i];;
        }
        return ans;
    }

    public static int maxi( /*ArrayList<Integer>a*/ int arr[] , int v)
    {   int ans = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++)
        {
            if(ans<=arr[i] && v>=arr[i])
                ans=arr[i];;
        }
        return ans;
    }
//    public static void laststone( ArrayList<Integer>a )
//    {
//        if(a.size()==1)
//            return;
////        int m = max(a);
////        int s = maxi(a,m);
//        int i= a.indexOf(s);
//        int m_i = a.indexOf(m);
//        a.remove(i);
//        a.set(m_i,m-s);
//        laststone(a);
//    }
    public static void lastStoneWeight(int[] stones) {
        ArrayList<Integer> a = new ArrayList ();
        for(int i=0; i<stones.length; i++)
        {
            a.set(i,stones[i]);
        }

        return;
    }


    public static void main(String[] args) {
        int arr []={2,7,4,1,8,1};
        int ans = max(arr);
        int ans2 = maxi(arr,ans);
        System.out.println( ans + "  : "+ ans2);
      //  System.out.println(lastStoneWeight(arr));
    }
}