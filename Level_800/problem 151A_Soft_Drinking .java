import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  151A - Soft Drinking .
* Logic : 
  1 - Objective : Find the maximum number of toasts that each individual friend can make equally.
  2 - Strategy  : Calculated total toasts possible per ingredient, found the minimum using Math.min(), and divided by n.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
      // Variables : n: friends,  k: bottles,  l: capacity,  c: limes,   d: slices,  p: salt,  nl required drink, np: salt per toast.
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();
        int nl = in.nextInt();
        int np = in.nextInt();
      // Calculate the total available toasts for each ingredient.
        int total=(k*l)/nl;
        int limes=c*d;
        int n3=p/np;
      // Find the minimum toasts possible and divide equally among friends.
        System.out.println((Math.min(total,Math.min(limes,n3)))/n);
      in.close();
    }
}
