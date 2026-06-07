import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 339B - Xenia and Ringroad .
* Logic : Simulating Xenia's movement on a circular ringroad.
* Since travel is strictly clockwise,the distance is either (next - current) if the target house is ahead,
* or (next - current + n) if she has to wrap around to the next lap.
* Accumulating the total time in a 64-bit integer to prevent overflow. .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int totalHouses = in.nextInt();
        int totalTasks = in.nextInt();
        long result = 0;
        int current = 1;
        for(int i=0;i<totalTasks;i++){
           int next = in.nextInt();
        if(next>=current){
            result += next-current;
            current = next;
        }
        else{
        result += next-current+totalHouses;
        current = next;
        }
        }
         System.out.println(result);
      in.close();
    }
}
