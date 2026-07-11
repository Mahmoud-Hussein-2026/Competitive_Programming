import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 520B - Two Buttons .
* Logic : Reverse greedy approach, reducing target M to N by incrementing if odd and halving if even.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            long startValue = in.nextLong();
            long targetValue = in.nextLong();
            long clicks = 0 ;
      // Process backwards from targetValue to startValue.
            while(targetValue > startValue){
                if( targetValue%2 != 0){
                    targetValue++;
                }
                else{
                    targetValue /= 2;
                }
                clicks++;
            }
      // Add the remaining steps if targetValue drops below startValue.
            clicks += (startValue - targetValue);
            System.out.println(clicks);
        in.close();
    }
}
