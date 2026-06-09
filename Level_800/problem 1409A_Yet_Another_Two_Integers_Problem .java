import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1409A - Yet Another Two Integers Problem .
* Logic :To minimize moves, always greedily change by 10.
* The minimum moves required is the absolute difference between 'a' and 'b' divided by 10.
* If there is a remainder, one additional smaller move (1 to 9) is needed to bridge the exact gap.
* Site : Codeforces .
*/
public class Main{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int testCases = in.nextInt();
for(int i=0;i<testCases;i++){
    int a = in.nextInt();
  // a == start value .
    int b = in.nextInt();
  // b == target value .
    if(a==b){
        System.out.println(0);
    }
    else{
    int difference = Math.abs(a-b);
      // calculate the absolute distance between the two numbers .
    if(difference%10==0){
        System.out.println(difference/10);
    }
    else{
        System.out.println((difference/10)+1);
    }
    }
}
  in.close();
}
}
