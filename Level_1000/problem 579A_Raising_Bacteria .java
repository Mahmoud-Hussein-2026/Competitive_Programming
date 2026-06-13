import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem : 579A - Raising Bacteria .
* Logic : 
* Site : Codeforces .
*/
public class Main{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int targetBacteria = in.nextInt();
int result = Integer.bitCount(targetBacteria);
System.out.println(result);
  in.close();
    }
  }
