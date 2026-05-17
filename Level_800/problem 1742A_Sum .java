/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  1742A - Sum .
* Logic : Checks for each testcase if any single integer equals the sum of the ;
* other two integers using logical OR (||) and equality (==) operators.
* Site : Codeforces .
*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a==b+c||b==a+c||c==a+b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
      in.close();
    }
}
