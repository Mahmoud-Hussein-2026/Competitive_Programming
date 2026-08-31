import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2166B - Tab Closing .
* Logic : 
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            long n = in.nextLong();
            if (a >= n * b) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }
        }
        in.close();
    }
}
