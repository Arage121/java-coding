package com.code;

import java.util.Arrays;

public class twodarraybinarysearch {
    public static void main(String[] args) {
    int [][] arr = {
            {12,32,34,54},
            {67,78,79,89},
            {4,5,6,7}
    };

        System.out.println(Arrays.toString(search(arr, 79)));
    }

    static int[] search(int[][] matrix, int target){
    int r = 0;
    int c = matrix.length-1;

    while(r < matrix.length && c >= 0){
     if(matrix[r][c] == target){
         return new int[]{r, c};
     }
     if(matrix[r][c] < target){
      r++;
     }else {    // if(matrix[r][c] > target)
         c--;
     }
    }
    return new int[]{-1, -1};
    }
}
