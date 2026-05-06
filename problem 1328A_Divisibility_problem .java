import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1328A_Divisibility .
* Logic : Calculate the minimum steps to reach the next number divisible by 'b' without using loops .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
        for(int i=0;i<testCases;i++){
            long a=in.nextLong();
            long b=in.nextLong();
          // Case 1 : 'a' is already divisible by 'b'
            if(a%b==0){
            System.out.println(0);
            }
          // Case 2 : Calculate the difference needed to reach 'b*k'
            else{
            System.out.println(b-(a%b));
            }
        }
      in.close();
    }
}
