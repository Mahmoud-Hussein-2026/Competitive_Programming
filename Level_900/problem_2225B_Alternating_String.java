import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2225B - Alternating String .
* Logic : Checks if mismatched characters from a target alternating pattern form a single contiguous subarray.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            String inputSTR = in.next();
            if ( check( inputSTR,'a' ) || check( inputSTR,'b' ) ){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
  // Validates if string can match target alternating pattern within a single operation.
    public static boolean check( String s , char startChar ){
        int n = s.length();
        int firstMismatch = -1 , lastMismatch = -1 , mismatchCount = 0;
        for (int i=0 ; i<n ; i++){
            char expected = (i % 2 == 0) ? startChar : (startChar == 'a' ? 'b' : 'a');
            if (s.charAt(i) != expected) {
                if (firstMismatch == -1){
                    firstMismatch = i;
                }
                lastMismatch = i;
                mismatchCount++;
            }
        }
        if (mismatchCount == 0) {
            return true;
        }
        return mismatchCount == ( lastMismatch - firstMismatch + 1 );
    }
}
