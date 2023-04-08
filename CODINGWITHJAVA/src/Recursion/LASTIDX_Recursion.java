
import java.util.*;
public class LASTIDX_Recursion {
  public  static int index(int []arr,int target,int ans,int st)
    {
     if(st==arr.length)
         return ans;
     if(arr[st]==target)
     {
       ans=st;
     }
     return  index(arr,target,ans,++st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(index(arr,8,0,0));
    }
}
