import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  706B - Interesting drink .
* Logic :Use binary search (Upper Bound) on sorted prices to find the number of shops within the daily budget.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int shopCount = in.nextInt();
        int[] shopPrices = new int[shopCount];
        for (int i = 0; i < shopCount; i++) {
            shopPrices[i] = in.nextInt();
        }
        Arrays.sort(shopPrices);
        int daysCount = in.nextInt();
        for (int j = 0; j<daysCount; j++) {
            int dailyBudget = in.nextInt();
            int result = countShops(shopPrices, dailyBudget);
            System.out.println(result);
        }
        in.close();
    }
    public static int countShops(int[] shopPrices, int dailyBudget) {
        int low = 0;
        int high = shopPrices.length - 1;
        int count = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (shopPrices[mid] <= dailyBudget){
                count = mid + 1;
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }       
        return count;
    }
}
