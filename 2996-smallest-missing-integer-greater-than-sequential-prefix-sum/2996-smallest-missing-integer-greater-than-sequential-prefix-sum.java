import java.util.*;

class Solution {
    public int missingInteger(int[] nums) {
        // Find sequential prefix sum
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        // Find the smallest missing integer >= sum
        for (int num : nums) {
            if (num == sum) {
                sum++;
            }
        }
        return sum;
    }
}