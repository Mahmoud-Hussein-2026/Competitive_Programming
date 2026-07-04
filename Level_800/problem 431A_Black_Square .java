import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 431A - Black Square .
* Logic : Calculates the total calories burned by mapping each character of the game sequence string to its corresponding strip's calorie cost.
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int a1 = in.nextInt();
          int a2 = in.nextInt();
          int a3 = in.nextInt();
          int a4 = in.nextInt();
          String gameSequence = in.next();
          long totalCaloriesBurned = 0 ;
       for( int i=0 ; i < gameSequence.length() ; i++ ){
           if(gameSequence.charAt(i) == '1'){
               totalCaloriesBurned+=a1;
           }
           else if(gameSequence.charAt(i) == '2'){
               totalCaloriesBurned+=a2;
           }
           else if(gameSequence.charAt(i) == '3'){
               totalCaloriesBurned+=a3;
           }
           else{
               totalCaloriesBurned+=a4;
           }
               }
    System.out.println(totalCaloriesBurned);
      in.close();
      }
  }
