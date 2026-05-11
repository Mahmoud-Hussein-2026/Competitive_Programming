import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  41A - Translation .
* Logic : Check if the first word is the mirror image of the second by comparing characters from opposite ends .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int len1=s1.length();
        int len2=s2.length();
        boolean isReverse=true;
        if(len2!=len1){
            System.out.println("NO");
            return;
        }
        else{
        for(int i=0;i<len1;i++){
           if(s1.charAt(i)!=s2.charAt(len1-i-1)){
              isReverse=false;
              break;
           }
        }
        }
        if(isReverse){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        in.close();
    }
}
