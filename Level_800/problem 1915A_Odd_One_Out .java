import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1915A - Odd One Out .
* Logic : Logic: The problem requires finding the unique number among three integers where two are identical.
* By comparing the first two numbers (a and b), if they are equal, the unique number must be c.
* If a equals c, then b is the unique one. Otherwise, if a is not equal to either, then a itself is the unique number.
* Site : Codeforces .
*/
public class Main{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int testCases = in.nextInt();
for(int j=0;j<testCases;j++){
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    if(a==b){
        System.out.println(c);
    }
    else if(a==c){
        System.out.println(b);
    }
    else{
         System.out.println(a);
    }
      }
  in.close();
    }
}
