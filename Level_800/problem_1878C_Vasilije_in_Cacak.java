import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1878C - Vasilije in Cacak .
* Logic : Check if target sum x lies within the minimal sum of first k elements and maximal sum of last k elements from 1 to n.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0){
            long n = in.nextLong();
          // n : Max Range .
            long k = in.nextLong();
          // k : Element Count .
            long x = in.nextLong();
          // x : Target Sum .
            long minSum = k * (k + 1) / 2;
            long maxSum = n * (n + 1) / 2 - (n - k) * (n - k + 1) / 2;
            if(x >= minSum && x <= maxSum){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}
