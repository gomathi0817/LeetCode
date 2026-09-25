class Solution {
    public int largestInteger(int num, int sum) {
        if (sum > num * 9) {
            return -1;
        }
        int ans = 0;
        for (int i = 0; i < num; i++) {
            if (sum >= 9) {
                ans = ans * 10 + 9;
                sum -= 9;
            } else {
                ans = ans * 10 + sum;
                sum = 0;
            }
        }
        return ans;
    }
}