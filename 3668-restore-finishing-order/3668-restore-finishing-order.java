class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=order.length;
        int m=friends.length;
        int [] ans=new int[m];
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(order[i]==friends[j]){
                    ans [index]=order[i];
                    index++;
                    break;
                }
            }
        }
        return ans;
    }
}