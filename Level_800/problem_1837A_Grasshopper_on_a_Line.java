import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1837A - Grasshopper on a Line .
* Logic : If x is not divisible by k, jump directly in 1 move; otherwise, split it into 1 and (x - 1) in 2 moves to avoid k.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int targetPoint = in.nextInt();
            int divisorConstraint = in.nextInt();
            if (targetPoint % divisorConstraint != 0) {
                System.out.println(1);
                System.out.println(targetPoint);
            }
            else {
                System.out.println(2);
                System.out.println(1 + " " + (targetPoint - 1));
            }
        }
        in.close();
    }
}
