package com.code;

public class cocubes {
    public void printLeaders(int arr[], int n){
        for(int i=0; i<n; i++){
            int j;
            for( j=i+1; j<n; j++){
                if (arr[i] <= arr[j])
                    break;
                }if (j == n){
                System.out.print(arr[i] + " ");
                }
            }
        }


    public static void main(String[] args) {
        cocubes co = new cocubes();
        int[] arr = {16, 19, 4, 3, 8, 3};
        int n = arr.length;
        co.printLeaders(arr, n);
    }
}
