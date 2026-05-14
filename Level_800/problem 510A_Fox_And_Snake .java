/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  510A_Fox_And_Snake .
* Logic : Used (i % 2) for full snake body rows and (i % 4) to alternate the snake's tail position between far-right and far-left in empty rows .
* Site : Codeforces .
*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0){
                    System.out.print("#");
                }
                else{
                    if(i%4==1){
                        if(j==m-1){
                            System.out.print("#");
                        }
                        else{
                             System.out.print(".");
                        }
                    }
                    else{
                            if(j==0){
                            System.out.print("#");
                             }
                            else{
                             System.out.print(".");
                                }
                        }
                    }
                }
            System.out.println();
        }
        in.close();
    }
}
