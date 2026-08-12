import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2232B - Cake Leveling .
* Logic : Finds the maximum level frosting height for each prefix 
* by tracking the minimum running average (prefix_sum / position)
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int cakeLength = in.nextInt();
            long prifixSum = 0;
            long minHeigth = Long.MAX_VALUE;
            for (int i=1 ; i <= cakeLength ; i++) {
                long a = in.nextLong();
                prifixSum += a;
                minH = Math.min( minHeigth, prifixSum / i );
                output.append(minHeigth).append(i == cakeLength ? "" : " ");
            }
            output.append("\n");
        }
        System.out.print(output);
      in.close();
    }
}
