import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1551A - Polycarp and Coins .
* Logic : Minimize |c1 - c2| for c1 + 2*c2 = n by dividing n into groups of 3 and assigning the remainder (n % 3) to c1 or c2.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0){
            long totalBurles = in.nextLong();
            long count1 = totalBurles / 3;
            long count2 = totalBurles / 3;
            if( totalBurles % 3 == 1){
                count1++;
            }
            else if( totalBurles % 3 == 2){
                count2++;
            }
            System.out.println( count1 + " " + count2 );
        }
        in.close();
    }
}
