import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 96A_c  .
* Logic : Check if either team has 7 or more players standing in a row  .
* Data : 1 / 5 / 2026 .
* Site : Codeforces .
*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String s=in.next();
      // using String.contains() to check for 7 consecutive players .
        if(s.contains("0000000")||s.contains("1111111")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

      in.close();
    }
}
