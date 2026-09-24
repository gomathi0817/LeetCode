class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int reverseValue = 'z' - ch + 1;
            //122-ASCII VALUE of ch +1
            //Ex:
            //   122-a+1=>122-97+1=>26
            //   122-z+1=>122-122+1=>1
            sum = sum + reverseValue * (i + 1);
        }
        return sum;
    }
}