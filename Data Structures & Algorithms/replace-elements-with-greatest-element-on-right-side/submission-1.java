class Solution {
    public int[] replaceElements(int[] arr) {
        int currentMax = -1;
        int currVal = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            currVal = arr[i];
            arr[i] = currentMax;
            currentMax = currentMax > currVal ? currentMax : currVal;
        }
        return arr;        
    }
}