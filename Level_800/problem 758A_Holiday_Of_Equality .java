import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 758A - Holiday Of Equality .
* Logic : Find the maximum wealth among all citizens.
* Then,calculate the total welfare needed by summing up the differences between this maximum value and each citizen's current wealth
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int totalCitizens = in.nextInt();
         int []totalWealth = new int[totalCitizens];
         int maxWealth = 0;
         for(int i=0;i<totalCitizens;i++){
             totalWealth[i] = in.nextInt();
             if(maxWealth<totalWealth[i]){
                 maxWealth=totalWealth[i];
             }
         }
         int result = 0;
          for(int i=0;i<totalCitizens;i++){
              result+=(maxWealth-totalWealth[i]);
          }
             System.out.println(result);
      in.close();
   }
}
