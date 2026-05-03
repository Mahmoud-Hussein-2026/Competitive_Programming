import java.util.Scanner;
import java.util.Arrays;
/*
* problem : 160A_Twins.
* Goal : find the minimum coins to get more than half of the total sum.
* Site : codeforces.
* Logic : pick the largest coins first to minimize the count.
* Auther : Mahmoud Hussein.
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int totalcoins=0;
        int takensum=0;
      // sum of coins i take 
        int counter=0;
      // counter of coins i take 
        int coinvalues[]=new int[n];
        for(int i=0;i<n;i++){
            coinvalues[i]=in.nextInt();
            totalcoins+=coinvalues[i];
        }
      // Sort coins to pick the largest ones easily.
        Arrays.sort(coinvalues);
      // Start taking coins from the largest to the smallest.
        for(int j=n-1;j>=0;j--){
            takensum+=coinvalues[j];
            counter++;
          // Stop if my sum is strictly greater than the rest.
            if(takensum>(totalcoins-takensum)){
            System.out.println(counter);
            break;
            }
        }
      in.close();
    }
}
