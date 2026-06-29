import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1858A - Buttons .
* Logic : Determine the winner based on optimal turns, where an odd number of shared buttons gives Anna a +1 advantage.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases  = in.nextInt();
       for( int i=0 ; i < testCases ; i++ ){
         long annaButtons = in.nextLong();
         long katieButtons = in.nextLong();
         long sharedButtons = in.nextLong();
         if(sharedButtons%2==0){
             if(annaButtons > katieButtons){
             System.out.println("First");
             }
             else{
             System.out.println("Second");
             }
         }
         else{
             if((annaButtons+1) > katieButtons){
             System.out.println("First");
             }
             else{
             System.out.println("Second");
             }
         }
        }
      in.close();
    }
}
