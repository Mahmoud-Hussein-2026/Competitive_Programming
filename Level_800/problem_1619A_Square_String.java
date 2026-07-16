import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1619A - Square String ? .
* Logic : Checks if a string is "square" by ensuring its length is even and comparing its first half to its second half.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int testCases = in.nextInt();
                for( int j=0 ; j < testCases ; j++ ){
                    String word = in.next();
                    int length = word.length();
                    if( length%2 != 0 ){
                        System.out.println( "NO" );
                        continue;
                    }
                    String firstHalf = word.substring(0 , length/2);
                    String secondHalf = word.substring(length/2);
                    if(firstHalf.equals(secondHalf)){
                        System.out.println("YES");
                    }
                    else{
                    System.out.println("NO");
                    }
                }
        in.close();
    }
}
