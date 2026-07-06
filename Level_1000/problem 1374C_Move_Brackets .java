import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1374C - Move Brackets .
* Logic : Scan the string to cancel out valid pairs '()';
* unmatched closing brackets require moves.
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases = in.nextInt();
       for( int i=0 ; i < testCases ; i++ ){
           int sequenceLength = in.nextInt();
           String sequence = in.next();
           int open = 0 ;
           int moves = 0 ;
           for( int j=0 ; j < sequenceLength ; j++ ){
               if(sequence.charAt(j) == '('){
                   open++;
               }
               else{
                   if(open > 0){
                       open--;
                   }
                   else{
                       moves++;
                   }
               }
           }
               System.out.println(moves);
        }
        in.close();
    }
  }
