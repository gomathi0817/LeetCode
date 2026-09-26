import java.util.Arrays;
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        int n=piles.length/3;
        int k=piles.length-2;
        while(n>0){
            sum+=piles[k];
            k=k-2;
            n--;
        }
        return sum;
    }
}