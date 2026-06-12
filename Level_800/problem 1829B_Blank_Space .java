import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1829B - Blank Space .
* Logic : 
* Site : Codeforces .
  */
public class Main{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int testCases = in.nextInt();
for(int j=0;j<testCases;j++){
   int ArrayLength = in.nextInt();
   int []arr = new int[ArrayLength];
   int max = 0;
   int current = 0;
   for(int i=0;i<ArrayLength;i++){
      arr[i] = in.nextInt();
      if(arr[i]==0){
          current++;
          max = Math.max(max,current);
      }
      else{
          current = 0;
      }
   }
   System.out.println(max);
      }
  in.close();
    }
}
