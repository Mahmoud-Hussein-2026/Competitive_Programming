import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 750A - New Year and Hurry .
* Logic : Calculate the total time available for solving problems (240 - k);Iterate through each problem from 1 to n,
* tracking the cumulative time;spent (i * 5).
* If the next problem fits within the remaining time,increment the count; otherwise, terminate the loop early.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int timeSpent = 0;
        int count = 0;
        for(int i=1;i<=n;i++){
           if(timeSpent+(i*5)<=(240-k)){
            timeSpent+=i*5;
            count++;
            }
            else{
            break;
            }
        }
        System.out.println(count);
      in.close();
    }
}
