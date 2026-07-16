class Solution {
    public int missingNumber(int[] nums) { 
        int n=nums.length;
        int sum=0;
        int sum1=(n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int missing=sum1-sum;
        return missing;
    }
}