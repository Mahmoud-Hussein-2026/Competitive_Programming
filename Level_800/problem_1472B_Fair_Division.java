import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1472B - Fair Division .
* Logic : Checks if total candies weight is even and divisible into two equal halves based on the counts of 1s and 2s.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int sum = 0;
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < n; i++) {
                int val = in.nextInt();
                sum += val;
                if (val == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }
            if (sum % 2 != 0) {
                System.out.println("NO");
            } else {
                int half = sum / 2;
                if (half % 2 == 0) {
                    System.out.println("YES");
                } else {
                    if (count1 >= 2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
        in.close();
    }
}
