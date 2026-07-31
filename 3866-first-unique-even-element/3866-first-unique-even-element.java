class Solution {
    public int firstUniqueEven(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int freq=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                freq++;
                }
            }
            if(freq==1&&nums[i]%2==0){
                return nums[i];
            }
        }
      return -1;  
    }
}