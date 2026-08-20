class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        // Case 1: k == 1
        if (k == 1) {
            int[] count = new int[51];
            for (int num : nums) {
                count[num]++;
            }
            int ans = -1;
            for (int num : nums) {
                if (count[num] == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }
        // Case 2: k == n
        if (k == n) {
            int max = 0;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        // Case 3: 1 < k < n
        int[] count = new int[51];
        for (int num : nums) {
            count[num]++;
        }
        int ans = -1;
        // Only first and last elements can be almost missing
        if (count[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (count[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }
        return ans;
    }
}