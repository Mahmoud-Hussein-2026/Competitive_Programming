import java.util.Scanner;
/*

*/
public class Main{
    public static void main(String[]args){
     Scanner in=new Scanner(System.in);
        int[][] arr=new int[5][5];
        for(int a=0;a<5;a++){
            for(int b=0;b<5;b++){
                arr[a][b]=in.nextInt();
            }
        }
        int s=0;
        int c=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arr[i][j]==1){
                  s=Math.abs(i-2);
                  c=Math.abs(j-2);
                }
                
            }
        }
     System.out.println(s+c);
    }
}
