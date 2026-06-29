import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 363B - Fence .
* Logic : Find the starting 1-based index of k consecutive planks with the minimal sum using the Sliding Window technique.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int totalPlanks  = in.nextInt();
          int windowSize  = in.nextInt();
          int []plankHeights = new int[n];
          int index = 1;
          long minSum = 1000000000;
          long currentSum = 0;
      // Read input heights and calculate the sum of the very first window .
       for( int i=0 ; i<totalPlanks ; i++ ){
          plankHeights[i] = in.nextInt();
          if(i<windowSize){
              currentSum += plankHeights[i];
          }
         
       }
      // Initialize minSum with the first window's sum .
       minSum = currentSum;
      // Slide the window across the remaining planks .
       for( int i=windowSize ; i<totalPlanks ; i++ ){
            currentSum += plankHeights[i];
            currentSum -= plankHeights[(i-windowSize)];
         // Update the minimum sum and the 1-based starting index if a smaller sum is found .
            if(currentSum < minSum){
            minSum=currentSum;
            index = i- windowSize +2;
         }
    }
    System.out.println(index);
      in.close();
}
}
