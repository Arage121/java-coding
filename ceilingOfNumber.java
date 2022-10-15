package com.code;

public class ceilingOfNumber {

    public static void main(String[] args) {
       int arr[] = {2, 3, 5, 9, 14, 16, 17};
       int target = 15;
       int ans = Ceiling(arr, target);
        System.out.println(ans);
    }

         // return the index of smallest no >= target
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length-1]){            // if the target is already the greatest no. from all the elements in an array then how will this return greater than the target (as it doesn't exist)
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
