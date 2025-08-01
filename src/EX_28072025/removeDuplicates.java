package EX_28072025;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class removeDuplicates {

    public static void main(String[] args) {

        String input = "Vamshi Krishna";
        String output = "";

     StringBuilder sb = new StringBuilder(input);
     for (int i =0; i<sb.length();i++){
         for(int j =0; j<sb.length();j++){
             if(sb.charAt(i) == sb.charAt(j)){
                 sb.deleteCharAt(i);
             }
         }
     }

        System.out.println("Results :"+sb);


    }


}
