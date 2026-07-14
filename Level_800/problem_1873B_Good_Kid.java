import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1873B - Good Kid .
* Logic : Maximizes the array product by sorting elements and incrementing the smallest value by 1.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int testCases = in.nextInt();
                for( int j=0 ; j < testCases ; j++ ){
                    int size = in.nextInt();
                    int []numbers = new int[size];
                    
                    for( int i=0 ; i < size ; i++ ){
                        numbers[i] = in.nextInt();
                    }
                    Arrays.sort(numbers);
                    numbers[0]++;
                    int maxProduct = 1 ;
                    for(int num : numbers){
                        maxProduct *= num;
                    }
                    System.out.println( maxProduct );
                }
        in.close();
    }
}
