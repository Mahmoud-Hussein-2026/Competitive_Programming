import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 474B - Worms .
* Logic : * Logic : Computes the prefix sum of worm piles to represent continuous ranges
* then finds the correct pile for each query efficiently using Binary Search O(M log N).
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int []prefixSums = new int[n];
            prefixSums[0] = in.nextInt();
            for (int i=1 ; i < n ; i++) {
                  prefixSums [i] = prefixSums[i-1] + in.nextInt();
                }
            int m = in.nextInt();
            for (int i=0 ; i < m ; i++) {
                int query = in.nextInt();
                int searchResult = Arrays.binarySearch( prefixSums , query );
                if( searchResult < 0){
                    searchResult = -( searchResult + 1 );
                }
                     System.out.println( searchResult + 1 );
                }
        in.close();
    }
}
