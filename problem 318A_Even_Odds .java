import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 318A _ Even Odds .
* Logic : Use math formulas instead of loops for fast execution; .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long k=in.nextLong();
        long result=0;
        long s=0;
      // Calculate the count of odd numbers in the sequence;
        if(n%2==0){
            s=n/2;
        }
        else{
            s=(n/2)+1;
        }
        if(k<=s){
          // If k is within the odd numbers section.
            result=(2*k)-1;
        }
        else{
          // nk : relative position;
            long nk=k-s;
           // If k is within the even numbers section.
            result=nk*2;
        }
        System.out.println(result);
      in.close();
    }
}
