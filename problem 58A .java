import java.util.Scanner;
public class Main{
    public static void main(String[]args){
     Scanner in=new Scanner(System.in);
     String n=in.next();
     String g="hello";
     int s=n.length();
     int d=0;
     for(int i=0;i<s;i++){
         if(n.charAt(i)==g.charAt(d)){
             d++;
         }
         if(d==5){
             System.out.println("YES");
           return;
         }
     }
         
             System.out.println("NO");
         
}
}
