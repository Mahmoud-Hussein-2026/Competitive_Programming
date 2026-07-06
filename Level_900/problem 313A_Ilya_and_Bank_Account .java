import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 313A - Ilya and Bank Account .
* Logic : Keep positive balance as is; for negative balance, find the maximum by comparing the original,
* removing the last digit, and removing the second-to-last digit.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int bankAccountState = in.nextInt();
        if (bankAccountState >= 0) {
            System.out.println( bankAccountState );
        }
        else {
            int originalState = bankAccountState;
          // Remove the last digit using integer division 
            int removedLastDigit = bankAccountState / 10;
          // Form a new number by skipping the second-to-last digit mathematically
            int removedSecondToLastDigit = (bankAccountState / 100) * 10 + (bankAccountState % 10);
            // Pick the optimal choice that maximizes the bank balance
            int maxBalance = Math.max(originalState, Math.max(removedLastDigit, removedSecondToLastDigit));
            
            System.out.println(maxBalance);
        }
        in.close();
    }
}
