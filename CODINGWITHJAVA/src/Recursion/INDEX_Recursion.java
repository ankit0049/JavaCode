import java.util.Scanner;


public class INDEX_Recursion {
    private static int Searching(int []arr , int st, int t,int idx)
    {
        if ( st == arr.length)
            return idx;
        if(arr[st]==t)
        {
            st = idx;
        }

       return Searching(arr,++st,t,idx);


    }

    public static int index(int []arr ,int target) {
    return Searching(arr, 0, target,0);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(index(arr ,8));
    }
}
