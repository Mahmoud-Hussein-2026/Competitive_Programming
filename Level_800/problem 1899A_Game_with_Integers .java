import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  1899A - Game with Integers .
* Logic : Vanya (First) can win in 1 move if the number 'm' isn't already a multiple of 3,by either adding or subtracting 1.
* If 'm' is already a multiple of 3,Vova (Second) can always counter Vanya's moves to maintain it, so Vova wins.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCases= in.nextInt();
        for(int i=0;i<testCases;i++){
            int currentNumber = in.nextInt();
           if(currentNumber%3==0){
               System.out.println("Second");
           }
           else{
               System.out.println("First");
           }
        }
      in.close();
    }
}
