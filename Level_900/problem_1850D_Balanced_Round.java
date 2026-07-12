import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1850D - Balanced Round .
* Logic : Finds the minimum problems to remove by sorting the array and finding the longest continuous subarray
* where the absolute difference between any two consecutive elements is at most K.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            for(int i=0 ; i<testCases ; i++){
                int n = in.nextInt();
                int k = in.nextInt();
                int []diff = new int[n];
                int currentStreak = 1;
                int maxStreak = 0;
                for(int j=0 ; j<n ; j++){
                     diff[j] = in.nextInt();   
                }
                Arrays.sort(diff);
                for(int j=1 ; j<n ; j++){
                  // Track the longest subarray with consecutive differences <= k
                    if( diff[j] - diff[j-1] <= k ){
                         currentStreak++;
                     }
                     else{
                         maxStreak = Math.max(current,max);
                         currentStreak = 1;
                     }
                }
                maxStreak = Math.max( maxStreak , currentStreak );
              // Minimum removals required is total elements minus the longest valid sequence
                System.out.println( n - maxStreak );
            }
        in.close();
    }
}
