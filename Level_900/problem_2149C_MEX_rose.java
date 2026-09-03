import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2149C - MEX rose .
* Logic : To set MEX to k, we must insert all missing values < k and remove/change all occurrences of k,
* taking max(missingCount, countK).
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            boolean [] isVisited = new boolean[n+1];
            int kFrequency = 0;
            for (int i=0 ; i < n ; i++) {
                int element = in.nextInt();
                if (element <= n) {
                    isVisited [element] = true;
                }
                if (element == k) {
                    kFrequency++;
                }
            }
            int missingBeforeK = 0;
            for (int i=0 ; i < k ; i++) {
                if (!isVisited[i]) {
                    missingBeforeK++;
                }
            }
            int minOperations = Math.max( missingBeforeK, kFrequency );
            System.out.println(minOperations);
        }
        in.close();
    }
}
