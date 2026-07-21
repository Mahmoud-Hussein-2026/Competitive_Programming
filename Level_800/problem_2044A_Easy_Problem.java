import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 2044A - Easy Problem .
* Logic : Find the count of positive integer pairs (a, b) such that a + b = n, which is always equal to n - 1.
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while (testCases-- > 0){
                int targetSum = in.nextInt();
                System.out.println(targetSum-1);
            }
        in.close();
    }
}
