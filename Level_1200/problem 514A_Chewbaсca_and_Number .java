import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 514A - Chewbaсca and Number	 .
* Logic : Traverse all digits and minimize the number by replacing large digits.
* Site : Codeforces .
*/
public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        StringBuilder ans = new StringBuilder();
      // Replace each digit d >= 5 with (9 - d), except the leading 9.
        for (int i=0; i<number.length() ;i++) {
            int digit = number.charAt(i) - '0';
            if (i==0 && digit==9) {
              // Keep the leading 9 unchanged.
                ans.append(9);
            }
            else if (digit>=5) {
              // Replace digit with its complement to 9.
                ans.append(9-digit);
            }
            else {
                ans.append(digit);
            }
        }
        System.out.println(ans);
      in.close();
    }
}
