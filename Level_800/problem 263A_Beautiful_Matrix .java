import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 263A _ Beautiful Matrix .
* Logic : Calculating the Manhattan distance from the position of 1 to the center of the matrix (2,2) .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
     Scanner in=new Scanner(System.in);
        int[][] arr=new int[5][5];
        for(int a=0;a<5;a++){
            for(int b=0;b<5;b++){
                arr[a][b]=in.nextInt();
            }
        }
        int rowdiff=0;
        int coldiff=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                // check if the current element is the number one .
                if(arr[i][j]==1){
                  rowdiff=Math.abs(i-2);
                  coldiff=Math.abs(j-2);
                    break;
                }
                
            }
        }
        // total moves = vertical moves + horizontal moves .
     System.out.println(rowdiff+coldiff);
        in.close();
    }
}
