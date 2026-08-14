import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2254B - Evanescent .
* Logic : Calculates initial compressed string length and evaluates removing each inner character in O(1) using local transition changes to find the minimum.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            String text = in.next();
            int initialCompressedLen = 1;
            for (int i=0 ; i < n-1 ; i++) {
                if (text.charAt(i) != text.charAt(i+1)) {
                    initialCompressedLen++;
                }
            }
            int minCompressedLen = initialCompressedLen;
            for (int i=1 ; i < n-1 ; i++) {
                int oldCost = (text.charAt(i-1) != text.charAt(i) ? 1 : 0) + (text.charAt(i) != text.charAt(i+1) ? 1 : 0);
                int newCost = (text.charAt(i-1) != text.charAt(i + 1) ? 1 : 0);
                int cur = initialCompressedLen - oldCost + newCost;
                if (cur < minCompressedLen) {
                    minCompressedLen = cur;
                }
            }
            System.out.println(minCompressedLen);
        }
        in.close();
    }
}
