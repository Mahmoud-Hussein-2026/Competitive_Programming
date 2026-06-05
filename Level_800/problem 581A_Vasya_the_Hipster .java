import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 581A - Vasya the Hipster .
* Logic : Find the maximum days of wearing different socks using Math.min(), 
* then calculate the remaining same-color pairs using max and min divided by 2. .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
      // a == red socks.
        int b = in.nextInt();
      // b == blue socks.
        System.out.print(Math.min(a,b)+" "+(Math.max(a,b)-Math.min(a,b))/2);
    }
}
