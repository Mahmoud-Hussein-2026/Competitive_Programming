import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1926A - Vlad and the Best of Five .
* Logic : Count the occurrences of 'A' in a 5-character string and print 'A' if its count exceeds 2, otherwise print 'B'.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while ( testCases-- > 0 ){
                String str = in.next();
                int countA = 0;
                for( int i=0 ; i<5 ; i++ ){
                    if( str.charAt(i) == 'A' ){
                        countA++;
                    }
                }
                if ( countA > 2 ) {
                    System.out.println('A');
                }
                else {
                    System.out.println('B');
                }
            }
        in.close();
    }
}
