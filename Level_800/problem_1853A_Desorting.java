import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1853A - Desorting .
* Logic : Find the minimum operations to desort the array by taking the minimum difference between adjacent elements (minDiff / 2 + 1).
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0){
            int arrayLength = in.nextInt();
            int []numbersArray = new int[arrayLength];
            for (int i=0 ; i<arrayLength ; i++){
                numbersArray[i] = in.nextInt();
            }
            boolean isSorted = true;
            int minDiff = Integer.MAX_VALUE;
            for (int i=0; i < arrayLength-1 ; i++){
                if( numbersArray[i] > numbersArray[i+1] ){
                    isSorted = false;
                    break;
                }
                minDiff = Math.min( minDiff, numbersArray[i+1] - numbersArray[i] );
            }
            if (!isSorted){
                System.out.println(0);
            }
            else{
                System.out.println( (minDiff/2) + 1 );
            }
        }
        in.close();
    }
}
