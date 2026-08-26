import java.util.Arrays;
import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 489B - BerSU Ball .
* Logic : Find the maximum number of pairs by sorting both skill arrays and applying
* a greedy two-pointer approach to match pairs with absolute skill difference <= 1.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int boysCount = in.nextInt();
        int[] boys = new int[boysCount];
        for (int i=0 ; i < boysCount ; i++) {
            boys[i] = in.nextInt();
        }
        int girlsCount = in.nextInt();
        int[] girls = new int[girlsCount];
        for (int i=0 ; i < girlsCount ; i++) {
            girls[i] = in.nextInt();
        }
        Arrays.sort(boys);
        Arrays.sort(girls);
        int pairs = 0;
        int boyIndex = 0, girlIndex = 0;
        while ( boyIndex < boysCount && girlIndex < girlsCount ) {
            if ( Math.abs( boys[boyIndex] - girls[girlIndex] ) <= 1 ) {
                pairs++;
                boyIndex++;
                girlIndex++;
            }
            else if (boys[boyIndex] < girls[girlIndex]) {
                boyIndex++;
            }
            else {
                girlIndex++;
            }
        }
        System.out.println(pairs);
        in.close();
    }
}
