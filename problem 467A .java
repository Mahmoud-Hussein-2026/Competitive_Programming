import java.util.Scanner;
/*
* this program determines how many dormitory rooms are available for George and Alix .
* it calculates the difference between total capacity and current occupancy to find 
* rooms with at least two vacant spaces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int number_of_rooms=in.nextInt();
      //in varible : represents the total number of rooms to chec .
        int counter=0;
        for(int i=0;i<number_of_rooms;i++){
            int p=in.nextInt();
          //in varible p : current residents .
            int q=in.nextInt();
          //in varible p : total room capacity  .
            if(q-p>=2){
                counter++;
            }
            
        }
        System.out.println("total suitable rooms : "+counter);
    }
}
