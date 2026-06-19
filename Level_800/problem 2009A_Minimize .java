import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 2009A - Minimize! .
* Logic : Find the minimum value of (c - a) + (b - c),The phrase should be as short as possible.
* which mathematically simplifies to just (b - a) as 'c' cancels out.
* Site : Codeforces .
*/
public class Main{
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();
          for( int j=0 ; j < testCases ; j++){
              int number1 = in.nextInt();
              int number2 = in.nextInt();
    System.out.println(number2-number1);
    }
    in.close();
   }
}
