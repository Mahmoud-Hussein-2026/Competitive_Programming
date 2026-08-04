import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1862B - Sequence Game .
* Logic : Reconstruct sequence 'a' from 'b' by duplicating b[i] whenever b[i] < b[i-1] to fix sequence drops.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int[] reducedArray = new int[n];
            for(int i=0 ; i<n ; i++){
                reducedArray[i] = in.nextInt();
            }
            List <Integer> originalSequence = new ArrayList<>();
            originalSequence.add(reducedArray[0]);
            for(int i=1 ; i<n ; i++){
              // If sequence drops, insert element twice to bypass Vika's filter rule
                if( reducedArray[i] < reducedArray[i-1]){
                    originalSequence.add(reducedArray[i]);
                }
                originalSequence.add(reducedArray[i]);
            }
            System.out.println(a.size());
            for (int val : originalSequence){
            System.out.print(val + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
