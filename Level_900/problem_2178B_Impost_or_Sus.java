import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2178B - Impost or Sus .
* Logic : Ensures the string ends with 's' and contains no adjacent 'u's to minimize operations for a suspicious string.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            String str = in.next();
            int strLength = str.length();
            char []chars = str.toCharArray();
            int minOperations = 0;
            if ( chars[0] != 's' ) {
                chars[0] = 's';
                minOperations++;
            }
            if ( chars[strLength-1] != 's' ) {
                chars[strLength-1] = 's';
                minOperations++;
            }
            for (int i=1 ; i < strLength - 1 ; i++) {
                if ( chars[i] == 'u' && chars[i-1] == 'u' ) {
                    chars[i] = 's';
                    minOperations++;
                }
            }
            System.out.println(minOperations);
        }
        in.close();
    }
}
