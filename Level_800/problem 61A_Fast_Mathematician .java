import java.util.Scanner;
/*
* Problem : 61A - Ultra-Fast Mathematician
* Site : Codeforces.
* Logic : compare corresponding bits : output '0' if identical , '1' if different .
* Auther : Mahmoud Hussein .
* Univercity Damascus .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String number1=in.next();
        String number2=in.next();
        for(int i=0;i<number1.length();i++){
           if(number1.charAt(i)==number2.charAt(i)){
            System.out.print("0");
           }
           else{
              System.out.print("1");
           }
        }
        System.out.println();
      in.close();
    }
}
