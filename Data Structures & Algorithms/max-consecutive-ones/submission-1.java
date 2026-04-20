class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int cnt = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 1) {
                cnt++;
            } else {
                result = result > cnt ? result : cnt;
                cnt = 0;
            }
        }
        return result > cnt ? result : cnt;
    }
}