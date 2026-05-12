import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 200B _ Drinks .
* Logic : Calculating the average percentage of orang juice by summing all  percentages and dividing by num .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        // read the number of drinks .
        double sum=0;
        // for loop to read each percentage and add it to the sum .
        for(int i=0;i<num;i++){
            // read the percentage of the current drink .
            int m=in.nextInt();
            sum+=m;
        }
        System.out.println(sum/num);
      in.close();
    }
}
