package com.code;

import java.util.*;

public class printalphabetsusingString {
    public static void main(String[] args) {
       /* String series = "";
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i); // here we add two strings so that the output will be greater a+1 = b
            series = series + ch; // here we concatenate two char using + symbol
        }
        System.out.println(series);
    }
}*/

        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        pattern(j);

    }
    static void pattern(int j){

        for(int i=1; i<=2*j ; i++){       // row
            int tci = i>j ? 2*j-i : i;
            int spaces = j - tci;
            for(int a =0;a<spaces; a++ ){
                System.out.println(" ");
            }
            for(int e=1; e<=tci ; e++){  // col
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
