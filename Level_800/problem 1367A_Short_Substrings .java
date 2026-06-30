import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1367A - Short Substrings .
* Logic : Reconstructs the original string from its condensed substring representation
* by collecting characters at even indices and appending the final character
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases  = in.nextInt();
       for( int i=0 ; i<testCases ; i++ ){
           String encodedString = in.next();
              for(int j=0 ; j < encodedString.length() ; j++ ){
               if( j%2 == 0 ){
                   System.out.print( encodedString.charAt(j) );
               }
              }
              System.out.println( encodedString.charAt( (encodedString.length()-1) ) );
       }
      in.close();
    }
  }
