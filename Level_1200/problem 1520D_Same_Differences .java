import java.util.Scanner;
import java.util.HashMap;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 1520D - Same Differences .
* Logic : Transforms the condition (a[j] - a[i] = j - i) to (a[j] - j = a[i] - i) and uses a HashMap to count valid pairs in O(n) time.
* Site : Codeforces .
*/
  public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
          int testCases = in.nextInt();
       for( int i=0 ; i<testCases ; i++ ){
           HashMap <Integer , Integer> map = new HashMap<>();
           long result = 0 ;
           int arraySize = in.nextInt();
           for( int j=0 ; j < arraySize ; j++ ){
               int currentValue = in.nextInt();
               int transformedValue = currentValue - j ;
             // If this transformed value exists, it forms valid pairs with all its previous occurrences
               if(map.containsKey(transformedValue)){
                   result += map.get(transformedValue);
               }
             // Update the frequency of the transformed value in the map
               map.put(transformedValue , map.getOrDefault(transformedValue , 0) + 1);
           }
    System.out.println(result);
    }
      in.close();
  }
  }
