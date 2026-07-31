class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;//we can find the frequency of every letter from 'a' to 'z'
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {//in this we can se what is the ASCII value by minusing and through that we can find the frequency.
                return i;
            }
        }
        return -1;
    }
}