import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 2238B - Crimson Triples .
* Logic : Counts triples (a, b, c) where b divides both a and c by summing (n / b)^2 for each b from 1 to n.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            long totalTriples = 0;
            for (int i=0 ; i<n ; i++) {
                long multiplesCount = n / i;
                totalTriples += multiplesCount * multiplesCount;
            }
            System.out.println(totalTriples);
        }
        in.close();
    }
}
