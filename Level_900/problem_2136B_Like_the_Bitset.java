import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2136B - Like the Bitset .
* Logic : ( Output "NO" if '1's sequence length >= k,
* else assign smaller values [1..totalOnes] to '1' positions and larger to '0' positions )
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int length = in.nextInt();
            int threshold = in.nextInt();
            String binaryString = in.next();
            int countOnes = 0;
            int maxConsecutiveOnes = 0;
            int currentOnes = 0;
            for (int i=0 ; i < length ; i++) {
                if (binaryString.charAt(i) == '1') {
                    countOnes++;
                    currentOnes++;
                    if (currentOnes > maxConsecutiveOnes) {
                        maxConsecutiveOnes = currentOnes;
                    }
                }
                else {
                    currentOnes = 0;
                }
            }
            if (maxConsecutiveOnes >= threshold) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                int[] ans = new int[length];
                int curLow = 1;
                int curHigh = countOnes + 1;
                for (int i=0 ; i < length ; i++) {
                    if (binaryString.charAt(i) == '1') {
                        ans[i] = curLow++;
                    }
                    else {
                        ans[i] = curHigh++;
                    }
                }
                StringBuilder result = new StringBuilder();
                for (int i=0 ; i < length ; i++) {
                    result.append(ans[i]).append(i == length - 1 ? "" : " ");
                }
                System.out.println(result.toString());
            }
        }
        in.close();
    }
}
