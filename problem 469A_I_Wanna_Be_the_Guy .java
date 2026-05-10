import java.util.Scanner;
import java.util.HashSet;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 469A _ I Wanna Be the Guy.
* Logic : We use a HashSet to store all unique levels that both players can pass.
* Since a HashSet automatically handles duplicates;
* We simply check if the total number of unique levels in the set equals the required levels (n) .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    HashSet<Integer>levels=new HashSet<>();
    int xLevelsCount=in.nextInt();
    for(int i=0;i<xLevelsCount;i++){
        levels.add(in.nextInt());
    }
    int yLevelsCount=in.nextInt();
     for(int i=0;i<yLevelsCount;i++){
     levels.add(in.nextInt());
       }
       if(levels.size()==n){
           System.out.println("I become  the guy.");
       }
       else{
           System.out.println("Oh, my keyboard!");
       }
      in.close();
    }
}
