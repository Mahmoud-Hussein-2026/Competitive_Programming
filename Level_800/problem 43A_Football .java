import java.util.Scanner;
import java.util.ArrayList;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 43A - Football .
* Logic of Solution : Given a sequence of goals, determine the winning football team that scored the most goals.
* Count the occurrences of each team using a nested loop and track the team with the maximum frequency.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
           int numberTeams  = in.nextInt();
           ArrayList <String> teams = new ArrayList <>();
       for( int i = 0 ; i < numberTeams ; i++ ){
            String team = in.next();
            teams.add(team);
        }
        int max = 0;
        String current = null;
        for( String i : teams){
            int count = 0;
            for( String j : teams) {
                if( j.equals(i) ) {
                    count++;
                }
            }
                if( count > max ){
                    max=count;
                    current=i;
                }
        }
        System.out.println(current);
      in.close();
    }
}
