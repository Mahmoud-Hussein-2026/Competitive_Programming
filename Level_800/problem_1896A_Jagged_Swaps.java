import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1896A - Jagged Swaps .
* Logic : The array can be sorted if and only if the first element is 1, as the operation cannot modify the first element (index 0).
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int arraySize = in.nextInt();
            int[] array = new int[arraySize];
            for (int i=0 ; i < arraySize ; i++) {
                array[i] = in.nextInt();
            }
            if (array[0] == 1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
