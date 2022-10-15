package com.code;

public class orderAgnosticBs {

    public static void main(String[] args) {
        int[] arr = {-12, -2, 0, 2, 5, 17, 19, 23, 44, 89};      //  ascending
        int target =44;
        int ans = OrderAgnosticBs(arr, target);
        System.out.println(ans);

        int[] arr2 = {99, 87, 78, 65, 45, 23, 12, -1, -2};       //  descending
        int tar = 87;
        int ans2 = OrderAgnosticBs(arr2, tar);
        System.out.println(ans2);
    }

    static int OrderAgnosticBs(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;             //returning index of the target when it is founded in the array
            }
            if(isAsc){               // for ascending order array values
                if(target<arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
            else{                   // for descending order array values
                if(target>arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

}
