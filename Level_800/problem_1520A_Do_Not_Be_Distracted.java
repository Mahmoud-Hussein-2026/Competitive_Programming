import java.util.Scanner;
import java.util.HashSet;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1520A - Do Not Be Distracted! .
* Logic : Check if a task reappears after switching to a different one using a HashSet to track previously visited tasks.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        while (testCases-- > 0) {
            int Length = in.nextInt();
            String tasks = in.next();
            HashSet <Character> visitedTasks = new HashSet<>();
            boolean suspicious = false;
            for (int i=0 ; i<Length ; i++){
                char current = tasks.charAt(i);
                if ( i>0 && current != tasks.charAt(i-1) ){
                    if( visitedTasks.contains(current) ){
                        suspicious = true;
                        break;
                    }
                }
                visitedTasks.add(current);
            }
            if(suspicious){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        in.close();
    }
}
