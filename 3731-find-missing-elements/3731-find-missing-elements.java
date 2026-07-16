class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        // Find min and max
        for (int num : nums) {
            if (num < min) {
                min = num;
            }    
            if (num > max) {
                max = num;
            }    
        }
        // Check missing numbers
        for (int i = min; i <= max; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(i);
            }
        }
        return result;
    }
}