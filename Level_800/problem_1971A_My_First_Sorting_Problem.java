import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1971A - My First Sorting Problem .
* Logic : Output the minimum and maximum between two nummber using ( Mart ) .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0){
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.print( Math.min(num1,num2) + " " );
            System.out.println( Math.max(num1,num2) );
        }
        in.close();
    }
}
