import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 279B - Books .
* Logic : Find the maximum length of a contiguous subarray whose sum does not exceed 't' using the Sliding Window technique.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int t = in.nextInt();
         int []books = new int[n];
         for(int i=0;i<n;i++){
           books[i] = in.nextInt();
         }
    int left = 0;
    int Sum = 0;
    int maxBoox=0;
    for(int right=0;right<n;right++){
      // Expand the window by adding the current book's time to the sum .
        Sum += books[right];
      // If the sum excceeds the allowed time 't' shrink the window from the left .
    while(Sum > t){
      // Remove the leftmost book's time and move the left pointer forward .
        Sum -=books[left];
        left++;
    }
      // Calculate the current window size and update the maximum number of books found .
    maxBoox = Math.max(maxBoox,(right-left+1));
    }
    System.out.println(maxBoox);
      in.close();
   }
}
