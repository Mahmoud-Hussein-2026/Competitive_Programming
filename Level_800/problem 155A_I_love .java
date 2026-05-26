import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  155A - I_love_\%username\% .
* Logic : Track the historical maximum and minimum scores. For the first contest (i == 0),we initialize both 'max' and 'min' with the first score.
* For subsequent contests (i > 0),if the current score breaks the maximum or minimum record, we update the record and increment the count.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int totalContest =in.nextInt();
        int count = 0;
        int max=-1;
        int min=100001;
        for(int i=0;i<totalContest;i++){
            int currentScore=in.nextInt();
            if(i==0){
            max=currentScore;
            min=currentScore;
            }
            if(i>0){
            if(currentScore<min){
                min=currentScore;
                count++;
            }
            if(currentScore>max){
                max=currentScore;
                count++;
            }
            }
        }
        System.out.println(count);
      in.close();
    }
}
