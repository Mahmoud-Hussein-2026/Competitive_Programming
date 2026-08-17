import java.util.Scanner;
import java.util.ArrayList;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 2216A - Course Wishes .
* Logic : ​Iterate through priority levels from k down to 1 and incrementally promote each course to level k + 1 while recording operations.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int totalCourses = in.nextInt();
            int maxLevels = in.nextInt();
            int[] capacities = new int[k+1];
            for (int i=1 ; i <= maxLevels ; i++) {
                capacities[i] = in.nextInt();
            }
            int[] CourseLevels = new int[totalCourses + 1];
            for (int i=1 ; i <= totalCourses ; i++) {
                CourseLevels[i] = in.nextInt();
            }
            ArrayList <Integer> operations = new ArrayList<>();
            for (int level = maxLevels ; level >= 1 ; level--) {
                for (int i=1 ; i <= totalCourses ; i++) {
                    if (CourseLevels[i] == level) {
                        while (CourseLevels[i] < maxLevels + 1) {
                            CourseLevels[i]++;
                            operations.add(i);
                        }
                    }
                }
            }
            System.out.println(operations.size());
            for (int i=0 ; i < operations.size() ; i++) {
                System.out.print(operations.get(i) + (i == operations.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
      in.close();
    }
}
