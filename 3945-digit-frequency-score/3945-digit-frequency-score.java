class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        if(n == 0)
            return 1;
        while(n > 0){
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        int score = 0;
        for(int i = 0; i < 10; i++){
            score = score+(i * freq[i]);
        }
        return score;
    }
}