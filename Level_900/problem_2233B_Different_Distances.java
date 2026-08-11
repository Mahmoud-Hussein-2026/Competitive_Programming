import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2233B - Different Distances .
* Logic : Partition array into 4 blocks of size n and cyclic-shift the 3rd block by 1 to make all 3 gaps distinct.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        StringBuilder outputBuilder = new StringBuilder();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int[] result = new int[ 4*n ];
            for ( int i=0 ; i<n ; i++ ) {
                result[ i - 1 ] = i;
                result[ n + i - 1 ] = i;
              // Shift 3rd block elements by 1 position (cyclic) to vary inner distances
                result[ 2 * n + (i % n) ] = i;
                result[ 3 * n + i - 1 ] = i;
            }
            for ( int i=0 ; i < 4*n ; i++ ) {
                outputBuilder.append(result[i]).append(i == 4 * n - 1 ? "" : " ");
            }
            outputBuilder.append("\n");
        }
      System.out.print(outputBuilder);
      in.close();
    }
}
