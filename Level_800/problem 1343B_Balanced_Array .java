import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1343B - Balanced Array .
* Logic : Checks if n/2 is even, then outputs n/2 consecutive evens followed by (n/2)-1 consecutive odds balanced by a calculated last element.
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases = in.nextInt();
       for( int t=0 ; t < testCases ; t++ ){
           int n = in.nextInt();
           if(n % 4 != 0){
               System.out.println("NO");
           }
           else{
               System.out.println("YES");
               int currentEven = 2;
               for( int i=0 ; i < n/2 ; i++ ){
               System.out.print(currentEven +" ");
               currentEven += 2;
               }
               int currentOdd = 1;
               for( int i=0 ; i < (n/2)-1 ; i++ ){
               System.out.print(currentOdd +" ");
               currentOdd += 2;
               }
               int lastElement = (3*n/2)-1 ;
               System.out.println(lastElement);
           }
        }
        in.close();
    }
  }
