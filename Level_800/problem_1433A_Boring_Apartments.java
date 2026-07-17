import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1433A - Boring Apartments .
* Logic : Calculate the total key presses based on the apartment digit order and its number length.
* Site : Codeforces .
*/
 public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int apartmentNumber = in.nextInt();
            int apartmentDigit = apartmentNumber % 10;
            int numberLength = String.valueOf(apartmentNumber).length();
            int totalkeyPresses = 0;
            for ( int i=1 ; i < apartmentDigit ; i++ ){
                totalkeyPresses += 10;
            }
            for ( int i=1 ; i <= numberLength ; i++ ){
                totalkeyPresses += i;
            }
            System.out.println(totalkeyPresses);
        }
        in.close();
    }
}
