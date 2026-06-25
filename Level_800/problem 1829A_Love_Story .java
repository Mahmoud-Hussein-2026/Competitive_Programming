import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1829A - Love Story	 .
* Logic : Compares the input string with "codeforces" character by character to count the number of mismatched positions.
* Site : Codeforces .
*/
public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        String target_word = "codeforces";
        for( int i=0 ; i < testCases;  i++ ){
            String input_word = in.next();
            int difference_count = 0;
            for( int j=0 ; j < 10;  j++ ){
          if(input_word.charAt(j) != target_word.charAt(j)){
              difference_count++;
          }
            }
          System.out.println(difference_count);
      }
      in.close();
    }
}
