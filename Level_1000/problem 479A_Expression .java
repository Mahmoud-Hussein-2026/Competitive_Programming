import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  479A - Expression .
* Logic : Calculate all possible combinations of ( + , * ) and brackets to find the maximum value  .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int maxResult=0;
        maxResult=Math.max(maxResult,a+b+c);
        maxResult=Math.max(maxResult,a+b*c);
        maxResult=Math.max(maxResult,a*b+c);
        maxResult=Math.max(maxResult,a*b*c);
        maxResult=Math.max(maxResult,(a+b)*c);
        maxResult=Math.max(maxResult,a*(b+c));
        System.out.println(maxResult);
      in.close();
    }
}
