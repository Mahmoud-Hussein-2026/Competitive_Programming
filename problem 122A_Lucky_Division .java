import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 122A _ Lucky Division .
* Logic : Checking if num is divisible by a predefined list of lucky numbers (4,7) .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
     Scanner in=new Scanner(System.in);
     int[]arr={4,44,444,7,77,777,47,447,74,774,477,744,474,747};
      // predefined list of lucky numbers up to 1000 .
     int num=in.nextInt();
     boolean m=false;
      // Flag to check if num is almost lucky .
     for(int i=0 ; i < arr.length ; i++){
       // check divisibillity .
         if(num % arr[i]== 0){
             m=true;
             break;
             // Add break to stop the loop after finding a lucky divisor
         }
     }
     if(m){
        System.out.println("YES");
     }
     else {
       System.out.println("NO");
     }
      in.close();
    }
}
