import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 492A - Vanya and Cubes .
* Logic : Calculates the maximum pyramid height by iteratively accumulating the cubes needed for each level until the total available cubes are exhausted.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int totalCubes = in.nextInt();
            int maxHeight = 0 ;
            int levelIncrement = 1 ;
            int cubesNeededForLevel = 0 ;
            while(true){
                  cubes += levelIncrement ;
                  if( totalCubes >= cubesNeededForLevel ){
                      totalCubes -= cubesNeededForLevel ;
                      maxHeight++;
                      levelIncrement++;
                  }
                else{
                    break;
                }
            }
                System.out.println( maxHeight );
        in.close();
    }
}
