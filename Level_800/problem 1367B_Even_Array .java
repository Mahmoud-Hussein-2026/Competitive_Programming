import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1367B - Even Array .
* Logic : Find the minimum swaps by counting misplaced even numbers in odd indices and vice versa, solving it only if both counts are equal.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for( int i=0 ; i < testCases ; i++ ){
            int n = in.nextInt();
             int mismatchedEven = 0 ;
             int mismatchedOdd = 0 ;
          // Count elements that don't match the parity of their indices
            for( int j=0 ; j < n ; j++ ){
                int currentNum = in.nextInt();
                if( (j%2 == 0) && ( currentNum % 2 != 0) ){
                    mismatchedOdd++;
            }
            if( (j%2 != 0) && ( currentNum % 2 == 0) ){
                    mismatchedEven++;
            }
        }
          // If wrong positions are balanced, the number of swaps equals one of the counts
        if( mismatchedEven == mismatchedOdd ){
        System.out.println( mismatchedOdd );
        }
        else{
             System.out.println("-1");
        }
        }
        in.close();
    }
}
