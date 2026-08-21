import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2209B - Array .
* Logic : Count elements strictly greater and smaller than the current element a[i] in the subarray to its right.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int arrayLength = in.nextInt();
            long []numbers = new long[arrayLength];
            for (int i=0 ; i<arrayLength ; i++) {
                numbers[i] = in.nextLong();
            }
            for (int i=0 ; i<arrayLength ; i++) {
                int greater = 0;
                int smaller = 0;
                for (int j = i+1 ; j<arrayLength ; j++) {
                    if (numbers[j] > numbers[i]) {
                        greater++;
                    }
                    else if (numbers[j] < numbers[i]) {
                        smaller++;
                    }
                }
                int ans = Math.max( greater , smaller );
                System.out.print(ans + (i == arrayLength - 1 ? "" : " "));
            }
            System.out.println();
        }
        in.close();
    }
}
