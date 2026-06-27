import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 9A - Die Roll .
* Logic : Calculates Dot's winning probability by finding the remaining winning outcomes out of 6 and prints the irreducible fraction.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
            int yakkoRoll = in.nextInt();
            int wakkoRoll = in.nextInt();
            int highestRoll = Math.max( yakkoRoll , wakkoRoll );
            int result = 6 - highestRoll + 1;
        if(result == 0){
            System.out.println("0/1");
        }
        else if(result == 1){
            System.out.println("1/6");
        }
        else if(result == 2){
            System.out.println("1/3");
        }
         else if(result == 3){
            System.out.println("1/2");
        }
         else if(result == 4){
            System.out.println("2/3");
        }
         else if(result == 5){
            System.out.println("5/6");
        }
         else {
            System.out.println("1/1");
        }
      in.close();
    }
}
