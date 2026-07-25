import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1676B - Equal Candies .
* Logic : Find the minimum candy count among all boxes and subtract (n * min) from the total sum of candies.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0){
            int boxesCount = in.nextInt();
            long totalCandies = 0;
            long minCandies = Long.MAX_VALUE;
            for (int i=0 ; i < boxesCount ; i++) {
                long Candies = in.nextLong();
                totalCandies += Candies;
                if (Candies < minCandies) {
                    minCandies = Candies;
                }
            }
            long result = totalCandies - (boxesCount * minCandies);
            System.out.println(result);
        }
        in.close();
    }
}
