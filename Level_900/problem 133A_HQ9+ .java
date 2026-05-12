import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 133A _ HQ9+ .
* Logic : Iterate through the program string to check for instructions that produce output ('H','Q',or '9')
* If at least one is found,output YES;otherwise,output NO .
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
     Scanner in=new Scanner(System.in);
     String program=in.next();
     int length=program.length();
     boolean flag=false;
      // Scan the code for output_producing instructions .
     for(int i=0;i<length;i++){
         if(program.charAt(i)=='H'||program.charAt(i)=='Q'||program.charAt(i)=='9'){
            flag=true;
            break;
         }
     }
            if(flag){
             System.out.println("YES");
         }
         else{
             System.out.println("NO");
         }
    }
}
