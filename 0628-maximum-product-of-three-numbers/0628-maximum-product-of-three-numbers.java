class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int k=nums.length;
        int prod=nums[k-1]*nums[k-2]*nums[k-3];
        int prod1=nums[0]*nums[1]*nums[k-1];
        return Math.max(prod,prod1);
    }
}