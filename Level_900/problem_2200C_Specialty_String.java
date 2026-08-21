import java.util.Scanner;
import java.util.Stack;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2200C - Specialty String .
* Logic : Determines if all adjacent matching characters can be fully eliminated using a stack matching process.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int stringLength = in.nextInt();
            String text = in.next();
            Stack <Character> charStack = new Stack<>();
            for (int i=0 ; i < stringLength ; i++) {
                char currentChar = text.charAt(i);
                if (!charStack.isEmpty() && charStack.peek() == currentChar) {
                    charStack.pop();
                }
                else {
                    charStack.push(currentChar);
                }
            }
            if ( charStack.isEmpty() ) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
