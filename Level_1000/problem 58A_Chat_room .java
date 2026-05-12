import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 58A _ Chat room .
* Logic : Searching for "hello" as a subsequence using a counter .
* Data : 1 / 5 / 2026 .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
     Scanner in=new Scanner(System.in);
     String n=in.next();
     String g="hello";
     int s=n.length();
     int d=0;
        // d is pointer for the "traget string (hello)" . 
     for(int i=0;i<s;i++){
         // match found for the current needed character .
         if(n.charAt(i)==g.charAt(d)){
             d++;
         }
         // all 5 characrers of "hello" found in order .
         if(d==5){
             System.out.println("YES");
           return;
         }
     }
         // if loop finishes without finding all characters .
             System.out.println("NO");
        in.close();
         
}
}
