import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2247B - Yet Another Constructive .
* Logic : Construct an array of 1s and place (m - k + 1) at every k-th position so the minimum subarray sum divisible by m has length k (Impossible if k > m).
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            long m = in.nextLong();
          // Base Case: It's impossible to sum to m with length k using positive integers if k > m
            if (k > m){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
              // Calculate the required value for every k-th element to make the subarray sum equal to m
                long lastVal = m - k + 1;
              // Pattern Construction: Fill array with 1s and place the special value at every k-th index
                for (int i=1 ; i<=n ; i++) {
                    if (i % k == 0) {
                        System.out.print(lastVal);
                    }
                    else {
                        System.out.print(1);
                    }
                    if (i < n) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        in.close();
    }
}
