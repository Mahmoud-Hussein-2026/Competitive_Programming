import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1154A - Restoring Three Numbers .
* Logic : ( Since all three original numbers (a, b, c) are positive, the sum of all three numbers (a + b + c) must strictly be the largest value among the four inputs.
* By storing the inputs in an array and sorting it in ascending order, the largest value (the total sum) will always be at the last index (index 3).
* The other three elements will represent the pairwise sums (a+b, a+c, b+c).
* Subtracting each of the first three elements from the total sum yields the three original numbers ) .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int []numbers = new int[4];
        numbers[0] = in.nextInt();
        numbers[1] = in.nextInt();
        numbers[2] = in.nextInt();
        numbers[3] = in.nextInt();
        Arrays.sort(numbers);
        System.out.print(numbers[3]-numbers[2]+" ");
        System.out.print(numbers[3]-numbers[1]+" ");
        System.out.print(numbers[3]-numbers[0]);
      in.close();
    }
}
