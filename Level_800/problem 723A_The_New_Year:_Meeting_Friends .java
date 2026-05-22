import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 723A - The New Year: Meeting Friends .
* Logic : The minimum total distance to meet is always the maximum coordinate minus the minimum coordinate (Max - Min)
* which happens when they meet at the middle point. .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
       int max=Math.max(x1,Math.max(x2,x3));
       int min=Math.min(x1,Math.min(x2,x3));
      // Calculate and print the minimum total travel distance.
       System.out.println(max-min);
      in.close();
    }
}
