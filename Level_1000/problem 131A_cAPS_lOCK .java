import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  131A - cAPS lOCK .
* Logic : Check if the word is accidentally typed with Caps Lock. 
* This happens in two cases:
* 1. The word contains only uppercase letters.
* 2. All letters except the first one are uppercase.
* If either case is true, we reverse the case of all letters in the word.
* Otherwise, we leave the word unchanged. .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String t=in.next();
        int count=0;
        for(int i=1;i<t.length();i++){
            if(Character.isUpperCase(t.charAt(i))){
                count++;
            }
        }
        if(count==t.length()-1){
            if(Character.isUpperCase(t.charAt(0))){
                System.out.println(t.toLowerCase());
            }
            else{
                System.out.print(Character.toUpperCase(t.charAt(0)));
                for(int j=1;j<t.length();j++){
                    System.out.print(Character.toLowerCase(t.charAt(j)));
                }
            }
        }
        else{
            System.out.println(t);
        }
      in.close();
    }
}
