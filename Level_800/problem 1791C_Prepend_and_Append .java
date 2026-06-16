import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1791C - Prepend and Append .
* Logic : Using a Two-Pointer approach to shrink the string from both ends as long as the characters are different.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();
        for( int j=0 ; j<testCases ; j++ ){
   int length = in.nextInt();
   String str = in.next();
   int left = 0;
   int right = length-1;
 // Shrink the string from both ends as long as the operations are valid .
   while( left<right && ( str.charAt(left) != str.charAt(right) ) ){
   left++;
   right--;
   length-=2;
   }
   System.out.println(length);
   }
      in.close();
   }
}
