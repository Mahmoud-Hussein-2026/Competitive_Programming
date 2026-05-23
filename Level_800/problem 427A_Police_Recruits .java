import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  427A - Police Recruits .
* Logic : Simulate events chronologically. Positive numbers recruit officers; 
* while -1 represents a crime, Crimes decrease available officers if any exist; 
* otherwise, they increment the untreated crimes counter.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int crimesNumber=0;
        int policeNum=0;
        for(int i=0;i<n;i++){
            int num =in.nextInt();
            if(num>0)
            policeNum+=num;
            else{
                if(policeNum>0){
                    policeNum--;
                }
                else{
                    crimesNumber++;
                }
            }
            
    }
    System.out.println(crimesNumber);
      in.close();
}
}
