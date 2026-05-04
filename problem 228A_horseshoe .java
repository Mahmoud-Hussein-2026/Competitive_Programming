import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
     HashSet<Integer> set=new HashSet<>();
     int s1=in.nextInt();
     int s2=in.nextInt();
     int s3=in.nextInt();
     int s4=in.nextInt();
     set.add(s1);
      set.add(s2);
       set.add(s3);
        set.add(s4);
       int result=4-set.size();
       System.out.println(result);
    }
}
