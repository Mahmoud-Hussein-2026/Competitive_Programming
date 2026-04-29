import java.util.Scanner;
/*

*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        double s=0;
        for(int i=0;i<num;i++){
            int m=in.nextInt();
            s+=m;
        }
        System.out.println(s/num);
      in.close();
    }
}
