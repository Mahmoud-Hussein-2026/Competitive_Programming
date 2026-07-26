import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1772A - A+B? .
* Logic : Parses a "a+b" format string and evaluates the sum by converting numeric characters to integers .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while (testCases-- > 0){
                String expression = in.next();
                System.out.println((expression.charAt(0)-'0')+(expression.charAt(2)-'0'));
            }
        in.close();
    }
}
