import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  158B - Taxi .
* Logic : Uses a Greedy Approach by counting frequencies of group sizes (1 to 4).
* It pairs groups optimally (4s alone, 3s with 1s, 2s together) to minimize
* the number of taxis, achieving O(n) time complexity and O(1) space complexity.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(int i=0;i<n;i++){
            int m=in.nextInt();
            if(m==1)
            count1++;
            else if(m==2)
            count2++;
            else if(m==3)
            count3++;
            else{
            count4++;
            }
        }
       // Group of 4 needs a full taxi.
            sum+=count4;
      // Group of 3 needs a taxi and can take one person from group of 1 .
            sum+=count3;
            count1-=count3;
            if(count1<0){
                count1=0;
            }
      // Every two groups of 2 can share one taxi 
             sum+=count2/2;
            if(count2%2!=0){
                sum+=1;
                count1-=2;
            if(count1<0){
                count1=0;
            }
            }
      // pack remaining individuals into taxis (4 per taxi) ,ceiling division logic .
             if(count1>0){
            sum+=(count1+3)/4;
             }
            System.out.println(sum);
            
    }
}
