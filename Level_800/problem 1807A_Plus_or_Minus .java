import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1807A - Plus or Minus .
* Logic : Check if the sum of the first two numbers equals the third; if so, print '+', otherwise print '-'.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i=0;i<testCases;i++){
            int fistNumber = in.nextInt();
            int secondNumber = in.nextInt();
            int resultNumber = in.nextInt();
            if(fistNumber+secondNumber==resultNumber){
                System.out.println('+');
            }
            else
            System.out.println('-');
        }
      in.close();
    }
}
