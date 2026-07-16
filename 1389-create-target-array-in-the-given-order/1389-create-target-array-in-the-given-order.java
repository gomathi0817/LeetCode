class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList <Integer> result= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
               result.add (index[i],nums[i]);
        }
        int[] ans =new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}