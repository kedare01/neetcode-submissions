class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (indices.containsKey(target-nums[i]) && i!= indices.get(target-nums[i])) {
                return new int[] {Math.min(i, indices.get(target-nums[i])), Math.max(i, indices.get(target-nums[i]))};
            }
        }
        return new int[]{0};
    }
}
