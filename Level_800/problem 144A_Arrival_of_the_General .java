import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  144A - Arrival of the General .
* Logic : Move the first occurrence of the maximum height to the front ;
* and the last occurrence of the minimum height to the back .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int heights[]=new int[n];
        int max=0;
        int min=100;
        int indexMax=0;
        int indexMin=0;
        for(int i=0;i<n;i++){
           heights[i]=in.nextInt();
            if(heights[i]>max){
                max=heights[i];
                indexMax=i;
            }
         if(heights[i]<=min){
                min=heights[i];
                 indexMin=i;
            }
        }
      // Calculate steps for max to reach index 0 and min to reach index n-1
    int result=indexMax+(n-1-indexMin);
      // If max is to the right of min,they will cross each other (saving 1 swap) .
         if(indexMax>indexMin){
             result-=1;
         }   
         System.out.println(result);
      in.close();
        }
    }
