import java.util.Scanner;
import java.util.HashMap;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1890A - Doremy's Paint 3 .
* Logic : Determines if an array can be good by checking if it contains at most 2
* Distinct elements with a frequency difference of at most 1.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0){
            int n = in.nextInt();
            HashMap <Integer,Integer> freq = new HashMap<>();
            for (int i=0 ; i<n ; i++) {
                int currentNumber = in.nextInt();
                freq.put(currentNumber , freq.getOrDefault(currentNumber, 0) + 1);
            }
            if (freq.size() == 1){
                System.out.println("Yes");
            }
            else if(freq.size() == 2){
                int[] counts = new int[2];
                int index = 0;
                for (int count : freq.values()){
                    counts[index++] = count;
                }
                if (Math.abs(counts[0] - counts[1]) <= 1){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("No");
            }
        }
        
        in.close();
    }
}
