import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  785A - Anton and Polyhedrons .
* Logic :  Calculating the total number of faces by iterating through 'n' polyhedrons and adding the corresponding face count ;
* for each shape (Tetrahedron: 4, Cube: 6, Octahedron: 8, Dodecahedron: 12, Icosahedron: 20) using a series of string comparisons.
* Site : Codeforces .
*/
public class Main {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     in.nextLine();
      // Consume the remaining newLine character to avoid input issues .
     long sum = 0;
     for(int i=0;i<n;i++){
         String s=in.next();
      // Compare the input string with known polyhedron names to determine face count .
         if(s.equals("Tetrahedron")){
             sum+=4;
         }
         else if(s.equals("Cube")){
             sum+=6;
         }
         else if(s.equals("Octahedron")){
             sum+=8;
         }
         else if(s.equals("Dodecahedron")){
             sum+=12;
         }
          else if(s.equals("Icosahedron")){
             sum+=20;
         }
     }
     System.out.println(sum);
    }
}
