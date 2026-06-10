import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1760A - Medium Number .
* Logic : Finds the middle (median) number among three distinct integers;
* Calculates the total sum of the three numbers and subtracts both the maximum and minimum values to leave only the medium one.
* Site : Codeforces .
*/
public class Main{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int t = in.nextInt();
for(int j=0;j<t;j++){
   int a = in.nextInt();
   int b = in.nextInt();
   int c = in.nextInt();
   System.out.println((a+b+c)-Math.max(a,Math.max(b,c))-Math.min(a,Math.min(b,c)));
      }
  in.close();
    }
}
