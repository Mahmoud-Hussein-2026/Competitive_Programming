import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1950A - Stair, Peak, or Neither? .
* Logic : Evaluates triplets of digits across test cases to classify them as an increasing STAIR,
* a peaked PEAK, or NONE using conditional checks.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
           int testCases = in.nextInt();
       for(int i=0 ; i<testCases ; i++){
            int firstDigit = in.nextInt();
            int secondDigit = in.nextInt();
            int thirdDigit = in.nextInt();
                if( firstDigit < secondDigit && secondDigit < thirdDigit ){
                 System.out.println("STAIR");
                }
                else if( firstDigit < secondDigit && secondDigit > thirdDigit ){
                    System.out.println("PEAK");
                }
                else{
                    System.out.println("NONE");
                }
        }
      in.close();
    }
}
