import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int counter=1;
        int numbermagnets=in.nextInt();
        String previous=in.next();
        for(int i=0;i<numbermagnets-1;i++){
            String current=in.next();
            if(!current.equals(previous)){
                 counter++;
                 previous=current;
             }
         }
      System.out.println(counter);
     }
  }
