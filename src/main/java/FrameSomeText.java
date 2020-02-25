import jdk.internal.jline.console.completer.StringsCompleter;

import java.util.Arrays;
import java.util.Scanner;

public class FrameSomeText {
     public static void frameText(String[] str){


         int maxLength = 0;
         for (int i = 0; i < str.length ; i++) {
             if(str[i].length() > maxLength){
                 maxLength = str[i].length();
             }
         }


         for (int i = 0; i < maxLength+4; i++) {
             System.out.print("*");



         }
         System.out.println();

         int X = 0;
         for (int j = 0; j < str.length ; j++) {

             System.out.print("* " + str[j]);

              X = maxLength - str[j].length()+1;
             for (int i = 0; i < X; i++) {
                 System.out.print(" ");
             }


                 System.out.println("*");

         }


         for (int f = 0; f < maxLength+4; f++) {
             System.out.print("*");

         }
         }

    public static void main(String[] str) {
         String [] Str = {"Write" , "Good" , "Code" , "Every" , "Day"};
        frameText(Str);



    }
}
