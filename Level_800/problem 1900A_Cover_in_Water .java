import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1900A - Cover in Water .
* Logic : { Determines the minimum water operations needed by printing 2 
* if three consecutive empty cells (...) exist to trigger infinite water generation,
* otherwise printing the total count of empty cells }.
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases  = in.nextInt();
       for( int i=0 ; i<testCases ; i++ ){
           int stringLength = in.nextInt();
           String cells = in.next();
           if(cells.contains("...")){
               System.out.println(2);
           }
           else{
               int emptyCellsCount = 0;
               for(int j=0 ; j < stringLength ; j++ ){
                   if(cells.charAt(j) == '.'){
                       emptyCellsCount++;
                   }
               }
               System.out.println(emptyCellsCount);
           }
       }
      in.close();
    }
  }
