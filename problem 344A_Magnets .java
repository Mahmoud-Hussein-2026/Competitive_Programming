import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 344A _ Magnets .
* Logic : Initialize 'groups' counter at 1 , Loop through input magnets Compare current magnet with the previous one
 * if different, increment 'groups' counter.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int counter=1;
        int numbermagnets=in.nextInt();
        String previous=in.next();
        for(int i=0;i<numbermagnets-1;i++){
            String current=in.next();
            if(!current.equals(previous)){
                 counter++;
                 previous=current;
             }
         }
      System.out.println(counter);
        in.close();
     }
  }
