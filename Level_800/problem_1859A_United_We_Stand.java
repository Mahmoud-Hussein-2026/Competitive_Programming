import java.util.Scanner;
import java.util.ArrayList;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1859A - United We Stand .
* Logic : Place the maximum element(s) in array 'c' and all remaining smaller elements in array 'b' to guarantee no element in 'c' divides any element in 'b'.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int arraySize = in.nextInt();
            int[] numbers = new int[arraySize];
            int maxElement = 0;
            for (int i=0 ; i < arraySize ; i++) {
                numbers[i] = in.nextInt();
                maxElement = Math.max(maxElement, numbers[i]);
            }
            ArrayList <Integer> b = new ArrayList<>();
            ArrayList <Integer> c = new ArrayList<>();
            for (int x : numbers) {
                if (x == maxElement)
                    c.add(x);
                else
                    b.add(x);
            }
            if (b.isEmpty()) {
                System.out.println(-1);
                continue;
            }
            System.out.println(b.size() + " " + c.size());
            for (int x : b)
                System.out.print(x + " ");
            System.out.println();
            for (int x : c)
                System.out.print(x + " ");
            System.out.println();
        }
      in.close();
    }
}
