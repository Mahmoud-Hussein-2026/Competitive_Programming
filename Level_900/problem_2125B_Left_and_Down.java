import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2125B - Left and Down .
* Logic : Find the minimum distinct step pairs to reach (0,0);
* return 1 if scaling by GCD fits within k bounds, otherwise max cost is 2 using (1,0) and (0,1).
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            long targetX = in.nextLong();
            long targetY = in.nextLong();
            long maxStepSize = in.nextLong();
            long gcdValue = gcd( targetX , targetY );
            if (targetX / gcdValue <= maxStepSize && targetY / gcdValue <= maxStepSize) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }
        }
        in.close();
    }
    private static long gcd(long x , long y) {
        while (y != 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
