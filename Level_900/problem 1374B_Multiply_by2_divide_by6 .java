import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1374B - Multiply by 2, divide by 6	 .
* Logic : Returns total moves as (countThrees - countTwos) + countThrees if number has no prime factors other than 2 and 3,
* and countThrees >= countTwos; otherwise, returns -1 .
* Site : Codeforces .
*/
public class Main {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();
          for( int j=0 ; j < testCases ; j++){
              int number = in.nextInt();
              int countTowS = 0;
              int countThreeS = 0;
            // Count how many times the number is divisible by 2.
              while(number % 2 == 0){
                  number /= 2;
                  countTowS++;
              }
            // Count how many times the number is divisible by 3 .
              while(number % 3 == 0){
                  number /= 3;
                  countThreeS++;
              }
            /*
            If remaining number isn't 1, it contains other prime factors (5,7....),
            Or If there are more 2s than 3s, it's impossible to balance them.
            */
              if(number != 1 || countTowS > countThreeS){
                System.out.println(-1);
              }
              else{
                  System.out.println( ( countThreeS - countTowS ) + countThreeS );
              }
    }
       in.close();
   }
}
