import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2140B - Another Divisibility Problem .
* Logic : Chooses targetNumber = 999999999 - givenNumber to ensure givenNumber + targetNumber = 999999999,
* which directly divides the concatenated number.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        StringBuilder outputBuilder = new StringBuilder();
        for (int i=0 ; i < testCases ; i++) {
            long givenNumber = in.nextLong();
            long targetNumber = 999999999L - givenNumber;
            outputBuilder.append( targetNumber ).append("\n");
        }
        System.out.print( outputBuilder );
    }
}
