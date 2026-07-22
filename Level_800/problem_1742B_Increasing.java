import java.util.Scanner;
import java.util.HashSet;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1742B - Increasing .
* Logic : Check if all array elements are unique using a HashSet; if unique count equals array length output YES, else NO.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            while (testCases-- > 0){
                int arraySize = in.nextInt();
                HashSet <Integer> uniqueNumbers = new HashSet<>();
                for(int i=0 ; i<arraySize ; i++){
                    uniqueNumbers.add(in.nextInt());
                }
              // If set size matches original size, no duplicates exist
                if( uniqueNumbers.size() == arraySize ){
                System.out.println("YES");
                }
                else{
                System.out.println("NO");
                }
            }
        in.close();
    }
}
