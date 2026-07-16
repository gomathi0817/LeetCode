class Solution {
    public int findGCD(int[] nums) {
        int large=Integer.MAX_VALUE;
        int small=Integer.MIN_VALUE;
        for(int num:nums){//for(int i=0;i<=nums.length;num++){ int num=nums[i];}
            if(num>small){
                small=num;
            }
            if(num<large){
                large=num;
            }
        }
        while(small!=0){
                int temp=small;
                small=large%small;
                large=temp;
            }
        return large;
    }
}