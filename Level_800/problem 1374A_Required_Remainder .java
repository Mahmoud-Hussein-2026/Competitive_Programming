import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1374A - Required Remainder .
* Logic : Find the maximum k <= n where k % x == y using an O(1) mathematical formula instead of loops.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            for (int i = 0; i < testCases; i++) {
                int divisor = in.nextInt();
                int remaider = in.nextInt();
                int maxRange = in.nextInt();
                int result = (maxRange / divisor) * divisor + remaider ;
                if (result > maxRange) {
                    result -= divisor;
                }
                System.out.println( result );
            }
        in.close();
    }
}
