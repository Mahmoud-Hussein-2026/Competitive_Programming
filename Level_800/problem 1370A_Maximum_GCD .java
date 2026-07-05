import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1370A - Maximum GCD .
* Logic : Finds the maximum possible GCD for any two distinct integers up to n, which is always achieved by flooring n/2.
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases = in.nextInt();
       for( int i=0 ; i < testCases ; i++ ){
           int elementsNumber = in.nextInt();
               System.out.println( elementsNumber/2 );
        }
        in.close();
    }
  }
