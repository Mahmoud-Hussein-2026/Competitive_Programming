import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  337A_Puzzles .
* Logic : To minimize the difference between the largest and smallest puzzle sizes,given to 'n' students, the puzzle sizes array is sorted in ascending order;
* A sliding window approach of fixed size 'n' is then used to scan the array;For each window, the difference between the last and first element is calculated;
* and the global minimum difference is tracked and returned in O(M log M) time.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int studentCount =in.nextInt();
        int puzzlesCount=in.nextInt();
        int arr[]=new int[puzzlesCount];
        for(int j=0;j<puzzlesCount;j++){
            arr[j]=in.nextInt();
        }
      // Sort sizes in ascending order to bring closest numbers adjacent to each other.
         Arrays.sort(arr);
      // Initialize the minimum difference with the maximum possible value.
         int min=(Integer.MAX_VALUE);
      // Iterate through the sorted array using a sliding window of size n.
         for(int i=0;i<=puzzlesCount-studentCount;i++){
      // Calculate the difference between the maximum and minimum in the current window.
             int difference=arr[i+studentCount-1]-arr[i];
             min=Math.min(min,difference);
            
         }
         System.out.println(min);
      in.close();
    }
}
