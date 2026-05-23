import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  230B - T-primes .
* Logic : T-prime number has exactly 3 divisors, which means it must be a perfect square 
* of a prime number. To optimize time and avoid TLE, a Sieve of Eratosthenes is precomputed 
* up to 1,000,000. For each query, we verify if its square root is an integer and 
* check its primality using the sieve in O(1) time.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
      // Precompute prime numbers up to 10^6 using Sieve of Eratosthenes to process queries efficiently.
        boolean []isPrime=new boolean[1000010];
        java.util.Arrays.fill(isPrime,true);
        isPrime[0]= false;
        isPrime[1]= false;
        for(int i=2;i*i<=1000000;i++){
          // Check if the number is a perfect square AND its square root is prime.
            if(isPrime[i]){
              // Mark all multiples of i as composite (not prime).
                for(int j=i*i;j<=1000000;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int totalNumbers=in.nextInt();
         for(int k=0;k<totalNumbers;k++){
             long num = in.nextLong();
           // Check if the number is a perfect square AND its square root is prime.
             long sqrt=(long)Math.sqrt(num);
         if( sqrt*sqrt==num && sqrt<1000010 && isPrime[(int)sqrt] ){
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }

         }
      in.close();
}
}
