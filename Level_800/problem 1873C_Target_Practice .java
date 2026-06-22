import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1873C - Target Practice .
* Logic : Calculates the total score of a 10x10 target grid by finding the minimum distance from any 'X' to the grid edges.
* Site : Codeforces .
*/
public class Main {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();
         for( int i=0 ; i < testCases ; i++ ){
             int result = 0;
              for( int j=0 ; j < 10 ; j++ ){
                  String points = in.next();
                   for( int k=0 ; k < 10 ; k++ ){
                     // Calculate distances to the 4 edges of the 10x10 grid .
                       int n = j;
                       int s = 9-j;
                       int e = k;
                       int w = 9-k;
                     // The ring value corresponds to the minimum distance from the closest edge .
                       int ring = Math.min(n,Math.min(s,Math.min(e,w)))+1;
                     // Check if the current position is a successful hit ('X') .
                       if(points.charAt(k)=='X'){
                       result+=ring;
                       }
                   }
              }
              System.out.println(result);
         }
       in.close();
      }
   }
