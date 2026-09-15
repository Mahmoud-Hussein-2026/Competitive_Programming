import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1788A - One and Two .
* Logic : ​Find the smallest index k where the count of 2s on the left equals half of total 2s, or -1 if total 2s is odd.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int []elements = new int[n];
            int totalTwos = 0;
            for (int i=0 ; i < n ; i++) {
                elements[i] = in.nextInt();
                if (elements[i] == 2) {
                    totalTwos++;
                }
            }
            if (totalTwos % 2 != 0) {
                System.out.println(-1);
            }
            else {
                int targetTwos = totalTwos / 2;
                int currentTwos = 0;
                int splitIndex = -1;
                for (int i=0 ; i < n-1 ; i++) {
                    if (elements[i] == 2) {
                        currentTwos++;
                    }
                    if (currentTwos == targetTwos) {
                        splitIndex = i + 1;
                        break;
                    }
                }
                System.out.println(splitIndex);
            }
        }
        in.close();
    }
}
