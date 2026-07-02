import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 703A - Mishka and Game .
* Logic : Iterate through n rounds, compare the dice rolls for both players in each round, and increment the respective win counter.
* Finally, compare the total round wins to determine the overall game winner or a draw.
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int roundsCount = in.nextInt();
          int mishkaWins = 0;
          int chrisWins = 0;
       for( int i=0 ; i  <roundsCount ; i++ ){
           int mishkaRoll = in.nextInt();
           int chrisRoll = in.nextInt();
           if( mishkaRoll > chrisRoll ){
               mishkaWins++;
           }
           else if( mishkaRoll < chrisRoll ){
              chrisWins++; 
           }
       }
       if(mishkaWins > chrisWins){
           System.out.println("Mishka");
           }
           else if(mishkaWins < chrisWins){
           System.out.println("Chris");
           }
           else{
           System.out.println("Friendship is magic!^^");
           }
      in.close();
    }
  }
