/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1335A - Candies and Two Sisters .
* Logic : Calculate the number of ways to distribute 'n' candies between two sisters
* such that Alice always gets more than Betty (a > b and a + b = n).
* The mathematical formula (n-1)/2 using integer division directly gives the count of valid pairs.
* Site : Codeforces .
*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int textCasesCount=in.nextInt();
        for(int i=0;i<textCasesCount;i++){
            int totalCandies=in.nextInt();
            System.out.println((totalCandies-1)/2);
        }
      in.close();
    }
}
