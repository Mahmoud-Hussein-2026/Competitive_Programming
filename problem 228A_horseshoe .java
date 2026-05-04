import java.util.Scanner;
import java.util.HashSet;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 228A _ Is your horseshoe on the other hoof .
* Logic : Using a HashSet to store unique horseshoe colors and calculating
* the difference from 4 to find the minimum number of shoes to buy .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
     HashSet<Integer> set=new HashSet<>();
     int color1=in.nextInt();
     int color2=in.nextInt();
     int color3=in.nextInt();
     int color4=in.nextInt();
     set.add(color1);
      set.add(color2);
       set.add(color3);
        set.add(color4);
       int shoes_to_buy =4-set.size();
       System.out.println(shoes_to_buy);
        in.close();
    }
}
