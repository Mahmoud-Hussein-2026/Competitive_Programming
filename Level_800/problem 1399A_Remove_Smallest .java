import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1399A - Remove Smallest .
* Logic : Sort the array and check for gaps larger than 1 between adjacent elements.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i=0;i<testCases;i++){
            int size = in.nextInt();
            int []numbers = new int[size];
            for(int j=0;j<size;j++){
                numbers[j] = in.nextInt();
            }
            Arrays.sort(numbers);
            boolean isPossible = true;
            for(int m=0;m<size-1;m++){
                if(numbers[m+1]-numbers[m]>1){
                    isPossible = false;
                    break;
                }
            }
            if(isPossible)
            System.out.println("YES");
            else
            System.out.println("NO");
                
            }
      in.close();
    }
}
