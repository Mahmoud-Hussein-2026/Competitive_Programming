import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2169A - Alice and Bob .
* Logic : Count values strictly less than and greater than 'a', then pick a - 1 if smaller values are more or equal, otherwise a + 1.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int totalMarbles = in.nextInt();
            long aliceChoice = in.nextLong();
            int countLess = 0;
            int countGreater = 0;
            for (int i=0 ; i < totalMarbles ; i++) {
                long marbleValue = in.nextLong();
                if (marbleValue < aliceChoice) {
                    countLess++;
                }
                else if (marbleValue > aliceChoice) {
                    countGreater++;
                }
            }
            if (countLess >= countGreater) {
                System.out.println(aliceChoice-1);
            }
            else {
                System.out.println(aliceChoice+1);
            }
        }
        in.close();
    }
}
