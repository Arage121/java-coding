package com.code;

public class printusingStringbuilder {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i); // here we add two strings so that the output will be greater a+1 = b
            b.append(ch); // here we concatenate two char using + symbol
        }
        System.out.println(b.toString());
    }
}
