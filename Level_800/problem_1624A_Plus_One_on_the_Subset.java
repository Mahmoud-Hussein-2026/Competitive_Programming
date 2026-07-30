import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* problem : 1624A - Plus One on the Subset .
* Logic : The minimum operations to make all elements equal is simply the difference
* between the maximum and minimum values in the array (max - min).
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while (testCases-- > 0){
                int n = in.nextInt();
                int minValue = 1000000001;
                int maxValue = 0;
                for(int i=0 ; i<n ; i++){
                int currentValue = in.nextInt();
                if(currentValue < minValue){
                minValue = currentValue;
                }
                if(currentValue > maxValue){
                maxValue = currentValue;
                }
                }
                System.out.println(maxValue-minValue);
            }
        in.close();
    }
}
