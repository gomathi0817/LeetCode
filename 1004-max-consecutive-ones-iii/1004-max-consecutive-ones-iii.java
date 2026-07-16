class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int i;int j;
        int n=nums.length;
        for(i=0;i<n;i++){
            int zerocount=0;
            for(j=i;j<n;j++){
                if(nums[j]==0){
                    zerocount++;
                }
                if(zerocount>k){
                    break;
                }
            }
            max=Math.max(max,j-i);
        }
        return max;
    }
}