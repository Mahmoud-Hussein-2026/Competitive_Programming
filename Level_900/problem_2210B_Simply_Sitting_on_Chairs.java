import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2210B - Simply Sitting on Chairs .
* Logic : We skip chairs that mark future positions and only sit on chairs where p[i] <= i to avoid early termination.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int chairsNumber = in.nextInt();
            int count = 0;
            for (int i=1 ; i <= chairsNumber ; i++) {
                int targetChair = in.nextInt();
                if (targetChair <= i) {
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}
