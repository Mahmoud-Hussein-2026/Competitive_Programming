import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 432A - Choosing Teams .
* Logic : 
 * Problem: Find the maximum number of 3-member teams that can participate in the tournament at least 'k' more times.
 * Solution: Stream input to check if each student can add 'k' participations without exceeding the max limit (5), grouping every 3 eligible members into a team.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int studentsNumber  = in.nextInt();
          int requiredParticipations  = in.nextInt();
          int []participationCounts = new int[studentsNumber];
          int currentTeamSize = 0;
          int maxTeams = 0;
       for(int i=0 ; i<studentsNumber ; i++){
            participationCounts[i] = in.nextInt();
            if( ( participationCounts[i] + requiredParticipations ) <= 5){
                currentTeamSize++;
                if(currentTeamSize==3){
                   maxTeams++;
                   currentTeamSize = 0;
                }
            }   
        }
        System.out.println(maxTeams);
      in.close();
    }
}
