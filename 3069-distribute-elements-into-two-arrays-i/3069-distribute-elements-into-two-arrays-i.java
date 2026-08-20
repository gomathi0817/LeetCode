class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int size1 = 0;
        int size2 = 0;
        // First element → arr1
        arr1[size1++] = nums[0];
        // Second element → arr2
        arr2[size2++] = nums[1];
        // Distribute remaining elements
        for (int i = 2; i < n; i++) {
            if (arr1[size1 - 1] > arr2[size2 - 1]) {
                arr1[size1++] = nums[i];
            } 
            else {
                arr2[size2++] = nums[i];
            }
        }
        // Combine arr1 and arr2
        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < size1; i++) {
            result[k++] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            result[k++] = arr2[i];
        }
        return result;
    }
}