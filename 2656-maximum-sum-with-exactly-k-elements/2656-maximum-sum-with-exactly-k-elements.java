class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num>max){
                max=num;
            }
        }
        return  k * max + (k * (k - 1)) / 2;
    }
}