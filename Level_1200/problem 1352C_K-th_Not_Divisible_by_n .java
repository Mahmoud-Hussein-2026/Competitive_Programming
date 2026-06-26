import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1352C - K-th Not Divisible by n	 .
* Logic : Finds the k-th positive integer not divisible by n in O(1) time complexity;
* Instead of iterating, it mathematically calculates the total numbers skipped (using (k-1)/(n-1)) and adds them directly to k.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for( int i=0 ; i<testCases ; i++ ){
            long n = in.nextLong();
          // n : divisor 
            long k = in.nextLong();
          // k : step size
            System.out.println(k+((k-1)/(n-1)));
        }
      in.close();
    }
}
