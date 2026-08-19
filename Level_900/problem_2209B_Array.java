import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                int greater = 0;
                int smaller = 0;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] > a[i]) {
                        greater++;
                    } else if (a[j] < a[i]) {
                        smaller++;
                    }
                }
                int ans = Math.max(greater, smaller);
                System.out.print(ans + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}
