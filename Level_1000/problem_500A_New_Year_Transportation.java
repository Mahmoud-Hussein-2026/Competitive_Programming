import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 500A - New Year Transportation .
* Logic : Simulates path traversal by jumping forward iteratively from the current cell using portal step values until reaching or passing the target cell 't'.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                int totalCells = in.nextInt();
                int targetCell = in.nextInt();
                int []steps = new int[ totalCells + 1 ];
                int current = 1 ;
                for( int j=1 ; j < totalCells ; j++ ){
                     steps[j] = in.nextInt(); 
                }
      // Traverse the grid sequentially using the portal jumps
                while( current < targetCell ){
                     current += steps[current] ;
                }
      // Check if we successfully landed exactly on the destination cell
                if(current == targetCell){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
        in.close();
    }
}
