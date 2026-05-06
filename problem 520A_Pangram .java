import java.util.Scanner;
import java.util.HashSet;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 520A_Pangram .
* Logic : We convert the string to lowercase and add each character to a HashSet ;
* Since a HashSet only stores unique elements , if its size reaches 26 ;
* it means the sentence contains all englishe alphabet letters . 
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int textLength=in.nextInt();
        String sentence=in.next();
        sentence= sentence.toLowerCase();
        HashSet<Character> set = new HashSet<>();
      // HashSet is used to filter out dublicate characters .
        for(int i=0;i<textLength;i++){
            set.add(sentence.charAt(i));
        }
        if(set.size()==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");   
        }
      in.close();
    } 
}
