import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1903A - Halloumi Boxes .
* Logic :
* - If the array is already sorted in non-decreasing order, no operations are needed (Output: YES).
* - If k >= 2, we can sort any array by reversing adjacent elements (Bubble Sort logic) (Output: YES).
* - If k == 1 and the array is not sorted, it's impossible to change any element's position (Output: NO). .
* Site : Codeforces .
*/
public class Main{
public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int i=0;i<t;i++){
        int n = in.nextInt();
        int k = in.nextInt();
        int []boxes = new int[n];
        for(int j=0;j<n;j++){
            boxes[j] = in.nextInt();
        }
        boolean isSorted = true;
      // Check if the array is already sorted .
        for(int m=0;m<n-1;m++){
            if(boxes[m]>boxes[m+1]){
                isSorted = false;
                break;
            }
        }
        if(k>1||isSorted){
            System.out.println("YES");
        }
        if(k==1&&!isSorted){
            System.out.println("NO");
        }
    }
    in.close();
    }
}
