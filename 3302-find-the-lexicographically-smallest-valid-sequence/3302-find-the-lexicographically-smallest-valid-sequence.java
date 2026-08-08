class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        // suffix[i] = number of characters of word2
        // that can be matched starting from word1[i]
        int[] suffix = new int[n + 1];

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {

            suffix[i] = suffix[i + 1];

            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                suffix[i]++;
                j--;
            }
        }

        int[] ans = new int[m];

        int index = 0;
        boolean mismatchUsed = false;

        for (int i = 0; i < m; i++) {

            boolean found = false;

            while (index < n) {

                // Matching character
                if (word1.charAt(index) == word2.charAt(i)) {

                    ans[i] = index;
                    index++;
                    found = true;
                    break;
                }

                // Use the one allowed mismatch
                if (!mismatchUsed) {

                    int remaining = m - i - 1;

                    // Check whether remaining characters
                    // can be matched after this index
                    if (suffix[index + 1] >= remaining) {

                        ans[i] = index;
                        index++;
                        mismatchUsed = true;
                        found = true;
                        break;
                    }
                }

                index++;
            }

            if (!found) {
                return new int[0];
            }
        }

        return ans;
    }
}