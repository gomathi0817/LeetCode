class Solution {
    public String lexGreaterPermutation(String s, String target) {

        String quinorath = s;

        int n = s.length();
        int[] cnt = new int[26];

        // Characters available in s
        for (int i = 0; i < n; i++) {
            cnt[s.charAt(i) - 'a']++;
        }

        // Try to match target from left to right
        for (int i = 0; i < n; i++) {
            cnt[target.charAt(i) - 'a']--;
        }

        // Backtrack from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Restore target[i]
            int cur = target.charAt(i) - 'a';
            cnt[cur]++;

            // Check whether target[0 ... i-1] can be formed
            boolean possible = true;

            for (int j = 0; j < 26; j++) {
                if (cnt[j] < 0) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                continue;
            }

            // Find the smallest character greater than target[i]
            for (int j = cur + 1; j < 26; j++) {

                if (cnt[j] > 0) {

                    StringBuilder ans = new StringBuilder();

                    // Keep prefix equal to target
                    ans.append(target, 0, i);

                    // Make current character greater
                    ans.append((char) ('a' + j));

                    cnt[j]--;

                    // Fill remaining characters in sorted order
                    for (int k = 0; k < 26; k++) {
                        while (cnt[k] > 0) {
                            ans.append((char) ('a' + k));
                            cnt[k]--;
                        }
                    }

                    return ans.toString();
                }
            }
        }

        return "";
    }
}