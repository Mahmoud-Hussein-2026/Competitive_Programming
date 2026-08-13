import java.util.*;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2229C1 - We Be Flipping (Easy Version) .
* Logic : Minimizes array sum by traversing backwards and greedily flipping prefixes whenever the active element is positive.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int[] numbers = new int[n];
            for (int i=0 ; i<n ; i++) {
                numbers[i] = in.nextInt();
            }
            List <Integer> operations = new ArrayList<>();
            boolean flipped = false;
            for (int i = n-1 ; i >= 0 ; i--) {
                int currentValue = flipped ? - numbers[i] : numbers[i];
                if (currentValue > 0) {
                    operations.add(i + 1);
                    flipped = !flipped;
                }
            }
            System.out.println(operations.size());
            StringBuilder sb = new StringBuilder();
            for (int index : operations) {
                sb.append(index).append(" ");
            }
            System.out.println(sb);
        }
        in.close();
    }
}
