import java.util.Arrays;
import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2185C - Shifted MEX	 .
* Logic : Find the maximum sequence of consecutive distinct integers after sorting,
* which represents the maximum achievable MEX by shifting the array.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int elementCount = in.nextInt();
            long []numbers = new long[n];
            for (int i=0 ; i < elementCount ; i++) {
                numbers[i] = in.nextLong();
            }
            Arrays.sort(numbers);
            int maxMex = 0;
            int currentStreak = 0;
            for (int i=0 ; i < elementCount ; i++) {
                if ( i > 0 && numbers[i] == numbers[i-1] ) {
                    continue;
                }
                if ( i > 0 && numbers[i] == numbers[i-1] + 1 ) {
                    currentStreak++;
                }
                else {
                    currentStreak = 1;
                }
                if (currentStreak > maxMex) {
                    maxMex = currentStreak;
                }
            }
            System.out.println(maxMex);
        }
        in.close();
    }
}
