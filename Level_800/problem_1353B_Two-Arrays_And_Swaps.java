import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1353B - Two Arrays And Swaps .
* Logic : Maximize array 'a' sum by greedily swapping up to 'k' of its smallest elements with the largest elements of 'b' (if larger).
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int Arrays_Length = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[Arrays_Length];
            int[] b = new int[Arrays_Length];
            int totalSum = 0;
            for(int i=0 ; i < Arrays_Length ; i++){
                a[i] = in.nextInt();
                totalSum += a[i];
            }
            Arrays.sort(a);
            for(int i=0 ; i < Arrays_Length ; i++){
                b[i] = in.nextInt();
            }
            Arrays.sort(b);
            for(int i=0 ; i<k ; i++){
                if( b[ Arrays_Length - i - 1 ] > a[i] ){
                totalSum -= a[i];
                totalSum += b[ Arrays_Length - i - 1 ];
                }
                else{
                    break;
                }
            }
            System.out.println(totalSum);
        }
        in.close();
    }
}
