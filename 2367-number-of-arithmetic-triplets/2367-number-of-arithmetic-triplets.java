class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        // Store all numbers
        for (int num : nums) {
            set.add(num);
        }
        int count = 0;
        // Check triplets
        for (int num : nums) {
            if (set.contains(num + diff) && set.contains(num + 2 * diff)) {
                count++;
            }
        }
        return count;
    }
}
//another method but not efficient
//public class Solution {
  //  public int arithmeticTriplets(int[] nums, int diff) {
    //    int count=0;
      //  for(int i=0;i<nums.length;i++){
        //    for(int j=0;j<nums.length;j++){
          //      for(int k=0;k<nums.length;k++){
            //        if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff){
              //          count++;
                //    }
                //}
            //}
        //}
        //return count;
    //}
//}