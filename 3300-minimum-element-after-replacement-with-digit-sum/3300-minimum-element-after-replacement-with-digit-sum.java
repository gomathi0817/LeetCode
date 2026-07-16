class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;//largest possible num is taken and compared with digitsum
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            min = Math.min(min, digitSum);
        }
        return min;
    }
}
