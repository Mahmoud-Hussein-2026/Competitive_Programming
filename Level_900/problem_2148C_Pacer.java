import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2148C - Pacer .
* Logic : Calculate max points per interval using parity check between time difference and side change,
* then add remaining minutes.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int requirementsCount = in.nextInt();
            long totalMinutes = in.nextLong();
            long currentMinute = 0;
            int currentSide = 0;
            long totalPoints = 0;
            for (int i=0 ; i < requirementsCount ; i++) {
                long targetMinute = in.nextLong();
                int targetSide = in.nextInt();
                long timeDiff = targetMinute - currentMinute;
                int sideChangeNeeded = (targetSide != currentSide) ? 1 : 0;
                if (timeDiff % 2 == sideChangeNeeded % 2) {
                    totalPoints += timeDiff;
                }
                else {
                    totalPoints += timeDiff-1;
                }
                currentMinute = targetMinute;
                currentSide = targetSide;
            }
            totalPoints += totalMinutes - currentMinute;
            System.out.println(totalPoints);
        }
      in.close();
    }
}
