//region Matches
import java.io.*;
public class q9 {

   public static void main(String args[]) {
      String Str1 = new String("How are You?");
      String Str2 = new String("are");


      System.out.print("Return Value :" );
      System.out.println(Str1.regionMatches(4, Str2, 0, 4));

  
   }
}
