import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2114B - Not Quite a Palindromic String .
* Logic : Check if target Pairs good lies within the valid range with the same parity as the minimum required pairs.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int length = in.nextInt();
            int targetPairs = in.nextInt();
            String binaryString = in.next();
            int zeroCount = 0;
            int oneCount = 0;
            for (int i=0 ; i < length ; i++) {
                if (binaryString.charAt(i) == '0') {
                    zeroCount++;
                }
                else {
                    oneCount++;
                }
            }
            int minGoodPairs = Math.abs(oneCount - zeroCount) / 2;
            int maxGoodPairs = oneCount / 2 + zeroCount / 2;
            if (targetPairs >= minGoodPairs && targetPairs <= maxGoodPairs && (targetPairs - minGoodPairs) % 2 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
