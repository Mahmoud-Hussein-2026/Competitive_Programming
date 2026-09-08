import java.util.*;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2258B1 - Carrot Chopdown (Easy Version) .
* Logic : Finds the maximum count of identical carrot lengths after at most one cut (k=1) 
* by either picking a cut size x to split all larger carrots or combining the top two frequency counts.
* Site : Codeforces .
*/
  public class Main {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        StringBuilder output = new StringBuilder();
        while (testCases-- > 0) {
            int carrotCount = in.nextInt();
            int maxCarrotLength = in.nextInt();
            int[] lengthFrequencies = new int[maxCarrotLength + 2];
            for (int i=0 ; i < carrotCount ; i++) {
                int cutPosition = in.nextInt();
                lengthFrequencies[cutPosition]++;
            }
            long[] suffix = new long[maxCarrotLength + 2];
            for (int x = maxCarrotLength ; x >= 1 ; x--) {
                suffix[x] = suffix[ x + 1] + lengthFrequencies[x];
            }
            long case1 = 0;
            for (int x = 1 ; x <= maxCarrotLength ; x++) {
                long val = suffix[x] + (2 * x <= maxCarrotLength ? lengthFrequencies[2 * x] : 0);
                case1 = Math.max(case1, val);
            }
            long top1 = 0, top2 = 0;
            for (int v = 1 ; v <= maxCarrotLength ; v++) {
                if (freq[v] > top1) {
                    top2 = top1;
                    top1 = lengthFrequencies[v];
                }
                else if (lengthFrequencies[v] > top2) {
                    top2 = lengthFrequencies[v];
                }
            }
            long ans = Math.max(case1, top1 + top2);
            output.append(ans).append("\n");
        }
        System.out.print(output);
      in.close();
    }
}
