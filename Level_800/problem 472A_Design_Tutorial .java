import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 472A - Design Tutorial: Learn from Math	 .
* Logic : Splits the number into two composite numbers using (4, n-4) for even numbers and (9, n-9) for odd numbers.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("4 " + (number - 4));
        } 
        else {
            System.out.println("9 " + (number - 9));
        }
        in.close();
    }
}
