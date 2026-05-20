/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  141A - Amusing Joke .
* Logic : Concatenate the first two strings (guest and host names), 
* then convert both the combined string and the pile string into character arrays.
* Sort both arrays and check if they are identical. .
* Site : Codeforces .
*/
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String guestName=in.next();
        String hostName=in.next();
        String pile=in.next();
        guestName+=hostName;
        char [] arr1=guestName.toCharArray();
        Arrays.sort(arr1);
        char [] arr2=pile.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
      in.close();
    }
}
