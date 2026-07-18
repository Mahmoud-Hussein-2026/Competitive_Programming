import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1883B - Chemistry .
* Logic : Checks if a string can form a palindrome after removing exactly k characters by ensuring the number of odd-frequency characters doesn't exceed k + 1.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while ( testCases-- > 0 ){
                int stringLength = in.nextInt();
                int removalsAllowed = in.nextInt();
                String inputString = in.next();
                int[] charFrequencies = new int[26];
                for (int i=0 ; i < stringLength ; i++) {
                    charFrequencies[inputString.charAt(i) - 'a']++;
                }
                int oddCount = 0;
                for (int i = 0; i < 26; i++) {
                    if (charFrequencies[i] % 2 != 0) {
                        oddCount++;
                    }
                }
                if ( removalsAllowed >= oddCount - 1 ) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        in.close();
    }
}
