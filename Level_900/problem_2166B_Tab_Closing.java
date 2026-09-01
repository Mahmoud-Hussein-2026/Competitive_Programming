import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2166B - Tab Closing .
* Logic : Calculates the threshold of individual tab closes (a / b) 
* to determine if performing all manual closes is faster or equal to using a single close-all operation.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        StringBuilder resultBuilder = new StringBuilder();
        while (testCases-- > 0) {
            long costPerTab = in.nextLong();
            long closeAllCost = in.nextLong();
            long totalTabs = in.nextLong();
            long breakEvenTabs = costPerTab / closeAllCost;
            if ( costPerTab == closeAllCost || totalTabs <= breakEvenTabs) {
                resultBuilder.append(1).append('\n');
            }
            else {
                resultBuilder.append(2).append('\n');
            }
        }
        System.out.print( resultBuilder );
        in.close();
    }
}
