package Normal_Question;
import java . util.*;
public class ArraySum {

     static boolean isValid(int arr[] , int n, int target){
        int sum = 0;
        for(int i = n-1; i > 0; i--){

            if(arr[i] <= target){
                target = target - arr[i];
            }
            if (target == 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int target=sc.nextInt();

        int arr[] =new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();;
        }
        Arrays.sort(arr);
        if( isValid(arr, n, target) )
        {
            System.out.println("Valid");
        }
        else
            System.out.println("INVALID");
    }
}
