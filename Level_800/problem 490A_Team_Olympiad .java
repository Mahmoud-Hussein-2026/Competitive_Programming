import java.util.Scanner;
import java.util.ArrayList;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 490A - Team Olympiad .
* Logic : Form maximum unique teams of 3 distinct talents by grouping student indices and taking the minimum size.
* Site : Codeforces .
*/
public class Main {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> programmers = new ArrayList <>();
        ArrayList <Integer> mathematicians = new ArrayList <>();
        ArrayList <Integer> sportsmen = new ArrayList <>();
        int childNumber = in.nextInt();
      // Group student 1-based indices by their respective talent types .
        for( int i=1 ; i <= childNumber ; i++){
            int talent = in.nextInt();
          if(talent==1){
              programmers.add(i);
          }
          else if(talent==2){
              mathematicians.add(i);
          }
          else{
              sportsmen.add(i);
          }
        }
        int maxTeams =  Math.min( (programmers.size()) , Math.min( (mathematicians.size()) , (sportsmen.size()) ) );
         System.out.println( maxTeams );
      // Construct and print the teams using parallel indexing .
      for( int i=0 ; i < maxTeams ; i++ ){
          System.out.println( programmers.get(i) +" "+ mathematicians.get(i) +" "+ sportsmen.get(i) );
      }
      in.close();
    }
}
