import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1985A - Creating Words .
* Logic : Swaps the first characters of two 3-letter strings by extracting and reconstructing them using charAt().
* Site : Codeforces .
*/
public class Main {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();
         for( int i=0 ; i < testCases ; i++ ){
             String word1 = in.next();
             String word2 = in.next();
             System.out.println(""+word2.charAt(0)+word1.charAt(1)+word1.charAt(2)+
                              " "+ word1.charAt(0)+word2.charAt(1)+word2.charAt(2));
         }
       in.close();
      }
   }
