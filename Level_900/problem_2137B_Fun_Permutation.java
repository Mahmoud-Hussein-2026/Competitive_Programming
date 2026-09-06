import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 2137B - Fun Permutation .
* Logic : Construct q[i] = (n + 1) - p[i] so that p[i] + q[i] = n + 1 for all i,
* guaranteeing GCD(p[i] + q[i], p[i+1] + q[i+1]) = n + 1 >= 3.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int permutationSize = in.nextInt();
            StringBuilder resultBuilder = new StringBuilder();
            for (int i=0 ; i < permutationSize ; i++) {
                int currentElement = in.nextInt();
                int complementElement = ( permutationSize + 1 ) - currentElement;
                resultBuilder.append(complementElement).append(" ");
            }
            System.out.println(resultBuilder.toString().trim());
        }
        in.close();
    }
}
