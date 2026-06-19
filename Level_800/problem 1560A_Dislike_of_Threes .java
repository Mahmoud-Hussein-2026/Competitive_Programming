import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1560A - Dislike of Threes .
* Logic : Generates a sequence of numbers by filtering out any integer divisible by 3 or ending with the digit 3.
* Site : Codeforces .
*/
public class Main {
     public static int findElement(int n){
         int []likedNumbers = new int[targetNumber];
         int currentNumber = 0;
         for( int i=0; i<targetNumber ; currentNumber++){
             if(currentNumber%3==0||currentNumber%10==3){
              // Skip numbers that are divisible by 3 or end with 3 .
                 continue;
             }
           likedNumbers[i] = currentNumber;
           // Only move to the next position when a valid number is saved .
           i++;
         }
         return likedNumbers[targetNumber-1];
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();
          for(int j=0;j<testCases;j++){
              int targetNumber = in.nextInt();
    System.out.println(findElement(targetNumber));
    }
       in.close();
   }
}
