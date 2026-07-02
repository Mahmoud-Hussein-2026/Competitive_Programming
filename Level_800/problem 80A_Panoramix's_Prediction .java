import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 80A - Panoramix's Prediction .
* Logic : Start from n + 1 and increment sequentially until the next prime number is found.
* Then, compare this prime number with m. If they are equal, output "YES"; otherwise, output "NO".
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int currentPrime = in.nextInt();
        int targetNumber = in.nextInt();
        int nextPrime = currentPrime + 1;
      // Find the immediate next prime number greater than n
        while (!isPrime(nextPrime)) {
            nextPrime++;
        }
        // Check if the predicted next prime matches the calculated one
        if ( nextPrime == targetNumber ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    // Helper method to check if a number is prime using trial division up to sqrt (num) .
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
