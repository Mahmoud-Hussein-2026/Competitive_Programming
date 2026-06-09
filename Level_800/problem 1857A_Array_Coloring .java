import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1857A - Array Coloring .
* Logic : A valid coloring requires both group sums to have the same parity.
* Mathematically,two numbers with identical parity always sum up to an EVEN total.
* Thus, the solution reduces to checking if the total array sum is EVEN (YES) or ODD (NO).
* Site : Codeforces .
*/
public class Main{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int testCases = in.nextInt();
for(int i=0;i<testCases;i++){
    int n = in.nextInt();
    int []numbers = new int[n];
    int sum = 0;
    for(int j=0;j<n;j++){
        numbers[j] = in.nextInt();
        sum+=numbers[j];
    }
if(sum%2==0){
    System.out.println("YES");
}
else{
System.out.println("NO");
}
}
  in.close();
}
}
