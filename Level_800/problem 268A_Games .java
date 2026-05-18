/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  268A - Games .
* Logic : Counts how many times the host team has to wear their guest uniform.
* This happens when the home uniform color of the host team matches the guest uniform color of the visiting team.
* It uses a brute-force approach with nested loops O(n^2) to compare every pair of teams, ensuring a team does not play against itself (i \neq j). .
* Site : Codeforces .
*/
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int home[] = new int[n];
        int guest[] = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            home[i] = in.nextInt();
            guest[i] =in.nextInt();
        }
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i!=j){
            if(home[i]==guest[j]){
                count++;
            }
            }
        }
        }
         System.out.println(count);   
      in.close();
    }
}
