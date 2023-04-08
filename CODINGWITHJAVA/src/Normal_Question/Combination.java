package Normal_Question;
import java.util.*;
public class Combination {

        public static void combi(int idx , int k , int n , int[]arr, List<List<Integer>> c,List<Integer>ds)
        {
            if(idx==n)
            {
                if(ds.size()==k)
                {
                    c.add( new ArrayList<>(ds));
                }
                return;
            }


            ds.add(arr[idx]);
            combi (idx+1,k , n, arr , c , ds);
            ds.remove(ds.size()-1);
            combi(idx+1,k,n,arr,c,ds);

        }
        public  static  List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> c = new ArrayList();
            List<Integer> ds = new ArrayList<>();

            int arr [] = new int [n];
            for(int i=0; i<n; i++)
            {
                arr[i]=i+1;
            }

            combi(0, k , n,arr , c , ds);
            return c;
        }


    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
