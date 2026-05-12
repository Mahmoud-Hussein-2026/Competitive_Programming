import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 405A _ Gravity Flip .
* Logic : The gravity switch results in all cubes shifting to the right.
* This effectively means we need to sort the heights of the columns in ascending orde .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int cols=in.nextInt();
        int []columns=new int[cols];
        for(int i=0;i<cols;i++){
         columns[i]=in.nextInt();
           }
      // Sort the array to simulate the cubs shifting to the right .
        Arrays.sort(columns);
         for(int i=0;i<cols;i++){
        System.out.print(columns[i]+" ");
         }
        }
    }
