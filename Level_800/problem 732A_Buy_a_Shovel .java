import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  732A - Buy a Shovel .
* Logic:Find minimum shovels to pay without change;Stop if totalPrice % 10 == 0 or totalPrice % 10 == changeCoin. 
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int shovelPrice =in.nextInt();
        int changeCoin =in.nextInt();
       int i=1;
       while(true){
           int totalPrice=i*shovelPrice;
           if(totalPrice%10==0||totalPrice%10==changeCoin){
              System.out.println(i);
              break;
           }
               i++;
       }
        in.close();
    }
}
