import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1996A - Legs .
* Logic : Maximizes 4-legged animals (cows) first, then adds 1 for any remaining 2 legs (chicken) to minimize total animals.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int totalLegs = in.nextInt();
            if( totalLegs %4 == 0 ){
            System.out.println( totalLegs/4 );
            }
            else{
                System.out.println( (totalLegs/4) + 1 );
            }
        }
        in.close();
    }
}
