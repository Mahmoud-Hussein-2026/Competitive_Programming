import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  118A _ String_task .
* Logic : Filter the string by removing vowels (a, o, y, e, u, i),converting consonants to lowercase,and prepending a dot '.' to each remaining character .
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String word=in.next();
     int length=word.length();
         word=word.toLowerCase();
     for(int i=0;i<length;i++){
         if(word.charAt(i)!='a'&&word.charAt(i)!='e'&&word.charAt(i)!='i'&&word.charAt(i)!='o'&&word.charAt(i)!='u'&&word.charAt(i)!='y'){
             System.out.print("."+word.charAt(i));
         }
     }
      in.close();
    }
}
