import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1873A - Short Sort .
* Logic : Checks if a 3-character string can become "abc" using at most one swap by excluding invalid permutations ("bca", "cab").
* Site : Codeforces .
*/
public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i=0;i<testCases;i++){
        String word = in.next();
        if(word.equals("bca")||word.equals("cab")){
            System.out.println("No");
        }
        else{
         System.out.println("YES");
        }
    }
      in.close();
    }
}
