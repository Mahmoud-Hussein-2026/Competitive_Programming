import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  148A - Insomnia cure .
* Logic : Count dragon that are divisible by at least one of the four numbers (k,l,m,n) .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int damagedDragon =0;
        int k=in.nextInt();
        int l=in.nextInt();
        int m=in.nextInt();
        int n=in.nextInt();
        int totalDragon=in.nextInt();
        for(int i=1;i<=totalDragon;i++){
            if(i%k==0||i%l==0||i%m==0||i%n==0){
                damagedDragon++;
            }
        }
        System.out.println(damagedDragon);
      in.close();
    }
}
