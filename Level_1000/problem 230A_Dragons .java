import java.util.Scanner;
import java.util.Arrays;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 230A - Dragons .
* Logic : Greedy approach;Sort dragons by strength in ascending order.
* Defeat weaker dragons first to accumulate bonuses and defeat stronger ones.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int [][]dragons=new int[n][2];
        for(int i=0;i<n;i++){
                dragons[i][0]=in.nextInt();
                dragons[i][1]=in.nextInt();
        }
      // Sort dragons ascendingly based on their strength (column 0) .
        Arrays.sort(dragons,(a,b) -> Integer.compare(a[0],b[0]));
        boolean f=true;
      // Fight dragons from weakest to strongest.
        for(int j=0;j<n;j++){
            if(s>dragons[j][0]){
              // Earn bonus strength.
                s+=dragons[j][1];
                f=true;
            }
            else{
                f=false;
                break;
            }
        }
        if(f){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
      in.close();
    }
}
