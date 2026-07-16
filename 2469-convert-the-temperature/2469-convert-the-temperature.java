class Solution {
    public double[] convertTemperature(double celsius) {
        double K=celsius+273.15;
        double F=(celsius*1.80+32.00);
        double[] Ans=new double[2];
        Ans[0]=K;
        Ans[1]=F;
        return Ans;
    }
}