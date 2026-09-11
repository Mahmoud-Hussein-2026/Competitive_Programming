import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2132B - The Secret Number .
* Logic : Find original x by solving n = x * (1 + 10^k) for powers of 10, checking divisibility.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            long totalSum = in.nextLong();
            ArrayList <Long> validAnswers = new ArrayList<>();
            long multiplier = 10;
            while (totalSum / (1 + multiplier) > 0) {
                long divisor = 1 + multiplier;
                if (totalSum % divisor == 0) {
                    validAnswers.add(totalSum / divisor);
                }
                if (multiplier > Long.MAX_VALUE / 10) break;
                multiplier *= 10;
            }
            Collections.sort(validAnswers);
            if (validAnswers.isEmpty()) {
                System.out.println(0);
            }
            else {
                System.out.println(validAnswers.size());
                StringBuilder sb = new StringBuilder();
                for (int i=0 ; i < validAnswers.size(); i++) {
                    sb.append(validAnswers.get(i));
                    if (i < validAnswers.size() - 1) {
                        sb.append(" ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
        in.close();
    }
}
