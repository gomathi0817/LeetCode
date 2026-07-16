import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                result.add(nums[i]);
            }
        }
        return result;
    }
}