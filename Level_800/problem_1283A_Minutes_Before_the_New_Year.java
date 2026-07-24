import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1283A - Minutes Before the New Year .
* Logic : Calculates remaining minutes until midnight by substracting elapsed time
* from total daily minutes (24 hours);
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while (testCases-- > 0){
                int hours = in.nextInt();
                int minutes = in.nextInt();
                System.out.println((24-hours)*60-minutes);
            }
        in.close();
    }
}
