import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1881A - Don't Try to Count .
* Logic : Find the minimum operations to make targetStr a substring of baseStr by repeatedly duplicating baseStr up to 5 times based on the small constraints.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int testCases = in.nextInt();
                for( int j=0 ; j < testCases ; j++ ){
                    int n = in.nextInt();
                    int m = in.nextInt();
                    String baseStr = in.next();
                    String targetStr = in.next();
                    int count = 0;
                    boolean isFound = false;
                    for( int i=0 ; i < 6 ; i++ ){
                    if( baseStr.contains( targetStr ) ){
                        System.out.println(count);
                        isFound = true;
                        break;
                    }
                        baseStr += baseStr;
                        count++;
                    }
                    if(!isFound)
                    System.out.println("-1");
                }
        in.close();
    }
}
