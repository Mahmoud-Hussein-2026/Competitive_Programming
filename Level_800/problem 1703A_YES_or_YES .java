import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1703A - YES or YES?  .
* Logic : Read each string, convert it to lowercase to handle case-insensitivity, 
* and check if it equals "yes".
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String s=in.next();
            s=s.toLowerCase();
        if(s.equals("yes"))
    System.out.println("YES");
    else
     System.out.println("NO");
    }
    in.close();
}
}
