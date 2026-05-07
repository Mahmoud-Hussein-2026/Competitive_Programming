import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 266B_Queue at the School .
* Logic : Simulates a queue where boys (B) move behind girls (G) every second .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
     Scanner in=new Scanner(System.in);
     int numberOfChildren=in.nextInt();
     int seconds=in.nextInt();
     String initialQueue=in.next();
     char[]arr=initialQueue.toCharArray();
     for(int i=0;i<seconds;i++){
         for(int j=0;j<numberOfChildren-1;j++){
         if(arr[j]=='B'&&arr[j+1]=='G'){
             char c=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=c;
             j++;
         }
         }
     }
     System.out.println(arr);
      in.close();
    }
}
