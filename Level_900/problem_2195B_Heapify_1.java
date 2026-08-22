import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2195B - Heapify 1 .
* Logic : Checks if array elements can reach sorted positions by removing powers of 2.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int []numbers = new int[n+1];
            for (int i=1 ; i <= n ; i++){
                numbers[i] = in.nextInt();
            }
            boolean isPossible = true;
            for (int i=1 ; i <= n ; i++){
                int currentValue = numbers[i];
                int targetIndex = i;
                while (currentValue % 2 == 0) {
                    currentValue /= 2;
                }
                while (targetIndex % 2 == 0) {
                    targetIndex /= 2;
                }
                if (currentValue != targetIndex) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        in.close();
    }
}
