import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2226B - Everything Everywhere .
* Logic : Counts adjacent pairs where their absolute difference divides the element to satisfy the subarray condition.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int arrayLength = in.nextInt();
            int[] permutation = new int[n];
            for (int i=0 ; i < arrayLength ; i++) {
                permutation[i] = in.nextInt();
            }
            int count = 0;
            for (int i=0 ; i < arrayLength-1 ; i++) {
                int adjacentDiff = Math.abs( permutation[i] - permutation[i+1] );
                if ( permutation[i] % adjacentDiff == 0 ) {
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}
