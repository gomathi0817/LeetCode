class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;

        int sum = 0;

        // Prefix sum of entire array
        for (int stone : stones) {
            sum += stone;
        }

        int best = sum;

        // Work backwards
        for (int i = n - 2; i >= 1; i--) {
            sum -= stones[i + 1];

            best = Math.max(best, sum - best);
        }

        return best;
    }
}