import java.util.Arrays;
class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            if((cost.length-1-i)%3!=2){
                //cost.length=3
                sum=sum+cost[i];
            }
        }
        return sum;
    }
}