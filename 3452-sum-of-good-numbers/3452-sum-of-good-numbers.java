class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean good = true;
            // Check left side
            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                good = false;
            }
            // Check right side
            if (i + k < n && nums[i] <= nums[i + k]) {
                good = false;
            }
            if (good) {
                sum += nums[i];
            }
        }
        return sum;
    }
}