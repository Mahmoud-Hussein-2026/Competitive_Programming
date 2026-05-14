import java.util.Scanner;
import java.util.HashMap;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  4C - Registration System .
* Logic : Since we have up to 10^5 requests, using a simple list would be too slow (O(n^2)).
* I used a HashMap to keep track of name occurrences in O(1) time. If a name exists,
* append its current count as a suffix and increment it; otherwise, I register it as "OK".
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
      // Store name frequencies for fast access .
     HashMap<String,Integer> map=new HashMap<>();
     for(int i=0;i<n;i++){
         String request=in.next();
             if(map.containsKey(request)){
               // Already taken: append suffix and update count .
                 int count=map.get(request);
                 System.out.println(request+count);
                 map.put(request,count+1);
             }
             else{
               // New user: register and set count to 1 .
                 System.out.println("OK");
                  map.put(request,1);
             }
     }
      in.close();
    }
}
