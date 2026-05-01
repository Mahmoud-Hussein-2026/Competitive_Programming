import java.util.Scanner;
/*
* Author : Mahmoud Hussein .
* Univercity : Damascus Univercity .
* Broblem : 546A_ soldier and bananas.
* this program calculates the amount of money a soldier needs to borrow
* to buy a certain number of bananas .
*/  
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter price of the first banana : ");
        int banana_price = in.nextInt();
        System.out.println("please enter your amount of money : ");
        int initial_money =in.nextInt();
        System.out.println("please enter number of bananas : ");
        int total_bananas =in.nextInt();
        long s=0;
        for(int i=1;i<=total_bananas;i++){
            s+=banana_price*i;
        }
        if(s > initial_money){
     System.out.println("the amount of money to borrow is : " + (s-initial_money));
        }
        else {
         System.out.println("you have enough money you dont need to borrow ! ");
        }
      in.close();
    }
}
