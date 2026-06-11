import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 32B - Borze .
* Logic : Logic: The Borze alphabet encodes digits into dots and dashes: . is 0, -. is 1, and -- is 2.
* The solution iterates through the string. If the current character is a dot ., it immediately prints 0. If it's a dash -,
* it checks the next character: if the next is ., it prints 1, otherwise it prints 2.
* In both dash cases, the index i is manually incremented (i++) to skip processing the second character of the pair.
* Site : Codeforces .
*/
public class Main{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
String str = in.next();
for(int i=0;i<str.length();i++){
    if(str.charAt(i)=='.'){
        System.out.print(0);
    }
    else{
        if(str.charAt(i+1)=='.'){
            System.out.print(1);
            i++;
        }
        else{
            System.out.print(2);
            i++;
        }
    }
      }
  in.close();
    }
}
