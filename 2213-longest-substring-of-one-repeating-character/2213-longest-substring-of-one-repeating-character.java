class Solution {

    int n;
    int[] left, right, prefix, suffix, best;
    char[] s;

    public int[] longestRepeating(String str, String queryCharacters, int[] queryIndices) {

        s = str.toCharArray();
        n = s.length;

        left = new int[4 * n];
        right = new int[4 * n];
        prefix = new int[4 * n];
        suffix = new int[4 * n];
        best = new int[4 * n];

        // Build segment tree
        build(1, 0, n - 1);

        int[] ans = new int[queryIndices.length];

        // Process every query
        for (int i = 0; i < queryIndices.length; i++) {

            int index = queryIndices[i];

            // Change character
            s[index] = queryCharacters.charAt(i);

            // Update segment tree
            update(1, 0, n - 1, index);

            // Maximum repeating substring
            ans[i] = best[1];
        }

        return ans;
    }

    // Build segment tree
    void build(int node, int l, int r) {

        left[node] = l;
        right[node] = r;

        // Leaf node
        if (l == r) {
            prefix[node] = 1;
            suffix[node] = 1;
            best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        build(node * 2, l, mid);
        build(node * 2 + 1, mid + 1, r);

        merge(node);
    }

    // Update one position
    void update(int node, int l, int r, int index) {

        // Leaf node
        if (l == r) {
            prefix[node] = 1;
            suffix[node] = 1;
            best[node] = 1;
            return;
        }

        int mid = (l + r) / 2;

        if (index <= mid) {
            update(node * 2, l, mid, index);
        } else {
            update(node * 2 + 1, mid + 1, r, index);
        }

        merge(node);
    }

    // Merge two child nodes
    void merge(int node) {

        int leftNode = node * 2;
        int rightNode = node * 2 + 1;

        int l1 = left[leftNode];
        int r1 = right[leftNode];

        int l2 = left[rightNode];
        int r2 = right[rightNode];

        // Initially
        prefix[node] = prefix[leftNode];
        suffix[node] = suffix[rightNode];

        // Check boundary characters
        if (s[r1] == s[l2]) {

            // If entire left segment has same character
            if (prefix[leftNode] == r1 - l1 + 1) {
                prefix[node] += prefix[rightNode];
            }

            // If entire right segment has same character
            if (suffix[rightNode] == r2 - l2 + 1) {
                suffix[node] += suffix[leftNode];
            }

            // Best answer inside either child
            best[node] = Math.max(
                best[leftNode],
                best[rightNode]
            );

            // Best answer crossing the boundary
            best[node] = Math.max(
                best[node],
                suffix[leftNode] + prefix[rightNode]
            );

        } else {

            // No combination across boundary
            best[node] = Math.max(
                best[leftNode],
                best[rightNode]
            );
        }
    }
}