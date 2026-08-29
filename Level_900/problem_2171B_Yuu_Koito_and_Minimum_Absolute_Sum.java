import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2171B - Yuu Koito and Minimum Absolute Sum .
* Logic : The sum of differences simplifies to |a[n-1] - a[0]|,
* so we minimize it by matching/zeroing boundary elements and setting inner missing elements to 0 for lexicographical order.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int arrayLength = in.nextInt();
            long []numbers = new long[n];
            for (int i=0 ; i < arrayLength ; i++) {
                numbers[i] = in.nextLong();
            }
            if (numbers[0] == -1 && numbers[arrayLength-1] == -1) {
                numbers[0] = 0;
                numbers[n-1] = 0;
            }
            else if (numbers[0] == -1) {
                numbers[0] = numbers[n-1];
            }
            else if (numbers[n-1] == -1) {
                numbers[n-1] = numbers[0];
            }
            for (int i=1 ; i < arrayLength-1 ; i++) {
                if (numbers[i] == -1) {
                    numbers[i] = 0;
                }
            }
            long ans = Math.abs(numbers[arrayLength-1] - numbers[0]);
            System.out.println(ans);
            for (int i=0 ; i < arrayLength ; i++) {
                System.out.print(numbers[i] + (i == arrayLength - 1 ? "" : " "));
            }
            System.out.println();
        }
        in.close();
    }
}
