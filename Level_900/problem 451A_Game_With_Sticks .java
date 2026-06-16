import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 451A - Game With Sticks .
* Logic : The game ends when the smaller number of sticks runs out, so the winner is determined by whether min(n, m) is odd or even.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int rows = in.nextInt();
         int columns = in.nextInt();
          if(Math.min(rows,columns)%2==0){
           System.out.println("Malvika");
         }
          else{
             System.out.println("Akshat");
         }
      in.close();
   }
}
