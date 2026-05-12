import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 705A _ Hulk .
* Logic : The feelings alternate between "hate" and "love" starting with "hate",
* If it's the last layer, we append "it", otherwise we append "that" to connect layers .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
        if(i%2==0){
            System.out.print("I hate");
            if(i==n-1){
                 System.out.print(" it");
            }
            else{
                 System.out.print(" that ");
            }
        }
        else{
            System.out.print("I love");
             if(i==n-1){
                 System.out.print(" it");
            }
            else{
                 System.out.print(" that ");
            }
        }
        }
      in.close();
    }
}
