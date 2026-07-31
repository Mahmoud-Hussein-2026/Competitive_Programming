import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1807D - Odd Queries .
* Logic : Check if overall array sum remains odd after range replacement using 1-based Prefix Sum for O(1) query time.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            int n = in.nextInt();
            int q = in.nextInt();
            long[] pref = new long[n + 1];
            for (int i=1 ; i<=n ; i++) {
                long val = in.nextLong();
                pref[i] = pref[i - 1] + val;
            }
            long totalSum = pref[n];

            for (int i = 0; i < q; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                long k = in.nextLong();
                long oldRangeSum = pref[r] - pref[l - 1];
                long newRangeSum = (r - l + 1) * k;

                long newTotalSum = totalSum - oldRangeSum + newRangeSum;

                if (newTotalSum % 2 != 0) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        
        System.out.print(sb);
    }
}
