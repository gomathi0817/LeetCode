class Solution {
    public int countBeautifulPairs(int[] nums) {
       int count=0;
       for(int i=0;i<nums.length;i++){

         int first=nums[i];

        while(first>=10){
            first/=10;
        }

        for(int j=i+1;j<nums.length;j++){

            int last=nums[j]%10;

            int a=first;
            int b=last;

            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            if(a==1){
                count++;
            }
        }
       }
       return count; 
    }
}