/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  1352A - Sum of Round Numbers .
* Logic : To break down a number into its constituent "Round Numbers", we process it digit by digit from right to left using the modulo operator (number % 10).
* For each non-zero digit found, we multiply it by its current positional place value (1, 10, 100, etc.) to reconstruct the round component and store it in a dynamic list.
* Finally, we divide the number by 10 to shift to the next digit, and multiply the place value by 10 for the next iteration. .
* Site : Codeforces .
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int testCases=in.nextInt();
        for(int i=0;i<testCases;i++){
            ArrayList<Integer> list=new ArrayList<>();
            int placeValue=1;
             int number=in.nextInt();
             while(number>0){
             if(number%10!=0){
                list.add(placeValue*(number%10));
             }
                number/=10;
             placeValue*=10;
             }
             System.out.println(list.size());
             for(int j=0;j<list.size();j++){
                 System.out.print(list.get(j)+" ");
             }
             System.out.println();
        }
      in.close();
    }
}
