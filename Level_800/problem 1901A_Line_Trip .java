/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1901A - Line Trip .
* Logic : Find the maximum gap among all consecutive points, doubling the distance between the last station and destination.
* Site : Codeforces .
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int j = 0; j < testCases; j++) {
            int max = 0;
            int n = in.nextInt();
          // n = stationCount .
            int x = in.nextInt();
          // x = destination .
            int[] arr = new int[n];
          // arr = array of stations .
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                if (i > 0) {
                    max = Math.max(max, (arr[i] - arr[i - 1]));
                }
            }
            max = Math.max(max, arr[0]);
            if (n == 1) {
                System.out.println(Math.max(max, (x - arr[0]) * 2));
            } else {
                System.out.println(Math.max(max, (x - arr[n - 1]) * 2));
            }
        }
        in.close();
    }
}
