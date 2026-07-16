class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1){
            return false;
        } 
        int sum=1;
        int i;

        for(i=2;i<=num/i;i++){
            if(num%i==0){
                sum+=i;

                if(i!=num/i){
                    sum+=num/i;
                }
            }
        }
        if(i!=1 && sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}