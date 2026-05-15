import java.util.Scanner;
/*
* University : Damascus University .
* Faculty : Informatics Engineering .
* Author : Mahmoud Hussein .
* problem :  208A - Dubstep .
* Logic : Restore the original song by removing "WUB" noise and normalizing spaces between words.
* Site : Codeforces .
*/
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String inputSong=in.next();
      // Replace "WUB" with space; note that "WUB" can appear multiple times.
         inputSong= inputSong.replace("WUB"," ");
      // Collapse multiple spaces into one using Regex (\s+ matches one or more whitespaces).
       inputSong = inputSong.replaceAll("\\s+"," ");
      // Remove extra spaces from the beginning and end.
    inputSong= inputSong.trim();
    System.out.println(inputSong);
      in.close();
}
}
