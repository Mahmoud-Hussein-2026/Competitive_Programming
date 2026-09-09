import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1877A - Goals of Victory .
* Logic : The sum of all team efficiencies is 0, so the missing efficiency equals the negative sum of given efficiencies.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while (testCases-- > 0) {
                int totalTeams = in.nextInt();
                int sumOfGivenEfficiencies = 0;
                for (int i=0 ; i < totalTeams-1 ; i++) {
                    sumOfGivenEfficiencies += in.nextInt();
                }
                System.out.println(-sumOfGivenEfficiencies);
            }
        in.close();
    }
}
