class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            int count = 1;
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                } 
                else {
                    break;
                }
            }
            if(count > n / 2){
                return nums[i];
            }
        }
        return nums[0];
    }
}