class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            int index = binarySearch(arr, target);
            if (index != -1) {
                return true;
            }
        }
        return false;
    }

    public static int binarySearch(int[] arr,  int target) {
        int l = 0;
        int r = arr.length-1;
        while (l<=r) {
            int mid = (l+r)/2;
            int midVal = arr[mid];
            if (target < midVal) {
                r = mid-1;
            } else if (target > midVal) {
                l = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
