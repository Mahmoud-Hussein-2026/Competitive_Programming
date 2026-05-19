import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 25A - IQ test .
* Logic : Finds the 1-based index of the single number that differs in evenness from the rest.
* It counts even and odd numbers on the fly without using an array,
* achieving O(n) time complexity and O(1) space complexity. .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
         int evenCount=0;
         int oddCount=0;
         int lastEvenIndex=0;
         int lastOddIndex=0;
        for(int i=1;i<=n;i++){
            int m=in.nextInt();
            if(m%2==0){
                evenCount++;
                lastEvenIndex=i;
            }
            else{
                oddCount++;
                lastOddIndex=i;
            }
        }
        if(evenCount==1){
            System.out.println(lastEvenIndex);
        }
        else{
            System.out.println(lastOddIndex);
        }
      in.close();
    }
}
