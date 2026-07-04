import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1722A - Spell Check .
* Logic : Checks if the string is a valid permutation of "Timur" by ensuring its length is 5 ;
* and comparing its sorted characters with the sorted target "Timru".
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases = in.nextInt();
       for( int i=0 ; i < testCases ; i++ ){
           int nameLength = in.nextInt();
           String inputName = in.next();
           if(nameLength != 5){
               System.out.println("NO");
                continue;
           }
           char []nameChars = inputName.toCharArray();
           Arrays.sort(nameChars);
           String sortedName = new String(nameChars);
           if(sortedName.equals("Timru")){
              System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }
      in.close();
      }
  }
