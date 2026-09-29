class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int sum=0;
        int mul=1;
       while(n>0){
        int digit=n%10;
        sum=sum+digit;
        mul=mul*digit;
        n/=10;
       } 
       int dup=sum+mul;
       if(original%dup==0){
        return true;
       }
       else{
        return false;
       }
    }
}