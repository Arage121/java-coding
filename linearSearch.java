package com.code;

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int[] sym = {23,45,56,76,354,54,-7,6,354,453};
           int tar = sc.nextInt();
           int ans = linearSearch(sym, tar);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }

        for(int index=0; index<arr.length; index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
