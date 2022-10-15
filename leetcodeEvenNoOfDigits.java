package com.code;

public class leetcodeEvenNoOfDigits {
    public static void main(String[] args) {
    int nums[] = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static  int findNumbers(int[] nums){
     int count =0;
        for (int num:nums) {
             if(even(num)) {
                 count++;
             }
        }
        return count;
    }
    //function to check whether it contains an even digit or not
    static boolean even(int num) {
        int numOfDigits = digits(num);
      return numOfDigits%2 == 0;
    }
    //count number of digits in a number
    static  int digits(int num){
       int count = 0;

       if(num<0){
           num = num*-1;
       }

       if(num==0){
           num=1;
       }

       while(num > 0){
        count++;
        num = num/10;
       }
       return count;
    }
}
