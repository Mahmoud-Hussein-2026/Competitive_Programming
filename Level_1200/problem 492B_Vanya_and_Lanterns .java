import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  492B - Vanya and Lanterns .
* Logic : 
* 1. Sort the lantern positions in ascending order to measure adjacent gaps.
* 2. Calculate the maximum distance between any two adjacent lanterns,and divide it by 2 (since two neighboring lanterns share the gap).
* 3. Take the maximum value among:
* - The gap between the start of the street (0.0) and the first lantern.
* - The gap between the last lantern and the end of the street (l).
* - Half of the maximum distance between any two adjacent lanterns.
* Note: Use double data type for the array to ensure high floating-point precision,and avoid integer overflow on large test cases (like Test 4).
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long streetLength = in.nextLong();
        double []lanterns=new double[n];
        for(int i=0;i<n;i++){
            lanterns[i]=in.nextDouble();
        }
        Arrays.sort(lanterns);
        double mx=0;
        for(int i=0;i<n;i++){
          // Find the maximum gap between two consecutive lanterns, halved.
            if(i>0&&(lanterns[i]-lanterns[i-1])/2.0>mx){
            mx=(lanterns[i]-lanterns[i-1])/2.0;
        }
        }
      // Compare the maximum internal halved gap with the boundary gaps at both ends of the street.
        System.out.println(Math.max(mx,Math.max(lanterns[0],streetLength-lanterns[n-1])));
      in.close();
    }
}
