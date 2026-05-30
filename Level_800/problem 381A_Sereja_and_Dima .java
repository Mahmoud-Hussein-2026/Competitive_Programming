import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  381A - Sereja and Dima .
* Logic : 
Using the Two Pointers technique and a Greedy Strategy to simulate the game.
* Approach:
- Compare elements at 'left' and 'right' boundaries.
- The active player takes the maximum value, and the respective pointer moves inward.
- Alternating turns using a boolean flag until pointers meet.
* Variables:
- n: Total number of cards.
- arr: Array storing card values.
- left / right: Pointers for current boundaries (0 and n-1).
- f: Boolean flag for turns (true = Sereja, false = Dima).
- sereja / dima: Total score accumulators.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int left = 0;
        int right = n - 1; 
        boolean f = true;  
        
        int sereja = 0;
        int dima = 0;
        
        while (left <= right) {
            if (arr[left] >= arr[right]) {
                if (f) {
                    sereja += arr[left];
                } else {
                    dima += arr[left];
                }
                left++;
            } else {
                if (f) {
                    sereja += arr[right];
                } else {
                    dima += arr[right];
                }
                right--;
            }
            f = !f;
        }
        
        System.out.println(sereja + " " + dima);
      in.close();
    }
}
