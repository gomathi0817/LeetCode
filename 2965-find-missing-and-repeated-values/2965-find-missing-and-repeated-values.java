class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int N=n*n;
        long sum=0;//R=sum
        long sqsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val=grid[i][j];
                sum+=val;
                sqsum+=(long)val*val;
            }
        }
        long expectedsum=(long)N*(N+1)/2;//M=expectedsum
        long expectedsqsum=(long)N*(N+1)*(2*N+1)/6;

        long diff=sum-expectedsum;   //R-M
        long sqdiff=sqsum-expectedsqsum; //R2-M2
        //R2-M2=(R-M)(R+M)
        //R+M=sqdiff/diff

        long sumRM=sqdiff/diff;
        int repeating=(int)(diff+sumRM)/2;
        int missing=(int)sumRM-repeating;

        return new int[]{repeating,missing};
    }
}