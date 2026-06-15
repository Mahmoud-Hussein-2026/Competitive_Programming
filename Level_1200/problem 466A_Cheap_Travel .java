import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 466A - Cheap Travel .
* Logic : Find the minimum cost by comparing buying only single tickets versus using optimal combinations of multi-ride tickets.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   int totalRides = in.nextInt();
   int ticketRides = in.nextInt();
   int a = in.nextInt();
      // a = single ticket price .
   int b = in.nextInt();
      // b = multi ticket price .
   if(a<=(float)b/ticketRides){
       System.out.println(totalRides*a);
   }
   else{
      int x = (( totalRides / ticketRides )*b)+(( totalRides % ticketRides )*a);
     // Calculate cost by buying maximum possible multi-ride tickets and covering the remaining rides with single tickets.
      int y = (( totalRides /ticketRides )+1)*b;
     // Calculate cost by buying one extra multi-ride ticket to cover all remaining rides completely.
           System.out.println( Math.min(x,y) );
       }
      in.close();
   }
}
