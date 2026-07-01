import java.util.Scanner;
import java.util.HashSet;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1703B - ICPC Balloons .
* Logic : Calculates total balloons by awarding 2 for each unique solved problem (tracked via HashSet) and 1 for repeated solutions.
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases  = in.nextInt();
       for( int i=0 ; i<testCases ; i++ ){
           HashSet <Character> contests = new HashSet <>();
           int contestsNumber = in.nextInt();
           String contestsString = in.next();
         // Store each solved problem in a HashSet to automatically identify duplicates
           for( int j=0 ; j<contestsNumber ; j++ ){
               contests.add( contestsString.charAt(j) );
           }
         // Formula: 2 balloons for each unique problem + 1 balloon for every additional submission
           int result =( (contests.size()*2) + ( contestsNumber-contests.size() ) );
           System.out.println( result );
       }
      in.close();
    }
  }
