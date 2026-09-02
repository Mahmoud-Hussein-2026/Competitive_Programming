import java.io.*;
import java.util.*;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2157B - Expansion Plan 2 .
* Logic : Checks if total '4' operations can cover the remaining distance to (x, y)
* after using '8' operations to reduce both coordinates simultaneously.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            String s = br.readLine().trim();
            long count4 = 0, count8 = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '4') a++;
                else count8++;
            }
            long absX = Math.abs(x);
            long absY = Math.abs(y);
            long remX = Math.max(0, absX - count8);
            long remY = Math.max(0, absY - count8);
            sb.append(remX + remY <= count4 ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}
