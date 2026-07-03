import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 34B - Sale .
* Logic : Maximizes earnings by sorting prices and accumulating the absolute value of up to M negative prices (maximum available capacity).
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int totalTVs = in.nextInt();
          int maxCarryLimit = in.nextInt();
          int []tvPrices = new int[totalTVs];
          int totalMoney = 0 ;
       for( int i=0 ; i < totalTVs ; i++ ){
           tvPrices[i] = in.nextInt();
       }
       Arrays.sort(tvPrices);
       for( int i=0 ; i < maxCarryLimit ; i++ ){
       if(tvPrices[i] < 0){
           totalMoney+=Math.abs(tvPrices[i]);
           }
    }
    System.out.println(totalMoney);
      in.close();
    }
  }
