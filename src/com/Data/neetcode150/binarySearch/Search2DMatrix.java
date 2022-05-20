package com.Data.neetcode150.binarySearch;

public class Search2DMatrix {
    public static void main(String[] args) {
        int target = 3;
        //int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix = {{1,3}};
        System.out.println(searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        for(int j=0; j<matrix.length; j++){
            if(target >= matrix[j][0] && target <= matrix[j].length){
                return searchRow(j, target, matrix[j]);
            }
        }
        return false;
    }

    private static boolean searchRow(int j, int target, int[] matrix) {
        int n = matrix.length -1;
        int left = 0;

        while(left <= n){
            int mid = (n+left)/2;

            if(matrix[mid] == target) return true;
            else if(matrix[mid] < target){
                left = (mid+1);
            }else{
                n = mid -1;
            }
        }
        return false;
    }
}
