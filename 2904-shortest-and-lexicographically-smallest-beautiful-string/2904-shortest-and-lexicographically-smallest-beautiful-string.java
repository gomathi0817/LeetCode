class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();
        int left = 0;
        int ones = 0;

        String ans = "";

        for (int right = 0; right < n; right++) {

            // Add current character
            if (s.charAt(right) == '1') {
                ones++;
            }

            // More than k ones
            while (ones > k) {
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }

            // Exactly k ones
            if (ones == k) {

                // Remove unnecessary leading zeros
                while (s.charAt(left) == '0') {
                    left++;
                }

                String curr = s.substring(left, right + 1);

                // Choose shortest
                if (ans.equals("")
                        || curr.length() < ans.length()
                        || (curr.length() == ans.length()
                            && curr.compareTo(ans) < 0)) {

                    ans = curr;
                }
            }
        }

        return ans;
    }
}