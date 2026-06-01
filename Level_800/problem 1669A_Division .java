import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  1669A - Division? .
* Logic : Categorize each given rating into its corresponding division based on specific range boundaries.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCases =in.nextInt();
        for(int i=0;i<testCases;i++){
            int rating=in.nextInt();
            if(rating>=1900)
            System.out.println("Division 1");
            else if(1600<=rating && rating<=1899)
            System.out.println("Division 2");
            else if(1400<=rating && rating<=1599)
            System.out.println("Division 3");
            else 
            System.out.println("Division 4");
        }
      in.close();
    }
}
