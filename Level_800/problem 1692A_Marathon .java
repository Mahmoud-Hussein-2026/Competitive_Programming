import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1692A - Marathon .
* Logic : Count how many participants have strictly greater distances than Timur.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i=0;i<testCases;i++){
            int count = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if(b>a)
            count++;
            if(c>a)
            count++;
            if(d>a)
            count++;
            System.out.println(count);
        }
      in.close();
    }
}
