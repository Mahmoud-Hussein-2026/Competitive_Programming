import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1878A - How Much Does Daytona Cost? .
* Logic : The problem asks if 'k' can be the most frequent element in any subsegment.
* Strategically,if we choose a subsegment of length 1 containing only 'k',
* then 'k' is automatically the most frequent. Therefore, the problem simplifies to checking if 'k' exists anywhere in the array.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int i=0;i<testCases;i++){
            int n = in.nextInt();
            int k = in.nextInt();
            int []array = new int[n];
            for(int j=0;j<n;j++){
                array[j] = in.nextInt();
            }
            boolean f = false;
            for(int m=0;m<n;m++){
                if(array[m]==k){
                    f = true;
                    break;
                }
            }
                if(f)
                System.out.println("YES");
                else
                System.out.println("NO");
        }
      in.close();
    }
}
