import java.util.Scanner;
import java.util.HashSet;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  443A_Anton_and_Letters .
* Logic : Using a HashSet to store unique characters from the input string while filtering 
* out curly braces , commas , and spaces by checking if each character is between 'a' and 'z' .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        HashSet<Character> set=new HashSet<>();
        String inputLine=in.nextLine();
        for(int i=0;i<inputLine.length();i++){
            if(inputLine.charAt(i)>='a'&&inputLine.charAt(i)<='z'){
                set.add(inputLine.charAt(i));
            }
        }
        System.out.println(set.size());
      in.close();
    }
}
