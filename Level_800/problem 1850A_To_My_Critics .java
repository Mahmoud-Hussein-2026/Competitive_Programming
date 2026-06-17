import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1850A - To My Critics .
* Logic : Find the maximum and minimum of the three digits. Calculate the middle value by subtracting the max and min from the total sum,
* then check if the sum of the two largest digits (max + middle) is greater than or equal to 10.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();
         for(int i=0;i<testCases;i++){
          int degit1 = in.nextInt();
          int degit2 = in.nextInt();
          int degit3 = in.nextInt();
          int maxDegit = Math.max(degit1,Math.max(degit2,degit3));
          int minDegit = Math.min(degit1,Math.min(degit2,degit3)); 
          int midDigit = (degit1 + degit2 + degit3) - maxDegit - minDegit;
          if(maxDegit+midDigit >= 10){
             System.out.println("YES");
          }
          else{
               System.out.println("NO");
          }
    }
      in.close();
   }
}
