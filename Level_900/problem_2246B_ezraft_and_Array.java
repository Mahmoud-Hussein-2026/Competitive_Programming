import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2246B - ezraft and Array .
* Logic : For n >= 3, initialize base [1, 2, 3] (sum 6) and greedily append the current sum
* as the next elementto double the sum and preserve divisibility across all elements. 
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            if (n == 1){
                System.out.println(1);
            }
            else if (n == 2){
                System.out.println(-1);
            }
            else{
                long[] numbers = new long[n];
                numbers[0] = 1;
                numbers[1] = 2;
                numbers[2] = 3;
                long currentSum = 6;
                for (int i=3 ; i<n ; i++){
                    numbers[i] = currentSum;
                    currentSum += numbers[i];
                }
                StringBuilder sb = new StringBuilder();
                for (int i=0 ; i<n ; i++){
                    sb.append(numbers[i]).append(i == n - 1 ? "" : " ");
                }
                System.out.println(sb.toString());
            }
        }
        in.close();
    }
}
