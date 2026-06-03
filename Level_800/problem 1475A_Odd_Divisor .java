import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  1475A - Odd Divisor .
* Logic :( Any integer can be represented as n = 2^k \times m, where m is an odd number;
* If we repeatedly divide n by 2 as long as it's even, we will eventually be left with m;
* If m > 1, it means the number has an odd divisor greater than 1, so the answer is "YES";
* If m = 1, the number is a pure power of 2 (2^k), which means it has no odd divisors except 1, so the answer is "NO" ) .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCasesCount = in.nextInt();
        for(int i=0;i<testCasesCount;i++){
            long number = in.nextLong();
            while(number%2==0){
                number/=2;
            }
            if(number==1){
                System.out.println("NO");
            }
            else{
                 System.out.println("YES");
            }
        }
      in.close();
    }
}
