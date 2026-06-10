import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1512A - Spy Detected! .
* Logic : Finds the unique "spy" number in an array where all other elements are identical;
* Compares the first two elements to determine the common value, then locates and prints the 1-based index of the outlier.
* Site : Codeforces .
*/
public class Main{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int testCases = in.nextInt();
for(int j=0;j<testCases;j++){
    int arrayLength = in.nextInt();
   int []numbers = new int[arrayLength];
   for(int i=0;i<arrayLength;i++){
       numbers[i] = in.nextInt();
   }
   if(numbers[0]==numbers[1]){
   for(int i=2;i<arrayLength;i++){
       if(numbers[i]!=numbers[1]){
               System.out.println(i+1);
               break;
           }
       }
   }
   else{
        if(numbers[2]==numbers[1]){
             System.out.println(1);
        }
        else{
             System.out.println(2);
        }
   }
      }
  in.close();
    }
}
