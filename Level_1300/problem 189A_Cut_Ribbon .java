import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 189A - Cut Ribbon .
* Logic : Using an optimized 2-nested-loop Brute Force approach. Instead of checking all combinations of a, b, and c using 3 loops,
* We only iterate through possible piece counts for 'a' and 'b'.
* The required pieces for 'c' are directly calculated from the remaining ribbon length (rem = n - (x*a + y*b)).
* If the remainder is perfectly divisible by 'c', we compute the total pieces and maximize it.
* Early break condition is added to stop unnecessary inner iterations when total length exceeds 'n'.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int totalLength = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = 0;
        for(int x=0;x*a<=totalLength;x++){
            for(int y=0;y*b<=totalLength;y++){
                if(x*a+y*b>totalLength){
                    break;
                }
                int remainingLength = totalLength-(x*a+y*b);
                if(remainingLength%c == 0){
                int z = remainingLength/c;
                    int totalPices = x+y+z;
                    if(totalPices>max){
                        max = totalPices;
                    }
                }
            }
        }
        System.out.println(max);
      in.close();
    }
}
