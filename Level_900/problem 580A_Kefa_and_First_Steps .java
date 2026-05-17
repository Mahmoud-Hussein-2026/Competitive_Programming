/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 580A - Kefa and First Steps .
* Logic : Used a greedy approach with an array tracking consecutive days;Increments 'current' as long as a[i] >= a[i-1], 
* resets to 1 when the streak breaks, and continuously updates 'max'.
* Site : Codeforces .
*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []a = new int[n];
        int max = 1;
        int current = 1;
        for(int i=0;i<n;i++){
           a[i]=in.nextInt();
           if(i>0){
             // Ensure we compare from the second element onward to avoid index out of bounds.
           if(a[i]>=a[i-1]){
               current++;
             // Streak continues: current element is greater than or equal to the previous one
           }
           else{
             // Streak broken: reset current count to 1 for the new subsegment
               current=1;
           }
           }
           if(current>max){
               max=current;
           }
        }
        System.out.println(max);
      in.close();
    }
}
