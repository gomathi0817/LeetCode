class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            elesum=elesum+nums[i];
            int num=nums[i];
            while(num>0){
                int digit=num% 10;
                num/=10;
                digitsum=digit+digitsum;
            }
        }
        int sum=elesum-digitsum;
        return sum;
    }
}