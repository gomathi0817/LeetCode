class Solution {
    public int fib(int n) {
        int first=0;
        int sec=1;
        int nextnum=0;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }    
        for(int i=2;i<=n;i++){
            nextnum=first+sec;
            first=sec;
            sec=nextnum;
        } 
         return nextnum;       
    }
}