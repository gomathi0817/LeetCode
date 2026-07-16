class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){//using list to access the length use nums.size()
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){//using list to access an element in the list use the key word "get"
                    count++;
                }
            }
        }
        return count;
    }
}