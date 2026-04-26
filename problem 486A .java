import java.util.Scanner;
/*
* This program calculates the sum of a specific sequence where odd numbers are subtracted 
* and even numbers are added .
* instead of using a slow loop , it uses a constant time mathematical formula .
* if n is even , result is n/2 . if n is odd , result is (-(n+1)/2) .
* Author : MAHMOUD HUSSEIN .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        if(n%2==0){
            System.out.println(n/2);
        }
            else{
                System.out.println(-(n+1)/2);
            }
    }
}
