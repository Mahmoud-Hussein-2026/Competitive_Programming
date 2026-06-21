import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 455A - Boredom .
* Logic : 
* Site : Codeforces .
*/
public class Main {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int arrayLength = in.nextInt();
       // count[x] stores how many times the number x appears (Constraints: x <= 100000) .
         long []count = new long[100005];
       // Iteratively compute the optimal choice for each number .
          for( int i=0 ; i < arrayLength ; i++ ){
              int x = in.nextInt();
               count[x]++;
              }
       // dp[i] stores the maximum points achievable considering numbers from 0 to i .
         long []dp = new long[100005];
         dp[0] = 0;
         dp[1] = 1*count[1];
         for( int j=2 ; j <= 100000 ; j++ ){
             long skipCurrent = dp[j-1];
             long takeCurrent = dp[j-2] + ((long)j*count[j]);
             dp[j] = Math.max(skipCurrent,takeCurrent);
         }
           System.out.println(dp[100000]);
       in.close();
      }
   }
