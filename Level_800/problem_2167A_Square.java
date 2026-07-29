import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 2167A - Square? .
* Logic : Checks whether four given side lengths are all equal to form a square.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while (testCases-- > 0){
                int side1 = in.nextInt();
                int side2 = in.nextInt();
                int side3 = in.nextInt();
                int side4 = in.nextInt();
                if(side1==side2 && side2==side3 && side3==side4){
                System.out.println("YES");
                }
                else{
                System.out.println("NO");
                }
            }
        in.close();
    }
}
