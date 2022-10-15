package com.code;

import java.util.Arrays;

public class linearSearchUsingStrings {
    public static void main(String[] args) {
        String s = "Kiufheduefh";
        char target = 'e';
        System.out.println(search(s, target));
        System.out.println(Arrays.toString(s.toCharArray()));
    }
    static boolean search(String a, char tar){
        if(a.length()==0){
            return  false;
        }
        for (int i=0;i<a.length();i++){
            if(tar == a.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
